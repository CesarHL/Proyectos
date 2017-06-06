package com.ipn.spring.controller;

import com.ipn.spring.dao.EmpleadoDAO;
import com.ipn.spring.pojo.Empleado;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Cont extends HttpServlet {

    Integer id;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        System.out.println("doget");

        RequestDispatcher view = request.getRequestDispatcher("crearEquipo.jsp");
        view.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        id = (Integer) request.getSession().getAttribute("userId");
        String cargo = request.getParameter("cargo");
        String competencia = request.getParameter("competencia");
        String nombre = request.getParameter("nom");
        String pass = request.getParameter("pass");
        String ap = request.getParameter("ap");
        String am = request.getParameter("am");
        String mail = request.getParameter("mail");
        String tel = request.getParameter("tel");
        String salario = request.getParameter("sal");

        Empleado emp = new Empleado(id, cargo, competencia, nombre, pass, ap, am, mail, tel, salario);
        EmpleadoDAO ed = new EmpleadoDAO();
        ed.crearEmpleado(emp);

        request.getRequestDispatcher("crearEquipo.jsp").forward(request, response);

    }
}
