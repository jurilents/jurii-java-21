<%@ page import="org.obrii.mit.dp2021.jurilents.laba2.clubs.IClub" %>
<%@ page import="org.obrii.mit.dp2021.jurilents.laba2.SchoolProcessor" %>
<%@ page import="org.obrii.mit.dp2021.jurilents.laba2.students.IStudent" %>
<%@ page import="java.util.Collection" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.stream.Collectors" %>
<%@ page import="static java.util.stream.Collectors.toCollection" %>
<%@ page contentType="text/html" pageEncoding="UTF-8" %>
<html>
<head>
    <meta http-equiv="content-type" content="text/html; charset=UTF-8">
    <title>Simulate a student's day!</title>
    <link href="${pageContext.request.contextPath}/assets/css/common.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/assets/css/clubs.css" rel="stylesheet">
</head>
<body>
<% SchoolProcessor school = (SchoolProcessor) request.getAttribute("school"); %>

<main>
    <form action="${pageContext.request.contextPath}/Lab2/clubs" method="post" class="block">

        <h1 class="title">Simulate a student's day!</h1>

        <div id="list">

            <div id="list__wrapper">
                <div class="list__item">

                    <div class="round-button list__item-handle"></div>

                    <div class="list__item-input list__item-student">
                        <label for="student-name">Student</label>
                        <input type="text" name="students" id="student-name" class="text-input name-field">
                    </div>

                    <div class="list__item-input  list__item-club-wrapper">
                        <div class="select__wrapper select__club">
                            <label for="club-name" class="short-label">Visits</label>
                            <% ArrayList<IClub> clubs = school.getClubs(); %>
                            <select name="clubs" id="club-name">

                                <option value="<%= clubs.get(0).getId() %>">
                                    <%= clubs.get(0).getName() %>
                                </option>

                                <% for (IClub club : clubs) {%>
                                <option value="<%= club.getId() %>">
                                    <%= club.getName() %>
                                </option>
                                <% } %>
                            </select>
                        </div>
                    </div>
                    <button type="button" class="remove-item round-button round-button__font-button">-</button>
                </div>
            </div>

            <button type="button" id="add-item" class="round-button round-button__huge">+</button>
        </div>

        <button type="submit" class="submit">Start!</button>
    </form>

    <div class="block info-wrapper">
        <h2 class="title">Students List</h2>
        <p>ᓚᘏᗢ <b>Please, select student names only from this list</b> ᓚᘏᗢ
            <br><br>just click on the name!
        </p>
        <% ArrayList<IStudent> students = school.getStudents(); %>

        <div class="names-wrapper">
            <ul id="sturend-names" class="left-col">
                <% String prevRole = ""; %>
                <% for (IStudent student : students) {%>
                <li>
                    <%= student.getName() %>
                </li>

                <% if (!student.getRole().equals(prevRole)) {
                    prevRole = student.getRole();
                %>
                <li class="space a-right"></li>
                <% }%>

                <% } %>
            </ul>

            <ul class="right-col">
                <% prevRole = ""; %>
                <% for (IStudent student : students) {%>
                <li>
                    <%= student.getRole() %>
                </li>

                <% if (!student.getRole().equals(prevRole)) {
                    prevRole = student.getRole();
                %>
                <li class="space a-left"></li>
                <% }%>

                <% } %>
            </ul>

        </div>
    </div>
</main>


<script src="${pageContext.request.contextPath}/assets/js/druggble.js"></script>
<script src="${pageContext.request.contextPath}/assets/js/clubs.js"></script>

</body>
</html>
