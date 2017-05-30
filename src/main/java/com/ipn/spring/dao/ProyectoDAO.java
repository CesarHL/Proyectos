package com.ipn.spring.dao;

import com.ipn.spring.conexion.ConexionOracle;
import com.ipn.spring.pojo.Proyecto;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ProyectoDAO implements IProyectoDAO {

    public static final String CREAR_PROYECTO = "INSERT INTO Proyecto(idPr, nPr, fini, ffin, edo, espe, alcance, cfijo, cvar) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
    public static final String LEER_IDPROYECTO = "SELECT * FROM Proyecto WHERE idPr = ?";
    public static final String LEER_TODOS = "SELECT * FROM Proyecto";
    public static final String ACTUALIZAR_PROYECTO = "UPDATE Proyecto SET nPr=?, fini=?, ffin=?, edo=?, espe=?, alcance=?, cfijo=?, cvar=? WHERE idPr=?";
    public static final String BORRAR_PROYECTO = "DELETE FROM Proyecto WHERE idPr=?";

    @Override
    public void crearProyecto(Proyecto proyecto) {
        try {
            Connection conexion = ConexionOracle.conectar();
            PreparedStatement statement = conexion.prepareStatement(CREAR_PROYECTO);
            statement.setString(1, proyecto.getNombre());
            statement.setDate(2, (Date) proyecto.getFechaInicio());
            statement.setDate(3, (Date) proyecto.getFechaFin());
            statement.setString(4, proyecto.getEstado());
            statement.setString(5, proyecto.getEspecificaciones());
            statement.setString(6, proyecto.getAlcance());
            statement.setInt(7, proyecto.getCostoFijo());
            statement.setInt(8, proyecto.getCostoVariable());
            
            // falta lista y lista anidada

            statement.executeUpdate();
            statement.close();
            conexion.close();
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
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
