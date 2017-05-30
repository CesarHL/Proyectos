package com.ipn.spring.dao;

import static com.ipn.spring.conexion.ConexionOracle.conectar;
import com.ipn.spring.pojo.Actividad;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ActividadesDAO implements IActividades {

    public static final String CREAR_ACTIVIDAD = "insert into actividad(nomAct, fechaInicio, fechaFin, estado) values (?, ?, ?, ?)";
    public static final String LEER_ID_ACTIVIDAD = "SELECT * FROM actividad WHERE idAct = ?";
    public static final String LEER_TODOS = "SELECT * FROM actividad";
    public static final String ACTUALIZAR_ACTIVIDAD = "UPDATE actividad SET nomAct = ?, fechaInicio = ?, fechaFin = ?, estado = ? WHERE idAct = ?";
    public static final String BORRAR_ACTIVIDAD = "DELETE FROM actividad WHERE idAct = ?";

    @Override
    public boolean crearActividad(Actividad actividad) {
        boolean creado = false;
        try {
            Connection conexion = conectar();
            PreparedStatement statement = conexion.prepareStatement(CREAR_ACTIVIDAD);

            statement.setString(1, actividad.getNombre());
            statement.setDate(2, new java.sql.Date((actividad.getFechaInicio().getTime())));
            statement.setDate(3, new java.sql.Date((actividad.getFechaFin().getTime())));
            statement.setString(4, actividad.getEstado());

            statement.executeUpdate();

            statement.close();
            conexion.close();

            return true;
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return creado;

    }

    @Override
    public Actividad leerActividadId(Integer idActividad) {
        Actividad actividad = null;
        try {
            Connection conexion = conectar();
            PreparedStatement ps = conexion.prepareStatement(LEER_ID_ACTIVIDAD);
            ps.setInt(1, idActividad);
            ResultSet resultSet = ps.executeQuery();

            if (resultSet.next()) {
                Integer idAct = resultSet.getInt("idAct");
                String nomAct = resultSet.getString("nomAct");
                Date fechIni = resultSet.getDate("fechaInicio");
                Date fechFin = resultSet.getDate("fechaFin");
                String estado = resultSet.getString("estado");

                actividad = new Actividad(idAct, nomAct, fechIni, fechFin, estado);
            }
            resultSet.close();
            ps.close();
            conexion.close();
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return actividad;
    }

    @Override
    public List<Actividad> leerActividades() {
        List<Actividad> listaActividades = new ArrayList<>();

        try {
            Connection conexion = conectar();
            PreparedStatement ps = conexion.prepareStatement(LEER_TODOS);
            ResultSet resultSet = ps.executeQuery();

            while (resultSet.next()) {

                Integer idAct = resultSet.getInt("idAct");
                String nomAct = resultSet.getString("nomAct");
                Date fechIni = resultSet.getDate("fechaInicio");
                Date fechFin = resultSet.getDate("fechaFin");
                String estado = resultSet.getString("estado");

                Actividad actividad = new Actividad(idAct, nomAct, fechIni, fechFin, estado);
                listaActividades.add(actividad);
            }

            resultSet.close();
            ps.close();
            conexion.close();
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println(listaActividades);
        return listaActividades;
    }

    @Override
    public boolean actualizarActividad(Actividad actividad) {
        boolean rowUpdated = false;
        try {
            Connection conexion = conectar();
            PreparedStatement statement = conexion.prepareStatement(ACTUALIZAR_ACTIVIDAD);
            statement.setString(1, actividad.getNombre());
            statement.setDate(2, new java.sql.Date((actividad.getFechaInicio().getTime())));
            statement.setDate(3, new java.sql.Date((actividad.getFechaFin().getTime())));
            statement.setString(4, actividad.getEstado());
            statement.setInt(5, actividad.getIdActividad());
            rowUpdated = statement.executeUpdate() > 0;

            statement.close();
            conexion.close();
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rowUpdated;
    }

    @Override
    public boolean borrarActividad(Integer idActividad) {
        boolean rowUpdated = false;
        try {
            Connection conexion = conectar();
            PreparedStatement statement = conexion.prepareStatement(BORRAR_ACTIVIDAD);
            statement.setInt(1, idActividad);

            rowUpdated = statement.executeUpdate() > 0;

            statement.close();
            conexion.close();
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return rowUpdated;
    }

}
