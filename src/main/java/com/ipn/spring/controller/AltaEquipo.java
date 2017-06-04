package com.ipn.spring.controller;

import com.ipn.spring.dao.DesarrolladorDAO;
import com.ipn.spring.dao.PMDAO;
import com.ipn.spring.pojo.Desarrollador;
import com.ipn.spring.pojo.PM;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "AltaEquipo", urlPatterns = {"/AltaEquipo"})
public class AltaEquipo extends HttpServlet {

    Desarrollador desarrollador;
    PM pm;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        DesarrolladorDAO dd = new DesarrolladorDAO();
        PMDAO pmd = new PMDAO();

        String cargo = request.getParameter("cargo");
        String competencia = request.getParameter("competencia");
        String nombre = request.getParameter("nom");
        String pass = request.getParameter("pass");
        String ap = request.getParameter("ap");
        String am = request.getParameter("am");
        String mail = request.getParameter("mail");
        String tel = request.getParameter("tel");
        String salario = request.getParameter("sal");

        
        if (cargo.equals("pm")) {
            pm = new PM(Integer.SIZE, cargo, competencia, nombre, pass, mail, ap, am, mail, tel);
            System.out.println(pm);
            pmd.crearPM(pm);
            System.out.println(pm);
        } else if (cargo.equals("dev")){
            desarrollador = new Desarrollador(cargo, competencia, nombre, ap, am, mail, tel, salario);
            dd.crearDesarrollador(desarrollador);
            System.out.println(desarrollador);
        }

        request.getRequestDispatcher("crearEquipo.jsp").forward(request, response);

    }

}
