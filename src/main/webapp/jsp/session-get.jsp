<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    String username=(String) session.getAttribute("user");
    out.print("Username: "+username);
%>
</body>
</html>
