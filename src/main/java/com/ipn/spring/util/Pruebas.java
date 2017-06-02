package com.ipn.spring.util;

import com.ipn.spring.dao.PMDAO;
import com.ipn.spring.pojo.Actividad;
import com.ipn.spring.pojo.Desarrollador;
import com.ipn.spring.pojo.Modulo;
import com.ipn.spring.pojo.Proyecto;
import java.sql.SQLException;
import java.util.ArrayList;

public class Pruebas {

    public static Proyecto pr;
    public static ArrayList<Actividad> listaActividades;
    public static ArrayList<Modulo> listaModulos;
    public static ArrayList<Desarrollador> listaDesarrolladores;

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        PMDAO pms = new PMDAO();
        System.out.println( pms.leerPms(3)); 

    }
}
