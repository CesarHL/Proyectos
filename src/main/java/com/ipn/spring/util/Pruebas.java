package com.ipn.spring.util;

import com.ipn.spring.dao.EmpleadoDAO;
import com.ipn.spring.dao.PMDAO;
import com.ipn.spring.dao.ProyectoDAO;
import com.ipn.spring.pojo.Empleado;

public class Pruebas {

    public static void main(String[] args) {

        EmpleadoDAO ed = new EmpleadoDAO();
        Empleado empleado = new Empleado(1, "X", "x", "x", "x", "x", "x", "x", "x", "x");
       // ed.crearProyecto(empleado);
    }
}
