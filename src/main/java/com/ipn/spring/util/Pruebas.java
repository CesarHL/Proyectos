package com.ipn.spring.util;

import com.ipn.spring.dao.DesarrolladorDAO;
import com.ipn.spring.dao.ProyectoDAO;
import com.ipn.spring.dao.UserDAO;
import com.ipn.spring.pojo.Actividad;
import com.ipn.spring.pojo.Desarrollador;
import com.ipn.spring.pojo.Modulo;
import com.ipn.spring.pojo.Proyecto;
import com.ipn.spring.pojo.Usuario;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;

public class Pruebas {

    public static Proyecto pr;
    public static ArrayList<Actividad> listaActividades;
    public static ArrayList<Modulo> listaModulos;
    public static ArrayList<Desarrollador> listaDesarrolladores;

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        UserDAO ud = new UserDAO();
        Usuario alexis = new Usuario("Cesar", "Ferrara", "cecyman@brazzers.com", "pornstar", "iloveculazo", "ilovenculazo");
//        ud.crearUsuario(alexis);
        
//        ud.leerUsuarios();
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

//        Date d = new Date();
//        listaActividades = new ArrayList<>();
//        listaModulos = new ArrayList<>();
//        listaDesarrolladores = new ArrayList<>();
//
//        Actividad a1 = new Actividad(1, "CrearObjetoProyecto", d, d, "Terminado");
//
//        Desarrollador u1 = new Desarrollador(1, 15000, "Java Developer");
//        Desarrollador u2 = new Desarrollador(1, 15000, "Spring Developer");
//        Desarrollador u3 = new Desarrollador(1, 15000, "Android Developer");
//
//        Modulo pruebas = new Modulo(2, "Estancado", d, d, "modulo pruebas", listaActividades, listaDesarrolladores);
//
//        pr = new Proyecto(1, "Proyecto Bancomer", d, d, "En proceso", "sin especificacion", "alcance", 15000, 2000, listaModulos);
//
//        asignarModulo(pruebas);
//        asignarActividadModulo(a1);
//        asignarDesarrollador(u1);
//        asignarDesarrollador(u2);
//        asignarDesarrollador(u3);
//        System.out.println(pr);
//
//        ProyectoDAO pd = new ProyectoDAO();
//        pd.crearProyecto(pr);
//    }
//
//    public static void asignarActividadModulo(Actividad actividad) {
//        listaActividades.add(actividad);
//    }
//
//    public static void asignarModulo(Modulo modulo) {
//        listaModulos.add(modulo);
//    }
//
//    private static void asignarDesarrollador(Desarrollador u) {
//        listaDesarrolladores.add(u);
        Desarrollador d = new Desarrollador("dev", "Android dev", "Alex", "Godinez", "Perez", "godinez@gmail.com", "4434431234", "6000");
        DesarrolladorDAO dd = new DesarrolladorDAO();
//        dd.crearDesarrollador(d);
        
        dd.leerDesarrolladores();
    }
}
