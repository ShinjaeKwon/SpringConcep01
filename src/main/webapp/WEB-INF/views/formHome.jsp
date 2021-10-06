<%--
  Created by IntelliJ IDEA.
  User: sec
  Date: 2021-10-06
  Time: 오후 10:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>BOARD</title>
</head>
<body>

    <h3>Form Home</h3>

    <form action="/board/register">
        <input type="submit" value="register (GET)">
    </form>

    <form action="/board/register" method="post">
        <input type="submit" value="register (POST)">
    </form>

    <form action="/board/modify">
        <input type="submit" value="modify (GET)">
    </form>

    <form action="/board/modify" method="post">
        <input type="submit" value="modify (POST)">
    </form>

    <form action="/board/remove" method="post">
        <input type="submit" value="remove (POST)">
    </form>

    <form action="/board/list">
        <input type="submit" value="list (GET)">
    </form>


</body>
</html>
