package com.ipn.spring.dao;

import com.ipn.spring.pojo.Proyecto;
import java.util.List;

public class ProyectoDAO implements IProyectoDAO {

    public static final String CREAR_PROYECTO = "INSERT INTO Proyecto (idPr, nPr, fini, ffin, edo, espe, alcance, cfijo, cvar) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
    public static final String LEER_IDPROYECTO = "SELECT * FROM Proyecto WHERE idPr = ?";
    public static final String LEER_TODOS = "SELECT * FROM Proyecto";
    public static final String ACTUALIZAR_PROYECTO = "UPDATE Proyecto SET nPr=?, fini=?, ffin=?, edo=?, espe=?, alcance=?, cfijo=?, cvar=? WHERE idPr=?";
    public static final String BORRAR_PROYECTO = "DELETE FROM Proyecto WHERE idPr=?";

    @Override
    public void crearProyecto(Proyecto proyecto) {
        
    }

    @Override
    public Proyecto leerProyectoId(Integer idProyecto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Proyecto> leerProyectos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean actualizarProyectos(Proyecto proyecto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean borrarProyectos(Proyecto proyecto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
