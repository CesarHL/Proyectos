package com.ipn.spring.controller;

import com.ipn.spring.dao.UserDAO;
import com.ipn.spring.pojo.Administrador;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "CrearUsuario", urlPatterns = {"/CrearUsuario"})
public class CrearUsuario extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String competencia = request.getParameter("competencia");
        String nom = request.getParameter("nom");
        String pass = request.getParameter("pass");
        String ap = request.getParameter("ap");
        String am = request.getParameter("am");
        String mail = request.getParameter("mail");
        String tel = request.getParameter("tel");
        String sal = request.getParameter("sal");

        UserDAO ud = new UserDAO();

        Administrador usuario = new Administrador("admin", competencia, nom, pass, ap, am, mail, tel, sal);

        if (ud.crearUsuario(usuario)) {
            request.getRequestDispatcher("registroExitoso.jsp").forward(request, response);
        } else {
            request.setAttribute("message2", "No se pudo crear el usuario");
            request.getRequestDispatcher("CrearUuario.jsp").forward(request, response);
        }

    }

}
