package org.obrii.mit.dp2021.jurilents.servlets;

import org.obrii.mit.dp2021.jurilents.laba3.data.IData;
import org.obrii.mit.dp2021.jurilents.laba3.data.ToDoTask;
import org.obrii.mit.dp2021.jurilents.laba3.db.Database;
import org.obrii.mit.dp2021.jurilents.laba3.db.TodosDatabase;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

@WebServlet(name = "FormServlet", urlPatterns = {"/form"})
public class FormServlet extends HttpServlet {

    // ====================================
    // | CRUD - Create-Read-Update-Delete |
    // ====================================

    private void sendForm(HttpServletRequest request, HttpServletResponse response, Database dbProvider) throws ServletException, IOException {
        String addCountString = request.getParameter("add");
        if (addCountString != null) {
            int count = Integer.parseInt(addCountString);
            dbProvider.generateData(count);
        }

        IData[] data = dbProvider.readAllData();
        String sortingKey = request.getParameter("sort");
        boolean reversed = request.getParameter("reversed") != null;

        if (sortingKey != null && data.length > 0 && data[0] instanceof ToDoTask) {
            switch (sortingKey) {
                case "id":
                    data = reversed
                            ? Arrays.stream(data).sorted((a, b) -> -(a.getId() - b.getId())).toArray(IData[]::new)
                            : Arrays.stream(data).sorted(Comparator.comparingInt(IData::getId)).toArray(IData[]::new);
                    break;
                case "task":
                    data = reversed
                            ? Arrays.stream(data).sorted((a, b) -> -((ToDoTask) a).getName().compareTo(((ToDoTask) b).getName())).toArray(IData[]::new)
                            : Arrays.stream(data).sorted(Comparator.comparing(a -> ((ToDoTask) a).getName())).toArray(IData[]::new);
                    break;
                case "status":
                    data = reversed
                            ? Arrays.stream(data).sorted((a, b) -> ((ToDoTask) a).isCompleted() == ((ToDoTask) b).isCompleted() ? 0 : 1).toArray(IData[]::new)
                            : Arrays.stream(data).sorted((a, b) -> ((ToDoTask) a).isCompleted() == ((ToDoTask) b).isCompleted() ? 1 : 0).toArray(IData[]::new);
                    break;
            }
        }
        System.out.println("len: " + data.length);
        request.setAttribute("todoData", data);

        request.getRequestDispatcher("pages/todoList.jsp").forward(request, response);
    }

    private void sendJSON(HttpServletRequest request, HttpServletResponse response, Map<String, String> json) throws IOException {
        StringBuilder stringifyJSON = new StringBuilder();
        stringifyJSON.append("{");
        json.forEach((key, val) -> stringifyJSON.append(String.format("\"%s\":\"%s\"", key, val)));
        stringifyJSON.append("}");

        try (PrintWriter out = response.getWriter()) {
            response.setContentType("application/json");
            response.setCharacterEncoding("UTF-8");
            out.print(stringifyJSON.toString());
        }
    }

    // Create data
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("form/POST");

        if (request.getParameter("opt") != null) {
            request.getRequestDispatcher("pages/todoAdd.jsp").forward(request, response);
        } else {
            TodosDatabase db = Database.getDatabase();
            db.createData(request);
            sendForm(request, response, db);
        }
    }

    // Read data
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String option = request.getParameter("opt");

        System.out.println("form/GET" + (option == null ? "" : " " + option));

        if (option != null && option.equals("create")) {
            request.getRequestDispatcher("pages/todoAdd.jsp").forward(request, response);
        } else {
            TodosDatabase db = Database.getDatabase();
            sendForm(request, response, db);
        }
    }

    // Update data
    @Override
    protected void doPut(HttpServletRequest request, HttpServletResponse response) throws IOException {
        System.out.println("form/PUT");

        TodosDatabase db = Database.getDatabase();
        db.updateData(request);

        Map<String, String> json = new HashMap<>();
        json.put("status", "200");
        sendJSON(request, response, json);
    }

    // Delete data
    @Override
    protected void doDelete(HttpServletRequest request, HttpServletResponse response) throws IOException {
        System.out.println("form/DELETE");
        TodosDatabase db = Database.getDatabase();
        db.deleteData(request);

        Map<String, String> json = new HashMap<>();
        json.put("status", "200");
        sendJSON(request, response, json);
    }

    @Override
    public String getServletInfo() {
        return "<Lab3FormServlet>";
    }

}
