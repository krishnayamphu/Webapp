<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <style>
        table{
            border-collapse: collapse;
        }
        th,td{
            border: 1px solid red;
            padding: 5px;
        }
    </style>
</head>
<body>

<h3>All Users</h3>
<a href="user-create">Add User</a>
<%
    String success= (String) session.getAttribute("success");
    if(success!=null){
        out.print(success);
    }
    session.removeAttribute("success");
%>

<table>
    <tr>
        <th>ID</th>
        <th>Username</th>
        <th>Password</th>
        <th>Created Date</th>
    </tr>
    <c:forEach items="${users}" var="user">
        <tr>
            <td>${user.id}</td>
            <td>${user.username}</td>
            <td>${user.password}</td>
            <td>${user.createdAt}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
