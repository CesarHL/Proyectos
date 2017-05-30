package com.ipn.spring.dao;

import static com.ipn.spring.conexion.ConexionOracle.conectar;
import com.ipn.spring.pojo.Desarrollador;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DesarrolladorDAO implements IDesarrolladorDAO {

    public static final String CREAR_DESARROLLADOR = "insert into desarrollador(cargoDev, competencia, nomDev, apDev, amDev, mailDev, tel, salDev) \n"
            + "	values (?, ?, ?, ?, ?, ?, ?, ?)";
    public static final String LEER_ID_DESARROLLADOR = "SELECT * FROM desarrollador WHERE idDev = ?";
    public static final String LEER_TODOS_DESARROLLADOR = "SELECT * FROM desarrollador";
    public static final String ACTUALIZAR_DESARROLLADOR = "UPDATE desarrollador SET cargoDev = ?, competencia = ?, nomDev = ?, apDev = ?, amDev = ?, mailDev = ?, tel = ?, salDev = ? WHERE idDev = ?";
    public static final String BORRAR_DESARROLLADOR = "DELETE FROM desarrollador WHERE idDev = ?";

    @Override
    public boolean crearDesarrollador(Desarrollador desarrollador) {
        boolean creado = false;
        try {
            Connection conexion = conectar();
            PreparedStatement statement = conexion.prepareStatement(CREAR_DESARROLLADOR);
            statement.setString(1, desarrollador.getCargo());
            statement.setString(2, desarrollador.getCompetencia());
            statement.setString(3, desarrollador.getNombre());
            statement.setString(4, desarrollador.getAp());
            statement.setString(5, desarrollador.getAm());
            statement.setString(6, desarrollador.getEmail());
            statement.setString(7, desarrollador.getTel());
            statement.setString(8, desarrollador.getSalario());

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
    public Desarrollador leerDesarrolladorId(Integer idDesarrollador) {
        Desarrollador dev = null;
        try {
            Connection conexion = conectar();
            PreparedStatement ps = conexion.prepareStatement(LEER_ID_DESARROLLADOR);
            ps.setInt(1, idDesarrollador);
            ResultSet resultSet = ps.executeQuery();
            System.out.println(resultSet.toString());
            if (resultSet.next()) {
                Integer idDev = resultSet.getInt("idDev");
                String cargo = resultSet.getString("cargoDev");
                String comp = resultSet.getString("competencia");
                String nom = resultSet.getString("nomDev");
                String ap = resultSet.getString("apDev");
                String am = resultSet.getString("amDev");
                String mail = resultSet.getString("mailDev");
                String tel = resultSet.getString("tel");
                String sal = resultSet.getString("salDev");

                dev = new Desarrollador(idDev, cargo, comp, nom, ap, am, mail, tel, sal);
            }

            resultSet.close();
            ps.close();
            conexion.close();
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return dev;
    }

    @Override
    public List<Desarrollador> leerDesarrolladores() {

        List<Desarrollador> listaDesarrolladores = new ArrayList<>();

        try {
            Connection conexion = conectar();
            PreparedStatement ps = conexion.prepareStatement(LEER_TODOS_DESARROLLADOR);
            ResultSet resultSet = ps.executeQuery();
            System.out.println(resultSet.toString());
            while (resultSet.next()) {

                Integer idDev = resultSet.getInt("idDev");
                String cargo = resultSet.getString("cargoDev");
                String comp = resultSet.getString("competencia");
                String nom = resultSet.getString("nomDev");
                String ap = resultSet.getString("apDev");
                String am = resultSet.getString("amDev");
                String mail = resultSet.getString("mailDev");
                String tel = resultSet.getString("tel");
                String sal = resultSet.getString("salDev");

                Desarrollador dev = new Desarrollador(idDev, cargo, comp, nom, ap, am, mail, tel, sal);
                listaDesarrolladores.add(dev);
            }

            resultSet.close();
            ps.close();
            conexion.close();
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println(listaDesarrolladores);
        return listaDesarrolladores;
    }

    @Override
    public boolean actualizarDesarrollador(Desarrollador desarrollador) {
        boolean rowUpdated = false;
        try {
            Connection conexion = conectar();
            PreparedStatement statement = conexion.prepareStatement(ACTUALIZAR_DESARROLLADOR);
             statement.setString(1, desarrollador.getCargo());
            statement.setString(2, desarrollador.getCompetencia());
            statement.setString(3, desarrollador.getNombre());
            statement.setString(4, desarrollador.getAp());
            statement.setString(5, desarrollador.getAm());
            statement.setString(6, desarrollador.getEmail());
            statement.setString(7, desarrollador.getTel());
            statement.setString(8, desarrollador.getSalario());
            statement.setInt(9, desarrollador.getIdDesarrollador());
            rowUpdated = statement.executeUpdate() > 0;

            statement.close();
            conexion.close();
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rowUpdated;
    }

    @Override
    public boolean borrarDesarrollador(Integer idDesarrollador) {
        boolean rowUpdated = false;
        try {
            Connection conexion = conectar();
            PreparedStatement statement = conexion.prepareStatement(BORRAR_DESARROLLADOR);
            statement.setInt(1, idDesarrollador);

            rowUpdated = statement.executeUpdate() > 0;

            statement.close();
            conexion.close();
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return rowUpdated;
    }

}
