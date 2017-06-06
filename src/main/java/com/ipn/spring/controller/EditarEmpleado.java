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

@WebServlet(name = "EditarEmpleado", urlPatterns = {"/EditarEmpleado"})
public class EditarEmpleado extends HttpServlet {

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

        //TODO debe hacer match los ids 
        if (cargo.equals("pm")) {
            pm = new PM(1, cargo, competencia, nombre, pass, ap, am, mail, tel, salario);
            System.out.println(pm);
            pmd.actualizarPm(pm);
        } else if (cargo.equals("dev")) {
            desarrollador = new Desarrollador(1, 1, 1, cargo, competencia, nombre, pass, ap, am, mail, tel, salario);
            dd.crearDesarrollador(desarrollador);
        }

        request.getRequestDispatcher("crearEquipo.jsp").forward(request, response);

    }

}
