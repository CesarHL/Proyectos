package com.ipn.spring.dao;

import static com.ipn.spring.conexion.ConexionOracle.conectar;
import com.ipn.spring.pojo.PM;
import com.ipn.spring.pojo.Proyecto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PMDAO implements IPMDAO {

    public static final String LEER_PM_DIRI_AD = "SELECT p.idPm, p.nom FROM admin a INNER JOIN pm p ON  a.idAdmin = p.idAdmin WHERE p.idAdmin = ?";
    public static final String LEER_PM_ASC_AD = "select * from proyecto where idAdmin=? and idPm=?";
    public static final String CREAR_PM = "insert into pm(idAdmin, cargo, competencia, nom, pass, ap, am, mail, tel, sal) values (?, ?, ?, ?, ?, ?, ?, ?, ? ,?)";
    public static final String ACTUALIZAR_PM = "UPDATE pm"
            + " SET idAdmin=?, cargo=?, competencia=?, nom=?, pass=?, ap=?, am=?, mail=?, tel=?, sal=? WHERE  idPm=?";
    public static final String DELETE_PM = "";

    @Override
    public boolean crearPM(PM pm) {
        boolean creado = false;
        try {
            Connection conexion = conectar();
            PreparedStatement statement = conexion.prepareStatement(CREAR_PM);

            statement.setInt(1, pm.getIdAdmin());
            statement.setString(2, pm.getCargo());
            statement.setString(3, pm.getCompetencia());
            statement.setString(4, pm.getNombre());
            statement.setString(5, pm.getPass());
            statement.setString(6, pm.getAp());
            statement.setString(7, pm.getAm());
            statement.setString(8, pm.getMail());
            statement.setString(9, pm.getTel());
            statement.setString(10, pm.getSal());

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
    public PM leerPMId(Integer idPM) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<PM> leerPMs() {
        return null;
    }

    @Override
    public boolean actualizarPm(PM pm) {
        boolean rowUpdated = false;
        try {
            Connection conexion = conectar();
            PreparedStatement statement = conexion.prepareStatement(ACTUALIZAR_PM);
            statement.setInt(1, pm.getIdAdmin());
            statement.setString(2, pm.getCargo());
            statement.setString(3, pm.getCompetencia());
            statement.setString(4, pm.getNombre());
            statement.setString(5, pm.getPass());
            statement.setString(6, pm.getAp());
            statement.setString(7, pm.getAm());
            statement.setString(8, pm.getMail());
            statement.setString(9, pm.getTel());
            statement.setString(10, pm.getSal());
            statement.setInt(11, 1);
            rowUpdated = statement.executeUpdate() > 0;

            statement.close();
            conexion.close();
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rowUpdated;
    }

    @Override
    public boolean borrarPM(Integer idPM) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public List<PM> leerPms(Integer idAdmin) {

        String nom;
        Integer idPm, idAdmins;
        List<PM> nombres = new ArrayList<>();
        PM pm = null;
        try {
            Connection conexion = conectar();
            PreparedStatement ps = conexion.prepareStatement(LEER_PM_DIRI_AD);
            ps.setInt(1, idAdmin);

            ResultSet resultSet = ps.executeQuery();

            while (resultSet.next()) {
                idPm = resultSet.getInt("idPm");
                nom = resultSet.getString("nom");

                pm = new PM(idPm, nom);
                nombres.add(pm);
            }

            resultSet.close();
            ps.close();
            conexion.close();
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return nombres;

    }

    public List<Proyecto> leerPrPmsAsociados(Integer idAdmin, Integer idPm) {

        String nom, edo, cost, espc;
        Date ff, fi;
        Integer idPms, idAdmins, idPrs;
        List<Proyecto> nombres = new ArrayList<>();
        Proyecto pr = null;
        try {
            Connection conexion = conectar();
            PreparedStatement ps = conexion.prepareStatement(LEER_PM_ASC_AD);
            ps.setInt(1, idAdmin);
            ps.setInt(2, idPm);
            ResultSet resultSet = ps.executeQuery();

            while (resultSet.next()) {
                idPrs = resultSet.getInt("idPr");
                idAdmins = resultSet.getInt("idAdmin");
                idPms = resultSet.getInt("idPm");
                nom = resultSet.getString("nPr");
                fi = resultSet.getDate("fini");
                ff = resultSet.getDate("ffin");
                edo = resultSet.getString("edo");
                cost = resultSet.getString("costo");
                espc = resultSet.getString("especific");

                pr = new Proyecto(idPrs, idAdmin, idPm, nom, fi, fi, cost, edo, espc);
                nombres.add(pr);
            }

            resultSet.close();
            ps.close();
            conexion.close();
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return nombres;

    }

}
