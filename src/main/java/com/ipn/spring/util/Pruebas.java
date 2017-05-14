package com.ipn.spring.util;

import com.ipn.spring.dao.UserDAO;
import com.ipn.spring.pojo.Usuario;
import java.sql.SQLException;

public class Pruebas {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        UserDAO ud = new UserDAO();
        // Usuario alexis = new Usuario(123, "Alexis", "Texas", "alexis@brazzers.com", "pornstar", "ilovenigga", "ilovenigga");
        // ud.crearUsuario(alexis);
        // ud.leerUsuarios();
//        Usuario alexis = new Usuario(2, "Alexis", "Texas", "alexis@brazzers.com", "isc", "ilovenigga", "ilovenigga");
//        boolean u = ud.borrarUsuario(alexis);
//        System.out.println(u);
//        ud.leerUsuarios();
//        ud.leerUsuarioId(0);
        Usuario x = ud.leerCorreoContraseña("alexis@brazzers.com", "ilovenigga");
        System.out.println(x);
        Usuario y = ud.leerCorreoContraseña("cesar@gmail.com", "admin");
        System.out.println(y);
        if (y.getJob().equals("admin")) {
            System.out.println("Hola Administrador");
        }

    }
}
