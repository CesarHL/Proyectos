package com.ipn.spring.util;

import com.ipn.spring.dao.ProyectoDAO;
import com.ipn.spring.pojo.Actividad;
import com.ipn.spring.pojo.Desarrollador;
import com.ipn.spring.pojo.Modulo;
import com.ipn.spring.pojo.Proyecto;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;

public class Pruebas {

    public static Proyecto pr;
    public static ArrayList<Actividad> listaActividades;
    public static ArrayList<Modulo> listaModulos;
    public static ArrayList<Desarrollador> listaDesarrolladores;

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
//        UserDAO ud = new UserDAO();
//        Administrador alexis = new Administrador("Cesar", "Ferrara", "cecyman@brazzers.com", "pornstar", "iloveculazo", "ilovenculazo");
//
//        ActividadesDAO ad = new ActividadesDAO();
//
        Date d = new Date();
//        listaActividades = new ArrayList<>();
//        listaModulos = new ArrayList<>();
//        listaDesarrolladores = new ArrayList<>();
////String string = "January 2, 2010";
//        Actividad a1 = new Actividad(1, "CrearObjetoProyecto", d, d, "Nuevo requerimiento");
//        //ad.crearActividad(a1);

//        Desarrollador u1 = new Desarrollador(1, 15000, "Java Developer");

//        Modulo pruebas = new Modulo(2, "Estancado", d, d, "modulo pruebas", listaActividades, listaDesarrolladores);
//
        

        ProyectoDAO pd = new ProyectoDAO();
        System.out.println(pd.leerPm(2));
        
        

    }
}
