package com.ipn.spring.dao;

import static com.ipn.spring.conexion.ConexionOracle.conectar;
import com.ipn.spring.conexion.ConexionOracle;
import com.ipn.spring.pojo.Proyecto;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ProyectoDAO implements IProyectoDAO {

    public static final String CREAR_PROYECTO = "INSERT INTO Proyecto(idAdmin, nPr, fini, ffin, edo, especific) VALUES (?, ?, ?, ?, ?, ?)";
    public static final String LEER_IDPROYECTO = "SELECT * FROM Proyecto WHERE idPr = ?";
    public static final String LEER_TODOS_PROYECTO = "SELECT * FROM Proyecto";
    public static final String ACTUALIZAR_PROYECTO = "UPDATE Proyecto SET nPr=?, fini=?, ffin=?, edo=?, espe=?, alcance=?, cfijo=?, cvar=? WHERE idPr=?";
    public static final String BORRAR_PROYECTO = "DELETE FROM Proyecto WHERE idPr=?";

    @Override
    public void crearProyecto(Proyecto proyecto) {
        try {
            Connection conexion = ConexionOracle.conectar();
            PreparedStatement statement = conexion.prepareStatement(CREAR_PROYECTO);

            statement.setInt(1, proyecto.getIdAdmin());
            statement.setString(2, proyecto.getNombrePr());
            statement.setDate(3, new java.sql.Date(proyecto.getfIni().getTime()));
            statement.setDate(4, new java.sql.Date(proyecto.getfFin().getTime()));
            statement.setString(5, proyecto.getEstado());
            statement.setString(6, proyecto.getEspecific());

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
        List<Proyecto> listaProyectos = new ArrayList<>();

        try {
            Connection conexion = conectar();
            PreparedStatement ps = conexion.prepareStatement(LEER_TODOS_PROYECTO);
            ResultSet resultSet = ps.executeQuery();

            while (resultSet.next()) {

                Integer idPr = resultSet.getInt("idPr");
                Integer idAdmin = resultSet.getInt("idAdmin");
                String npr = resultSet.getString("nPr");
                Date fini = resultSet.getDate("fini");
                Date ffin = resultSet.getDate("ffin");
                String edo = resultSet.getString("edo");
                String especific = resultSet.getString("especific");

                Proyecto pr = new Proyecto(idPr, idAdmin, npr, fini, ffin, edo, especific);
                listaProyectos.add(pr);
            }

            resultSet.close();
            ps.close();
            conexion.close();
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listaProyectos;
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
