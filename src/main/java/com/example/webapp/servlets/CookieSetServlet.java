package com.example.webapp.servlets;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "CookieSetServlet", value = "/cookie-set")
public class CookieSetServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Cookie cookie=new Cookie("app_ver","1.0");
        cookie.setMaxAge(60*60);
        response.addCookie(cookie);
        response.getWriter().print("cookie set successfully");
    }

}
