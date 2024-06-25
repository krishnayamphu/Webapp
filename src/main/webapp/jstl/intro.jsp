<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<c:out value="${'Welcome to jstl'}"/>

<c:set  var="marks" value="50" scope="request"></c:set>

<c:out value="${marks}"/>
</body>
</html>
