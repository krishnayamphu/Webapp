package com.example.webapp.events;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebListener
public class RequestListenerDemo implements ServletRequestListener {


    @Override
    public void requestDestroyed(ServletRequestEvent sre) {
        System.out.println("after request made");
    }

    @Override
    public void requestInitialized(ServletRequestEvent sre) {
        System.out.println("before request made");
    }
}
