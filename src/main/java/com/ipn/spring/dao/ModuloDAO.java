package com.ipn.spring.dao;

import com.ipn.spring.conexion.ConexionOracle;
import static com.ipn.spring.conexion.ConexionOracle.conectar;
import com.ipn.spring.pojo.Modulo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ModuloDAO implements IModulo {

    public static final String CREAR_MODULO = "insert into modulo(idPr, idPm, idDev, nombre, estadoMod, fechaInicio, fechaFin, descripcion) values (?, ?, ?, ?, ?, ?, ?, ?)";
    public static final String LEER_ID_MODULO = "SELECT * FROM modulo WHERE idMod = ?";
    public static final String LEER_TODOS = "SELECT * FROM modulo";
    public static final String ACTUALIZAR_MODULOS = "UPDATE modulo SET nomAct = ?, fechaInicio = ?, fechaFin = ?, estado = ? WHERE idMod = ?";
    public static final String BORRAR_MODULOS = "DELETE FROM modulo WHERE idMod = ?";
    public static final String LEER_MODULOS_PM = "select * FROM modulo WHERE idPm = ?";

    @Override
    public void crearModulo(Modulo modulo) {
        try {
            Connection conexion = ConexionOracle.conectar();
            PreparedStatement statement = conexion.prepareStatement(CREAR_MODULO);

            statement.setInt(1, modulo.getIdPr());
            statement.setInt(2, modulo.getIdPm());
            statement.setInt(3, modulo.getIdDev());
            statement.setString(4, modulo.getNombre());
            statement.setString(5, modulo.getEstadoMod());
            statement.setDate(6, new java.sql.Date(modulo.getFechaInicio().getTime()));
            statement.setDate(7, new java.sql.Date(modulo.getFechaFin().getTime()));
            statement.setString(8, modulo.getDescripcion());

            statement.executeUpdate();
            statement.close();
            conexion.close();
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @Override
    public Modulo leerModuloId(Integer idModulo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Modulo> leerModulo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean actualizarModulo(Modulo modulo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean borrarModulo(Integer idModulo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public List<Modulo> leerModulosIdPm(Integer idPm) {
        Modulo mod = null;
        List<Modulo> ld = null;
        try {
            Connection conexion = conectar();
            PreparedStatement ps = conexion.prepareStatement(LEER_MODULOS_PM);
            ps.setInt(1, idPm);
            ResultSet resultSet = ps.executeQuery();

            if (resultSet.next()) {
                Integer idMod = resultSet.getInt("idMod");
                Integer idPr = resultSet.getInt("idPr");
                Integer idPms = resultSet.getInt("idPm");
                Integer idDev = resultSet.getInt("idDev");
                String nombre = resultSet.getString("nombre");
                String estado = resultSet.getString("estadoMod");
                Date fini = resultSet.getDate("fechaInicio");
                Date ffin = resultSet.getDate("fechaFin");
                String desc = resultSet.getString("descripcion");

                mod = new Modulo(idMod, idPr, idPms, idDev, estado, nombre, fini, ffin, desc);
                System.out.println(mod);
                ld = new ArrayList<>();
                ld.add(mod);
            }

            resultSet.close();
            ps.close();
            conexion.close();
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return ld;
    }

}
