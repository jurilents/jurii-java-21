package org.obrii.mit.dp2021.jurilents.servlets;

import org.obrii.mit.dp2021.jurilents.laba3.db.Database;
import org.obrii.mit.dp2021.jurilents.laba3.db.TodosDatabase;

import javax.json.Json;
import javax.json.JsonObject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "FormServlet", urlPatterns = {"/Lab3/form"})
public class FormServlet extends HttpServlet {

    // ================================
    // CRUD - Create-Read-Update-Delete
    // ================================

    private void displayForm(HttpServletRequest request, HttpServletResponse response, Database dbProvider) throws ServletException, IOException {
        request.setAttribute("todoData", dbProvider.readAllData());
        request.getRequestDispatcher("pages/form.jsp").forward(request, response);
    }

    private void sendJSON(HttpServletRequest request, HttpServletResponse response, JsonObject json) throws IOException {
        try (PrintWriter out = response.getWriter()) {
            response.setContentType("application/json");
            response.setCharacterEncoding("UTF-8");
            out.print(json.toString());
        }
    }

    // Create data
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        if (request.getParameter("opt") != null) {
            request.getRequestDispatcher("pages/todoAdd.jsp").forward(request, response);
        } else {
            TodosDatabase db = Database.getDatabase();
            db.createData(request);
            displayForm(request, response, db);
        }
    }

    // Read data
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        TodosDatabase db = Database.getDatabase();
        displayForm(request, response, db);
    }

    // Update data
    @Override
    protected void doPut(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        TodosDatabase db = Database.getDatabase();
        db.updateData(request);

        JsonObject json = Json.createObjectBuilder()
                .add("code", 200)
                .add("status", "success")
                .build();
        sendJSON(request, response, json);
    }

    // Delete data
    @Override
    protected void doDelete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        TodosDatabase db = Database.getDatabase();
        db.deleteData(request);

        JsonObject json = Json.createObjectBuilder()
                .add("code", 200)
                .add("status", "success")
                .build();
        sendJSON(request, response, json);
    }

    @Override
    public String getServletInfo() {
        return "<Lab3FormServlet>";
    }

}
