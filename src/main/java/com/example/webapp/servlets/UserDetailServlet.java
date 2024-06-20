package com.example.webapp.servlets;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "UserDetailServlet", value = "/user-detail")
public class UserDetailServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name=request.getParameter("name");
        int age=Integer.parseInt(request.getParameter("age"));

        response.getWriter().print(name);
        response.getWriter().print(age);
    }
}
