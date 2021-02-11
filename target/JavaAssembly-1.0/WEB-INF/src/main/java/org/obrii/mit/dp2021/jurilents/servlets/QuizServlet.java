package org.obrii.mit.dp2021.jurilents.servlets;


import org.obrii.mit.dp2021.jurilents.geoquiz.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "FormServlet", urlPatterns = {"/quiz"})
public class QuizServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("GET: /quiz");
//        QuizProvider.comparingValuesTest();
        
        request.getRequestDispatcher("pages/quiz.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("POST: /quiz");

        Country usersCountryData = Country.builder()
                .hasSeaLine(isChecked(request.getParameter("has-sealine")))
                .isInMountains(isChecked(request.getParameter("has-mountains")))
                .isInForest(isChecked(request.getParameter("has-forest")))
                .temperature(Temperature.valueOf(request.getParameter("temperature")))
                .evolutionLevel(Level.valueOf(request.getParameter("evolution-level")))
                .pollutionLevel(Level.valueOf(request.getParameter("pollution-level")))
                .size(Size.valueOf(request.getParameter("size")))
                .build();

        Country resultCountry = QuizProvider.findMostSimilar(usersCountryData);
        request.setAttribute("country", resultCountry);
        request.getRequestDispatcher("pages/result.jsp").forward(request, response);
    }


    @Override
    public String getServletInfo() {
        return "<FormServlet>";
    }

    private boolean isChecked(String value) {
        return value != null && (value.equals("on") || value.equals("checked"));
    }
}