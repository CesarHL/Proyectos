package com.ipn.spring.util;

import com.ipn.spring.dao.ProyectoDAO;

public class Pruebas {

    public static void main(String[] args) {

        ProyectoDAO pd = new ProyectoDAO();
        pd.borrarProyectos(1);

    }
}
