package com.cartoon;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/hello")
public class CartoonServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html;charset=UTF-8");
        response.getWriter().println(
            "<html><body style='font-family:Arial;text-align:center;padding:50px'>" +
            "<h1>🎉 Hello from Cartoon World!</h1>" +
            "<p>Java Servlet is running successfully on Tomcat 10.</p>" +
            "</body></html>"
        );
    }
}
