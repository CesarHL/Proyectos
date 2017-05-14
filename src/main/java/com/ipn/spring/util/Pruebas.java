package com.ipn.spring.util;

import com.ipn.spring.dao.UserDAO;
import com.ipn.spring.pojo.Actividad;
import com.ipn.spring.pojo.Modulo;
import com.ipn.spring.pojo.Proyecto;
import com.ipn.spring.pojo.Usuario;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import jdk.nashorn.internal.runtime.arrays.ArrayLikeIterator;

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
//        Usuario x = ud.leerCorreoContraseña("alexis@brazzers.com", "ilovenigga");
//        System.out.println(x);
//        Usuario y = ud.leerCorreoContraseña("cesar@gmail.com", "admin");
//        System.out.println(y);
//        if (y.getJob().equals("admin")) {
//            System.out.println("Hola Administrador");
//        }

        Date d = new Date();

        Actividad a1 = new Actividad(1, "CrearObjetoProyecto", d, d, "Terminado");
        Actividad a2 = new Actividad(2, "CrearInterfazParaDAOProyecto", d, d, "Terminado");
        Actividad a3 = new Actividad(3, "CrearImplmentacionDAOProyecto", d, d, "En proceso");
        Actividad a4 = new Actividad(3, "RelizarPruebaDAOProyecto", d, d, "En proceso");

        ArrayList<Actividad> listaActividades1 = new ArrayList<>();
        listaActividades1.add(a1);
        listaActividades1.add(a2);
        listaActividades1.add(a3);
        
        ArrayList<Actividad> listaActividades2 = new ArrayList<>();
        listaActividades1.add(a4);

        Modulo persistencia = new Modulo(1, "Apunto de terminar", d, d, "modulo de desarrollo", listaActividades1);
        Modulo pruebas = new Modulo(2, "Estancado", d, d, "modulo pruebas", listaActividades2);

        ArrayList<Modulo> listaModulos = new ArrayList<>();
        listaModulos.add(persistencia);
        listaModulos.add(pruebas);

        Proyecto pr = new Proyecto(1, "Proyecto Bancomer", d, d, "En proceso", "sin especificacion", "alcance", 15000, 2000, listaModulos);
        System.out.println(pr);

    }
}
