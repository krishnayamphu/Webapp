package com.example.webapp.servlets;

import com.example.webapp.Employee;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet(name = "RequestServlet", value = "/RequestServlet")
public class RequestServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Employee e=new Employee("Ram",2000);

        ArrayList<Employee> allEmployees=new ArrayList<>();
        allEmployees.add(new Employee("Hari",1000));
        allEmployees.add(new Employee("Mohan",1500));
        allEmployees.add(new Employee("Bikash",1600));

        request.setAttribute("user","Test User");
        request.setAttribute("employee",e);
        request.setAttribute("allEmployees",allEmployees);
        request.getRequestDispatcher("page1.jsp").forward(request,response);
    }
}
