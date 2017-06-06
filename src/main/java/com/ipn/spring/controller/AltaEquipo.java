package com.ipn.spring.controller;

import com.ipn.spring.dao.EmpleadoDAO;
import com.ipn.spring.pojo.Desarrollador;
import com.ipn.spring.pojo.Empleado;
import com.ipn.spring.pojo.PM;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "AltaEquipo", urlPatterns = {"/AltaEquipo"})
public class AltaEquipo extends HttpServlet {

    Desarrollador desarrollador;
    PM pm;
    private static String EDIT = "/editarEmpleado.jsp";
    int id, idAdmin;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String forward = "";
        String action = request.getParameter("action");
        id = Integer.parseInt(request.getParameter("idxx"));

        if (action.equalsIgnoreCase("edit")) {
            forward = "actualizarEmp.jsp";
            id = Integer.parseInt(request.getParameter("idxx"));
            Empleado empleado = EmpleadoDAO.leerProyectoId(id);
            request.setAttribute("emp", empleado);
        } else if (action.equalsIgnoreCase("delete")) {
            id = Integer.parseInt(request.getParameter("idxx"));
            System.out.println(EmpleadoDAO.borrarEmpleado(id));
            forward = "crearEquipo.jsp";
        } 

        RequestDispatcher view = request.getRequestDispatcher(forward);
        view.forward(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        EmpleadoDAO ed = new EmpleadoDAO();
        Integer idAd = (Integer) request.getSession().getAttribute("userId");
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
            Empleado pm = new Empleado(id, idAd, "pm", competencia, nombre, pass, ap, am, mail, tel, salario);
            System.out.println(pm);
            ed.actualizarEmpleado(pm);

        } else if (cargo.equals("dev")) {
            Empleado dev = new Empleado(id, idAd, "dev", competencia, nombre, pass, ap, am, mail, tel, salario);
            System.out.println(dev);
            ed.actualizarEmpleado(dev);

        }

        request.getRequestDispatcher("crearEquipo.jsp").forward(request, response);

    }

}
