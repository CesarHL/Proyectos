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

    public static final String CREAR_PROYECTO = "INSERT INTO Proyecto(idAdmin, idPm, nPr, fini, ffin, costo, edo, especific) VALUES (?, ?, ?, ?, ?, ?)";
    public static final String LEER_IDPROYECTO = "SELECT * FROM Proyecto WHERE idPr = ?";
    public static final String LEER_TODOS_PROYECTO = "SELECT * FROM Proyecto where idAdmin = ?";
    public static final String ACTUALIZAR_PROYECTO = "UPDATE Proyecto SET nPr=?, fini=?, ffin=?, edo=?, espe=?, alcance=?, cfijo=?, cvar=? WHERE idPr=?";
    public static final String BORRAR_PROYECTO = "DELETE FROM Proyecto WHERE idPr=?";
    public static final String LEER_PROYECTO_DIRI_AD = "SELECT a.uname, a.idAdmin FROM proyecto p INNER JOIN admin a ON  p.idAdmin = a.idAdmin WHERE a.idAdmin = ?";
    public static final String LEER_PROYECTO_DIRI_PM = "select p.nomPm  FROM pm p INNER JOIN proyecto pr ON  p.idPm = pr.idPm WHERE p.idPm = ?";
   
    @Override
    public void crearProyecto(Proyecto proyecto) {
        try {
            Connection conexion = ConexionOracle.conectar();
            PreparedStatement statement = conexion.prepareStatement(CREAR_PROYECTO);

            statement.setInt(1, proyecto.getIdAdmin());
            statement.setInt(2, proyecto.getIdAdmin());
            statement.setString(3, proyecto.getNombrePr());
            statement.setDate(4, new java.sql.Date(proyecto.getfIni().getTime()));
            statement.setDate(5, new java.sql.Date(proyecto.getfFin().getTime()));
            statement.setString(6, proyecto.getPresup());
            statement.setString(7, proyecto.getEstado());
            statement.setString(8, proyecto.getEspecific());

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
    public List<Proyecto> leerProyectos(Integer idAdm) {
        List<Proyecto> listaProyectos = new ArrayList<>();

        try {
            Connection conexion = conectar();
            PreparedStatement ps = conexion.prepareStatement(LEER_TODOS_PROYECTO);
            ps.setInt(1, idAdm);
            ResultSet resultSet = ps.executeQuery();

            while (resultSet.next()) {

                Integer idPr = resultSet.getInt("idPr");
                Integer idAdmin = resultSet.getInt("idAdmin");
                Integer idPm = resultSet.getInt("idPm");
                String npr = resultSet.getString("nPr");
                Date fini = resultSet.getDate("fini");
                Date ffin = resultSet.getDate("ffin");
                String costo = resultSet.getString("costo");
                String edo = resultSet.getString("edo");
                String especific = resultSet.getString("especific");

                Proyecto pr = new Proyecto(idPr, idAdmin, idPm, npr, fini, ffin, costo, edo, especific);
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

    public String leerAdmin(Integer idAdmin) {
        String nomAdmin = null;
        try {
            Connection conexion = conectar();
            PreparedStatement ps = conexion.prepareStatement(LEER_PROYECTO_DIRI_AD);
            ps.setInt(1, idAdmin);
            ResultSet resultSet = ps.executeQuery();

            if (resultSet.next()) {
                nomAdmin = resultSet.getString("uname");
            }

            resultSet.close();
            ps.close();
            conexion.close();
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return nomAdmin;
    }

    public String leerPm(Integer idPm) {
        String nomPm = null;
        try {
            Connection conexion = conectar();
            PreparedStatement ps = conexion.prepareStatement(LEER_PROYECTO_DIRI_PM);
            ps.setInt(1, idPm);
            ResultSet resultSet = ps.executeQuery();

            if (resultSet.next()) {
                nomPm = resultSet.getString("nomPm");
            }

            resultSet.close();
            ps.close();
            conexion.close();
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return nomPm;
    }

}
