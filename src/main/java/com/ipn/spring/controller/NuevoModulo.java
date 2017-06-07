package com.ipn.spring.controller;

import com.ipn.spring.dao.ModuloDAO;
import com.ipn.spring.pojo.Modulo;
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

public class NuevoModulo extends HttpServlet {

    int idPms,idProy;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        idPms = Integer.parseInt(request.getParameter("userid"));
        idProy = Integer.parseInt(request.getParameter("idPr"));
        RequestDispatcher view = request.getRequestDispatcher("crearModulo.jsp");
        view.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        try {
            Integer idMod, idPr, idPm, idDev;
            String nombre, estado, fini, ffin, desc;
            idMod = (Integer) request.getSession().getAttribute("userId");
            idDev = (Integer) request.getSession().getAttribute("idDev");//lista dev obtener id seleccionado
            nombre = request.getParameter("nombre");
            estado = request.getParameter("estado");
            fini = request.getParameter("fini");
            ffin = request.getParameter("ffin");
            desc = request.getParameter("desc");
           

            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            Date startDate = sdf.parse(fini);
            Date endDate = sdf.parse(ffin);
            
            Modulo mod = new Modulo(idProy, idPms, idDev, nombre, estado, startDate, endDate, desc);
            System.out.println(mod);
            ModuloDAO md = new ModuloDAO();
            md.crearModulo(mod);
            
            request.getRequestDispatcher("pm.jsp").forward(request, response);
        } catch (ParseException ex) {
            Logger.getLogger(NuevoModulo.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
