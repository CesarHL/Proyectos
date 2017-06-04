package com.ipn.spring.controller;

import com.ipn.spring.dao.ProyectoDAO;
import com.ipn.spring.pojo.Proyecto;
import java.io.IOException;
import java.util.Date;
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

        String idAdmin, idPm, nPr, fini, ffin, costo, edo, especific;
        idPm = request.getParameter("soption");
        nPr = request.getParameter("nombre");
        fini = request.getParameter("fini");
        ffin = request.getParameter("ffin");
        costo = request.getParameter("costo");
        edo = request.getParameter("nuevo");
        especific = request.getParameter("objetivo");
        
       // Proyecto proyecto = new Proyecto(1, 1, nPr, fini, ffin, costo, edo, especific);

        ProyectoDAO pd = new ProyectoDAO();
        //   pd.crearProyecto(proyecto);

    }
}
