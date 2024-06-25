package com.example.webapp.controllers;

import com.example.webapp.models.User;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

@WebServlet(name = "UserController", value = "/users")
public class UserController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ArrayList<User> users = new ArrayList<>();
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/webapp", "root", "");

            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select * from users");
            while (rs.next()) {
                User user = new User(rs.getInt("id"), rs.getString("username"), rs.getString("password"), rs.getString("created_at"));
                users.add(user);
            }
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }

       request.setAttribute("users",users);
        request.getRequestDispatcher("users.jsp").forward(request,response);
    }


}
