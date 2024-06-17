<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    session.setAttribute("user","admin");
    out.print("session set successfully.");
%>
</body>
</html>
