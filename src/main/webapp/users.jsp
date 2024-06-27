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
        .action-group{
            display: flex;
            justify-content:center;
            align-items: center;
        }
        form{
            margin: 0;
            padding: 0;
        }
        form button{
            margin-left: 15px;
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
        <th>Action</th>
    </tr>
    <c:forEach items="${users}" var="user">
        <tr>
            <td>${user.id}</td>
            <td>${user.username}</td>
            <td>${user.password}</td>
            <td>${user.createdAt}</td>
            <td >
                <div class="action-group">
                    <a href="user-edit?id=${user.id}">Edit</a>
                    <form action="users" method="post">
                        <input type="hidden" name="id" value="${user.id}">
                        <button>Delete</button>
                    </form>
                </div>
            </td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
