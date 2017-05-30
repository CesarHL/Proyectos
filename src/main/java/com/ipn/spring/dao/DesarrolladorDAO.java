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

    public static final String CREAR_DESARROLLADOR = "insert into desarrollador(cargoDev, competencia, nomDev, apDev, amDev, mailDev, tel, salDev) \n" +
"	values (?, ?, ?, ?, ?, ?, ?, ?)";
    public static final String LEER_ID_DESARROLLADOR = "SELECT * FROM Usuario WHERE uno = ?";
    public static final String LEER_TODOS_DESARROLLADOR = "SELECT * FROM Usuario";
    public static final String ACTUALIZAR_DESARROLLADOR = "UPDATE Usuario SET uname = ?, uap = ?, email = ?, job = ?, pass = ?, cpass = ? WHERE uno = ?";
    public static final String BORRAR_DESARROLLADOR = "DELETE FROM Usuario WHERE uno = ?";

    @Override
    public boolean crearDesarrollador(Desarrollador desarrollador) {
        boolean creado = false;
        System.out.println(desarrollador);
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
    public Desarrollador leerDesarrolladorId(Integer idUsuario) {
        Desarrollador user = null;
        try {
            Connection conexion = conectar();
            PreparedStatement ps = conexion.prepareStatement(LEER_ID_DESARROLLADOR);
            ps.setInt(1, idUsuario);
            ResultSet resultSet = ps.executeQuery();

            if (resultSet.next()) {
                Integer uid = resultSet.getInt("uno");
                String nombre = resultSet.getString("uname");
                String ap = resultSet.getString("uap");
                String email = resultSet.getString("email");
                String job = resultSet.getString("job");
                String pass = resultSet.getString("pass");
                String cpass = resultSet.getString("cpass");

                // user = new Desarrollador(uid, nombre, ap, email, job, pass, cpass);
            }

            resultSet.close();
            ps.close();
            conexion.close();
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return user;
    }

    @Override
    public List<Desarrollador> leerDesarrolladores() {

        List<Desarrollador> listaUsuarios = new ArrayList<>();

        try {
            Connection conexion = conectar();
            PreparedStatement ps = conexion.prepareStatement(LEER_TODOS_DESARROLLADOR);
            ResultSet resultSet = ps.executeQuery();

            while (resultSet.next()) {
                Integer uid = resultSet.getInt("uno");
                String nombre = resultSet.getString("uname");
                String ap = resultSet.getString("uap");
                String email = resultSet.getString("email");
                String job = resultSet.getString("job");
                String pass = resultSet.getString("pass");
                String cpass = resultSet.getString("cpass");

                // Desarrollador user = new Desarrollador(uid, nombre, ap, email, job, pass, cpass);
                //listaUsuarios.add(user);
            }

            resultSet.close();
            ps.close();
            conexion.close();
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println(listaUsuarios);
        return listaUsuarios;
    }

    @Override
    public boolean actualizarDesarrollador(Desarrollador usuario) {
        boolean rowUpdated = false;
        
        return rowUpdated;
    }

    @Override
    public boolean borrarDesarrollador(Desarrollador desarrollador) {
        boolean rowUpdated = false;
        try {
            Connection conexion = conectar();
            PreparedStatement statement = conexion.prepareStatement(BORRAR_DESARROLLADOR);
           // statement.setInt(1, usuario.getUno());

            rowUpdated = statement.executeUpdate() > 0;

            statement.close();
            conexion.close();
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return rowUpdated;
    }

}
