package com.ipn.spring.dao;

import static com.ipn.spring.conexion.ConexionOracle.conectar;
import com.ipn.spring.pojo.PM;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PMDAO implements IPMDAO {

    public static final String LEER_PM_DIRI_AD = "SELECT nomPm FROM pm where idAdmin=?";

    @Override
    public boolean crearPM(PM pm) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
    public boolean actualizarModulo(PM pm) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean borrarPM(Integer idPM) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public List<PM> leerPms(Integer idPm) {
        String nomPm = null;
        List<PM> nombres = new ArrayList<>();
        PM pm = null;
        try {
            Connection conexion = conectar();
            PreparedStatement ps = conexion.prepareStatement(LEER_PM_DIRI_AD);
            ps.setInt(1, idPm);
            ResultSet resultSet = ps.executeQuery();

            while (resultSet.next()) {

                nomPm = resultSet.getString("nomPm");
                
                pm = new PM(nomPm);
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

}
