<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    String authUser=(String)pageContext.getAttribute("authUser",PageContext.SESSION_SCOPE);
%>

<p>Authenticated user: <%=authUser%></p>

</body>
</html>
