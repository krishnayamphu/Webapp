<%@ page import="com.example.webapp.Welcome" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>jsp</title>
</head>
<body>
<%!
    String test(){
        return "testing";
    }
%>

<p><%= test() %></p>

<%= Welcome.greeting() %>

</body>
</html>
