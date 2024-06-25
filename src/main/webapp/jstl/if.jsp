<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<c:set var="temp" value="35" scope="request"/>
<c:if test="${temp>=30}">
    <p><c:out value="High temperature"/> </p>
</c:if>
</body>
</html>
