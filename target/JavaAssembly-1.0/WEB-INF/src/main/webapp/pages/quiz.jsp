<%@ page import="org.obrii.mit.dp2021.jurilents.geoquiz.Temperature" %>
<%@ page import="org.obrii.mit.dp2021.jurilents.geoquiz.Level" %>
<%@ page import="org.obrii.mit.dp2021.jurilents.geoquiz.Size" %>
<%@ page contentType="text/html" pageEncoding="UTF-8" %>
<html>
<head>
    <meta http-equiv="content-type" content="text/html; charset=UTF-8">
    <title>BEST GEO QUIZ in the Universe! | Take a quiz!</title>
    <link href="${pageContext.request.contextPath}/assets/css/common.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/assets/css/quiz.css" rel="stylesheet">
</head>
<body>


<main>
    <form action="${pageContext.request.contextPath}/quiz" method="post">

        <h1 class="margin-bottom">GEO-QuizZ</h1>

        <div class="input__checkbox">
            <span>Do you like water?</span>
            <input class="toggle__checkbox" id="has-sealine" name="has-sealine" type="checkbox">
            <label class="toggle__label" for="has-sealine">
                <span></span>
            </label>
        </div>

        <div class="input__checkbox">
            <span>Do you like mountains?</span>
            <input class="toggle__checkbox" id="has-mountains" name="has-mountains" type="checkbox">
            <label class="toggle__label" for="has-mountains">
                <span></span>
            </label>
        </div>

        <div class="input__checkbox margin-bottom">
            <span>Do you like wild clean nature?</span>
            <input class="toggle__checkbox" id="has-forest" name="has-forest" type="checkbox">
            <label class="toggle__label" for="has-forest">
                <span></span>
            </label>
        </div>

        <div class="select__wrapper select__temperature">
            <label for="temperature">Temperature regime: </label>
            <select id="temperature" name="temperature">
                <% for (Temperature item : Temperature.values()) { %>
                <option value="<%= item %>">
                    <%= item %>
                </option>
                <% } %>
            </select>
        </div>

        <div class="select__wrapper select__evolution">
            <label for="evolution-level">Evolution level: </label>
            <select id="evolution-level" name="evolution-level">
                <% for (Level item : Level.values()) { %>
                <option value="<%= item %>">
                    <%= item %>
                </option>
                <% } %>
            </select>
        </div>

        <div class="select__wrapper select__pollution">
            <label for="pollution-level">Pollution level: </label>
            <select id="pollution-level" name="pollution-level">
                <% for (Level item : Level.values()) { %>
                <option value="<%= item %>">
                    <%= item %>
                </option>
                <% } %>
            </select>
        </div>

        <div class="select__wrapper select__size margin-bottom">
            <label for="size">Territory size: </label>
            <select id="size" name="size">
                <% for (Size item : Size.values()) { %>
                <option value="<%= item %>">
                    <%= item %>
                </option>
                <% } %>
            </select>
        </div>

        <button type="submit">Submit!</button>
    </form>
</main>

<script src="${pageContext.request.contextPath}/assets/js/quiz.js"></script>

</body>
</html>
