package com.ipn.spring.controller;

import com.ipn.spring.dao.ProyectoDAO;
import com.ipn.spring.pojo.Proyecto;
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
        nombre = request.getParameter("nombreProyecto");
        ap = request.getParameter("nombreProyecto");
//        fini = request.getParameter("nombreProyecto");
//        ffin = request.getParameter("");
//        costo = request.getParameter("nombreProyecto");
//        estado = request.getParameter("nombreProyecto");
//        objetivo = request.getParameter("nombreProyecto");

//obtener id pm por medio de metodo 
       // Proyecto proyecto = new Proyecto(Integer.SIZE, Integer.SIZE, nombre, fIni, fFin, pass, email, email);
        
        ProyectoDAO pd = new ProyectoDAO();
     //   pd.crearProyecto(proyecto);

    }
}
