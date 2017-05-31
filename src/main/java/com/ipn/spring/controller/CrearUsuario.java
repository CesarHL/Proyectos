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
        String nombre, ap, email, pass, cpass, job;
        nombre = request.getParameter("nombre");
        ap = request.getParameter("ap");
        email = request.getParameter("email");
        pass = request.getParameter("pass");
        cpass = request.getParameter("cpass");
        job = request.getParameter("jobs");
        System.out.println(nombre + " " + ap + " " + email + " " + pass + " " + cpass + " " + job);

        UserDAO ud = new UserDAO();
        Administrador usuario = new Administrador(123, nombre, ap, email, job, pass, cpass);

        if (ud.crearUsuario(usuario)) {
            request.getRequestDispatcher("registroExitoso.jsp").forward(request, response);
        } else {
            request.setAttribute("message2", "No se pudo crear el usuario");
            request.getRequestDispatcher("CrearUuario.jsp").forward(request, response);
        }

    }

}
