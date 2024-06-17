<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    pageContext.setAttribute("authUser","Administrator",PageContext.SESSION_SCOPE);
    out.print("pagecontext attribute set successfully.");
%>

</body>
</html>
