package org.obrii.mit.dp2021.jurilents.servlets;

import org.obrii.mit.dp2021.jurilents.laba2.SchoolProcessor;
import org.obrii.mit.dp2021.jurilents.laba2.clubs.IClub;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Objects;

@WebServlet(name = "ClubsServlet", urlPatterns = {"/Lab2/clubs"})
public class ClubsServlet extends HttpServlet {

    private SchoolProcessor school = new SchoolProcessor();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("GET: /Lab2/clubs");

        // Just as example. On real project it could be performed by special
        // button or other event from frontend, not inside the index "GET" controller
        String reset = request.getParameter("reset");
        if (school == null || !Objects.equals(reset, "")) {
            school = new SchoolProcessor();
        }

        request.setAttribute("school", school);
        request.getRequestDispatcher("clubs.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("POST: /Lab2/clubs");

        String[] studentNames = request.getParameterValues("students");
        String[] studentClubs = request.getParameterValues("clubs");
        IClub[] clubs = new IClub[studentClubs.length];
        for (int i = 0; i < studentClubs.length; i++) {
            clubs[i] = school.getClub(studentClubs[i]);
        }

        request.setAttribute("students", studentNames);
        request.setAttribute("clubs", clubs);
        request.setAttribute("school", school);
        request.getRequestDispatcher("daylog.jsp").forward(request, response);
    }


    @Override
    public String getServletInfo() {
        return "<ClubsServlet>";
    }

}
