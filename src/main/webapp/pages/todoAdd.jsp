<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add New ToDo</title>
</head>
<body>

<form action="${pageContext.request.contextPath}/Lab3/form" method="POST">

    <label>
        <span>ID</span>
        <input type="number" name="id">
    </label>

    <label>
        <span>Text</span>
        <input type="text" name="name">
    </label>

    <button type="submit">Submit!</button>

</form>

</body>
</html>
