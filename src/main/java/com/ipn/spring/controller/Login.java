package com.ipn.spring.controller;

import com.ipn.spring.dao.UserDAO;
import com.ipn.spring.pojo.Usuario;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "Login", urlPatterns = {"/Login"})
public class Login extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        ServletOutputStream out = response.getOutputStream();

        HttpSession sesion = request.getSession();

        String email = request.getParameter("usermail");
        String pass = request.getParameter("pass");

        UserDAO ud = new UserDAO();
        Usuario usuario = null;

        try {
            usuario = ud.leerCorreoContraseña(email, pass);
            System.out.println(usuario);

            if (usuario.getJob().equals("admin")) {
                //   sesion.setAttribute("usuario", usu);
                response.sendRedirect("administrador.jsp");
            } 
            else {
                out.print("Sorry, username or password error!");
                request.getRequestDispatcher("index.jsp").include(request, response);
            }
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
