package com.apps.kaushikservices.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;
public class SimpleFilter implements Filter {


public void init(FilterConfig arg0) throws ServletException {}


public void doFilter(ServletRequest req, ServletResponse resp,
                     FilterChain chain) throws IOException, ServletException {

    HttpServletResponse response=(HttpServletResponse) resp;

    response.setHeader("Access-Control-Allow-Origin", "*");
    response.setHeader("Access-Control-Allow-Methods", "POST, GET, OPTIONS, DELETE");
    response.setHeader("Access-Control-Max-Age", "3600");
    response.setHeader("Access-Control-Allow-Headers", "x-requested-with,Content-Type, Content-Length, X-User");

    chain.doFilter(req, resp);
}


public void destroy() {}

}