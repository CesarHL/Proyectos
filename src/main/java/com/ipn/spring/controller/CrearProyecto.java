package com.ipn.spring.controller;

import com.ipn.spring.dao.ProyectoDAO;
import com.ipn.spring.pojo.Proyecto;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "CrearProyecto", urlPatterns = {"/CrearProyecto"})
public class CrearProyecto extends HttpServlet {

    int idww;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        idww = Integer.parseInt(request.getParameter("idww"));

        RequestDispatcher view = request.getRequestDispatcher("crearProyecto.jsp");
        view.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        try {
            Integer idAdmin, idPr;
            String nomPm, nPr, fini, ffin, costo, edo, especific;
            idAdmin = (Integer) request.getSession().getAttribute("userId");
            request.getSession().getAttribute("idPm");
            nPr = request.getParameter("nombre");
            nomPm = request.getParameter("soption");
            fini = request.getParameter("fini");
            ffin = request.getParameter("ffin");
            costo = request.getParameter("costo");
            edo = request.getParameter("nuevo");
            especific = request.getParameter("objetivo");

            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            Date startDate = sdf.parse(fini);
            Date endDate = sdf.parse(ffin);
            
            Proyecto proyecto = new Proyecto(idAdmin, 1, nPr, startDate, endDate, costo, edo, especific);
            ProyectoDAO pd = new ProyectoDAO();
            pd.crearProyecto(proyecto);

            request.getRequestDispatcher("administrador.jsp").forward(request, response);

        } catch (ParseException ex) {
            Logger.getLogger(CrearProyecto.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
