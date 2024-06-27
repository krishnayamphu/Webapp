<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>User Details</title>
</head>
<body>

<h3>User Details</h3>
<form action="user-edit" method="post">
    <input type="hidden" name="id" value="${user.id}">
    <input type="text" name="username" placeholder="Username" value="${user.username}" required>
    <br><br>
    <input type="password" name="password" placeholder="Password" value="${user.password}" required>
    <br><br>
    <button>Update User</button>
</form>
</body>
</html>
