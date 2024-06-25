package com.example.webapp.filters;

import javax.servlet.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebFilter(filterName = "TestFilter", urlPatterns = {
        "/test-servlet",
})
public class TestFilter implements Filter {
    public void init(FilterConfig config) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws ServletException, IOException {
        System.out.println("request invoked");
        chain.doFilter(request, response);
    }

    public void destroy() {

    }
}
