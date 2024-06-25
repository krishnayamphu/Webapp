<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<c:set var="age" value="10" scope="page"/>
<c:choose>
    <c:when test="${age>=18}">
        <p>you can vote</p>
    </c:when>
    <c:otherwise>
        <p>you are not eligible to vote</p>
    </c:otherwise>
</c:choose>

</body>
</html>
