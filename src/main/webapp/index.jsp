<%@page import="com.example.newServlet.logic.Model"%>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Home page</h1>
<br/>
Введите id пользователя (0 - для вывода  всего списка)
<br/>
Доступно: <%
        Model model = Model.getInstance();
        out.print(model.getFromList().size());
        %>
</body>
<form method="get" action="get">
    <label>ID:
        <input type="text" name="id"><br/>
    </label>
    <button type="submit">Поиск</button>
</form>

<a href="addUser.html">Создать нового пользователя</a>
</html>