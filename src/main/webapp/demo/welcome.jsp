<%
    String user=(String) session.getAttribute("user");
    if(user==null){
        response.sendRedirect("index.jsp");
    }
%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
</head>
<body>

<div class="container">
    <form action="logout.jsp" method="post">
        <button>Logout</button>
    </form>s
    <h1>Welcome to Dashboard</h1>
    <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Accusantium atque consequuntur cum esse exercitationem facilis impedit, ipsum iste iure magnam obcaecati pariatur placeat, quas, quia quibusdam similique sunt tempora? Maiores!</p>
</div>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
</body>
</html>
