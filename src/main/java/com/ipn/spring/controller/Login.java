package com.ipn.spring.controller;

import com.ipn.spring.dao.UserDAO;
import com.ipn.spring.pojo.Usuario;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
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
        //TODO hacer match con la base de datos
        UserDAO ud = new UserDAO();
        Usuario usuario = null;
        HttpSession session = null;

        try {
            usuario = ud.leerCorreoContraseña(email, pass);

            System.out.println(usuario);
            if (usuario != null) {
                if (usuario.getJob().equals("pm")) {
                    session = request.getSession();
                    session.setAttribute("usermail", email);
                    response.sendRedirect("pm.jsp");
                } else if (usuario.getJob().equals("developer")) {
                    session = request.getSession();
                    session.setAttribute("usermail", email);
                    response.sendRedirect("desarrollador.jsp");
                } else if (usuario.getJob().equals("admin")) {
                    session = request.getSession();
                    session.setAttribute("usermail", email);
                    response.sendRedirect("administrador.jsp");
                } else {
                    request.setAttribute("message", "Usuario y/o contraseña invalidos");
                    request.getRequestDispatcher("login.jsp").forward(request, response);
                }
            } else {
                request.setAttribute("message", "Usuario y/o contraseña invalidos");
                request.getRequestDispatcher("login.jsp").forward(request, response);
            }
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
