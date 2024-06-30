<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<c:forEach items="${allfiles}" var="item">
  <img src="uploads/${item}" alt="" width="150">
</c:forEach>
</body>
</html>
