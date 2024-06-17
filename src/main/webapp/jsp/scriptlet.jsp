<%@ page import="java.time.LocalDateTime" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>jsp</title>
</head>
<body>
<h1>Scriptlet Tag</h1>
<%
    out.print("welcome to jsp");
%>

<%
    int a = 5;
    out.print("<br>Value of a: " + a);
%>

<p><%
    out.print(LocalDateTime.now());
%></p>
</body>
</html>
