package com.example.webapp.controllers;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet(name = "MediaController", value = "/media")
public class MediaController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String rootPath = getServletContext().getRealPath("/uploads");
        File file=new File(rootPath);
        ArrayList<String> allfiles=new ArrayList<>();

        File[] fileList=file.listFiles();
        for(File f:fileList){
           allfiles.add(f.getName());
        }
        request.setAttribute("allfiles",allfiles);
        request.getRequestDispatcher("media/index.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
