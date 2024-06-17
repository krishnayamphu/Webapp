<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    String name= application.getInitParameter("appname");
    out.print(name);
%>
</body>
</html>
