<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String username=request.getParameter("username");
    String password=request.getParameter("password");
    if(username.equals("admin") && password.equals("a123")){
        session.setAttribute("user",username);
        response.sendRedirect("welcome.jsp");
    }else{
        session.setAttribute("err","Invalid username or password");
        response.sendRedirect("index.jsp");
    }
%>