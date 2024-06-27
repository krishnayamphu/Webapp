package com.example.webapp.controllers;

import com.example.webapp.dao.UserDAO;
import com.example.webapp.models.User;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet(name = "UserEditController", value = "/user-edit")
public class UserEditController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        User user;
        int id=Integer.parseInt(request.getParameter("id"));
        try {
            user= UserDAO.getUser(id);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        request.setAttribute("user",user);
        request.getRequestDispatcher("users/edit.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id=Integer.parseInt(request.getParameter("id"));
        String username=request.getParameter("username");
        String password=request.getParameter("password");
        try {
            User user=new User();
            user.setId(id);
            user.setUsername(username);
            user.setPassword(password);
            UserDAO.update(user);
            HttpSession session=request.getSession();
            session.setAttribute("success","User Updated Successfully.");
            response.sendRedirect("users");

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
