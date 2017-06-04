package com.ipn.spring.controller;

import com.ipn.spring.dao.UserDAO;
import com.ipn.spring.pojo.Empleado;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "Login", urlPatterns = {"/Login"})
public class Login extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();
        session.removeAttribute("usermail");
        response.sendRedirect("index.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String email = request.getParameter("usermail");
        String pass = request.getParameter("pass");
        
        UserDAO ud = new UserDAO();
        Empleado usuario;
        HttpSession session;

        usuario = ud.leerEmpleados(email, pass);

        if (usuario != null) {
            switch (usuario.getCargo()) {
                case "pm":
                    session = request.getSession();
                    session.setAttribute("usermail", usuario.getNom());
                    response.sendRedirect("pm.jsp");
                    break;
                case "dev":
                    session = request.getSession();
                    session.setAttribute("usermail", usuario.getNom());
                    response.sendRedirect("desarrollador.jsp");
                    break;
                case "admin":
                    session = request.getSession();
                    session.setAttribute("usermail", usuario.getNom());
                    session.setAttribute("userId", usuario.getIdAdmin());
                    response.sendRedirect("administrador.jsp");
                    break;
                default:
                    request.setAttribute("message", "Usuario y/o contraseña invalidos");
                    request.getRequestDispatcher("login.jsp").forward(request, response);
                    break;
            }
        } else {
            request.setAttribute("message", "Usuario y/o contraseña invalidos");
            request.getRequestDispatcher("login.jsp").forward(request, response);
        }
    }

}
