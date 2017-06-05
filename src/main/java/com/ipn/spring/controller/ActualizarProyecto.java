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
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ActualizarProyecto extends HttpServlet {

    private static String EDIT = "/actualizarPr.jsp";
    Integer id;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String forward = "";
        String action = request.getParameter("action");

        if (action.equalsIgnoreCase("edit")) {
            forward = "actualizarPr.jsp";
            id = Integer.parseInt(request.getParameter("idxx"));
            Proyecto proyecto = ProyectoDAO.leerProyectoId(id);
            request.setAttribute("pr", proyecto);
        } else if (action.equalsIgnoreCase("delete")) {
            id = Integer.parseInt(request.getParameter("idxx"));
            System.out.println(ProyectoDAO.borrarProyectos(id));
            forward = "administrador.jsp";
        }

        RequestDispatcher view = request.getRequestDispatcher(forward);
        view.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        try {
            Integer idAdmin, idPm;
            String nomPm, nPr, fini, ffin, costo, edo, especific;

            idAdmin = (Integer) request.getSession().getAttribute("userId");
            idPm = (Integer) request.getSession().getAttribute("idPm");
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

            Proyecto p = new Proyecto(id, idAdmin, idPm, nPr, startDate, endDate, costo, edo, especific);
         
            ProyectoDAO pd = new ProyectoDAO();
            pd.actualizarProyectos(p);

            RequestDispatcher view = request.getRequestDispatcher("administrador.jsp");
            view.forward(request, response);

        } catch (ParseException ex) {
            Logger.getLogger(ActualizarProyecto.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
