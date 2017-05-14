package com.ipn.spring.controller;

import com.ipn.spring.dao.UserDAO;
import com.ipn.spring.pojo.Usuario;
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

        response.setContentType("text/html");
        
        String nombre, ap, email, pass, cpass, job;
        nombre = request.getParameter("nombre");
        ap = request.getParameter("ap");
        email = request.getParameter("email");
        pass = request.getParameter("pass");
        cpass = request.getParameter("cpass");
        job = request.getParameter("job");
        System.out.println(nombre + " " + ap + " " + email + " " + pass + " " + cpass + " " + job);

        UserDAO ud = new UserDAO();
        Usuario usuario = new Usuario(123, nombre, ap, email, job, pass, cpass);
        ud.crearUsuario(usuario);

    }

}
