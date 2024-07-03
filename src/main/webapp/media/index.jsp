<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <style>
        .media-gallery{
            width: 90%;
            padding: 15px;
            margin: 15px auto;
            border: 1px solid red;
            display: flex;
        }
        .media{
            width: 150px;
            height: 200px;
            margin: 10px;
            display: flex;
            flex-direction: column;
            align-items: center;
        }
        .media img{
            width: 100%;
            height: 150px;
            object-fit: cover;
            margin-bottom: 5px;
        }

    </style>
</head>
<body>
<div class="media-gallery">
    <c:forEach items="${allfiles}" var="item">
        <div class="media">
            <a href="uploads/${item}"><img src="uploads/${item}" alt="" width="150"></a>
            <form action="media" method="post">
                <input type="hidden" name="pic" value="${item}">
                <button>Delete</button>
            </form>
        </div>
    </c:forEach>
</div>
</body>
</html>
