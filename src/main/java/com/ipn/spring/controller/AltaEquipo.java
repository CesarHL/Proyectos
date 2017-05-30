package com.ipn.spring.controller;

import com.ipn.spring.dao.DesarrolladorDAO;
import com.ipn.spring.pojo.Desarrollador;
import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "AltaEquipo", urlPatterns = {"/AltaEquipo"})
public class AltaEquipo extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
//        Desarrollador d = new Desarrollador("dev", "Android dev", "Alex", "Godinez", "Perez", "godinez@gmail.com", "4434431234", "6000");
        DesarrolladorDAO dd = new DesarrolladorDAO();
    //    List listaDesarrolladores = dd.leerDesarrolladores();

        String cargo = request.getParameter("jobs");
        String competencia = request.getParameter("competencia");
        String nombre = request.getParameter("nombre");
        String ap = request.getParameter("ap");
        String am = request.getParameter("am");
        String mail = request.getParameter("correo");
        String tel = request.getParameter("telefono");
        String salario = request.getParameter("salario");

        Desarrollador desarrollador = new Desarrollador(cargo, competencia, nombre, ap, am, mail, tel, salario);
        dd.crearDesarrollador(desarrollador);
      //  request.getSession().setAttribute("listDev", listaDesarrolladores);
        request.getRequestDispatcher("crearEquipo.jsp").forward(request, response);
        System.out.println("CREADO");

    }

}
