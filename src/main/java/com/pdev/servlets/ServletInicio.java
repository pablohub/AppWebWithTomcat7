package com.pdev.servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "ServletInicio", urlPatterns = { "/inicio" })
public class ServletInicio extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //super.doGet(req, resp);
        resp.setContentType("text/html");//setting the content type
        PrintWriter pw=resp.getWriter();//get the stream to write the data

        pw.println("<html><body>");
        pw.println("Welcome to servlet Inicio");
        pw.println("</body></html>");

        pw.close();
    }
}
