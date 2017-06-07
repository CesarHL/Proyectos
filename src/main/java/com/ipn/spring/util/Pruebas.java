package com.ipn.spring.util;

import com.ipn.spring.dao.DesarrolladorDAO;
import com.ipn.spring.dao.EmpleadoDAO;
import com.ipn.spring.pojo.Desarrollador;
import com.ipn.spring.pojo.Empleado;

public class Pruebas {

    public static void main(String[] args) {

        EmpleadoDAO ed = new EmpleadoDAO();
        Empleado empleado = new Empleado(1, "X", "x", "x", "x", "x", "x", "x", "x", "x");
        // ed.crearProyecto(empleado);
//        ModuloDAO md = new ModuloDAO();
//        Date x = new Date();
//        Date y = new Date();
//        Modulo m = new Modulo(1, 1, 1, "s", "s", x, y, "s");
//        md.crearModulo(m);
        Desarrollador d = new Desarrollador();
        DesarrolladorDAO dd = new DesarrolladorDAO();
        System.out.println(dd.leerDesarrolladorId(1));

    }
}
