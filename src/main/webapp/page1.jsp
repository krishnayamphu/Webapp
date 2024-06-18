<%@ page import="com.example.webapp.Employee" %>
<%@ page import="java.util.ArrayList" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    String user = (String) request.getAttribute("user");
    Employee e = (Employee) request.getAttribute("employee");

    ArrayList<Employee> allEmployees = (ArrayList<Employee>) request.getAttribute("allEmployees");
%>

<p>Username: <%= user %>
</p>

<h3>Employee Details</h3>
<p>Employee Name: <%=e.getName()%>
</p>
<p>Employee Salary: $<%=e.getSalary()%>
</p>

<h3>All Employees</h3>
<%
    for (Employee emp : allEmployees) {
        out.print("<p>Name:" + emp.getName() + "</p>");
        out.print("<p>Salary:" + emp.getSalary() + "</p>");
        out.print("<hr>");
    }
%>
</body>
</html>
