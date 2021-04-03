<%@ page import="org.obrii.mit.dp2021.jurilents.geoquiz.Country" %>
<%@ page contentType="text/html" pageEncoding="UTF-8" %>
<% Country data = (Country) request.getAttribute("country");%>
<html>
<head>
    <meta http-equiv="content-type" content="text/html; charset=UTF-8">
    <title><%=data.getName()%> - is your dream | QuiZz reZzult</title>
    <link href="${pageContext.request.contextPath}/assets/css/common.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/assets/css/result.css" rel="stylesheet">
</head>
<body>

<main>
    <img alt="" class="background-filler" src="<%= data.getImagePath() %>">

    <div class="country__wrapper">
        <div class="top-section">
            <h3><em>your favourite country could to be...</em> [equality <%= data.getEquality() %>%]</h3>
            <a class="home-button" href="${pageContext.request.contextPath}/index.jsp">Return to home</a>
        </div>

        <img alt="<%= data.getName() %>" class="country__flag" src="<%= data.getFlagPath() %>">
        <h1 class="country__name">
            <%= data.getName() %>
        </h1>
        <p class="country__description">
            <%= data.getDescription() %>
        </p>

    </div>
</main>


</body>
</html>