package com.example.webapp.events;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class ServletContextEventDemo implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("application deployed successfully");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("application stop successfully");
    }
}
