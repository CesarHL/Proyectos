package com.ipn.spring.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "CrearProyecto", urlPatterns = {"/CrearProyecto"})
public class CrearProyecto extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String nombre, ap, email, pass, cpass, job;
        nombre = request.getParameter("nombre");
        ap = request.getParameter("nombreProyecto");
        ap = request.getParameter("nombreProyecto");
        ap = request.getParameter("nombreProyecto");
        ap = request.getParameter("nombreProyecto");
        
    }
}
