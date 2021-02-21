<%@ page import="org.obrii.mit.dp2021.jurilents.laba2.SchoolProcessor" %>
<%@ page import="org.obrii.mit.dp2021.jurilents.laba2.clubs.IClub" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Day-log</title>
</head>
<body>

<% SchoolProcessor school = (SchoolProcessor) request.getAttribute("school"); %>

<ul>
    <% String[] names = (String[]) request.getAttribute("students"); %>
    <% IClub[] clubs = (IClub[]) request.getAttribute("clubs"); %>

    <% for (int i = 0; i < names.length; i++) {%>
    <li>
        <%= school.generateNextDayFor(names[i], clubs[i]) %>
    </li>
    <% } %>
</ul>

<a href="${pageContext.request.contextPath}/Lab2">Go home</a><br>
<a href="${pageContext.request.contextPath}/Lab2/clubs">Retry</a><br>
<a href="${pageContext.request.contextPath}/Lab2/clubs?reset=1">Reset and retry</a><br>

</body>
</html>
