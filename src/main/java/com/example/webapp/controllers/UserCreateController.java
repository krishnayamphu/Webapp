package com.example.webapp.controllers;

import com.example.webapp.dao.UserDAO;
import com.example.webapp.models.User;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet(name = "UserCreateController", value = "/user-create")
public class UserCreateController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            request.getRequestDispatcher("users/create.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    String username=request.getParameter("username");
    String password=request.getParameter("password");
        try {
            UserDAO.save(new User(username,password));
            HttpSession session=request.getSession();
            session.setAttribute("success","User Added Successfully.");
            response.sendRedirect("users");

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
