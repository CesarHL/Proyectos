package com.ipn.spring.dao;

import static com.ipn.spring.conexion.ConexionOracle.conectar;
import com.ipn.spring.pojo.Administrador;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class UserDAO implements IUserDAO {

    public static final String CREAR_USUARIO = "INSERT INTO admin(uname, uap, email, job, pass, cpass) VALUES (?, ?, ?, ?, ?, ?)";
    public static final String LEER_ID = "SELECT * FROM admin WHERE uno = ?";
    public static final String LEER_TODOS = "SELECT * FROM admin";
    public static final String ACTUALIZAR_USUARIO = "UPDATE admin SET uname = ?, uap = ?, email = ?, job = ?, pass = ?, cpass = ? WHERE uno = ?";
    public static final String BORRAR_USUARIO = "DELETE FROM admin WHERE uno = ?";
    public static final String LEER_CORREO_PASS = "SELECT * FROM admin WHERE email=? AND pass=?";

    @Override
    public boolean crearUsuario(Administrador admin) {
        boolean creado = false;
        try {
            Connection conexion = conectar();
            PreparedStatement statement = conexion.prepareStatement(CREAR_USUARIO);
            statement.setString(1, admin.getUname());
            statement.setString(2, admin.getUap());
            statement.setString(3, admin.getEmail());
            statement.setString(4, admin.getJob());
            statement.setString(5, admin.getPass());
            statement.setString(6, admin.getCpass());
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
    public Administrador leerUsuarioId(Integer idUsuario) {
        Administrador user = null;
        try {
            Connection conexion = conectar();
            PreparedStatement ps = conexion.prepareStatement(LEER_ID);
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

                user = new Administrador(uid, nombre, ap, email, job, pass, cpass);
            }

            resultSet.close();
            ps.close();
            conexion.close();
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return user;
    }

    public Administrador leerCorreoContraseña(String mail, String pass) throws SQLException, ClassNotFoundException {
        Administrador user = null;
        Connection conexion = conectar();
        PreparedStatement ps = conexion.prepareStatement(LEER_CORREO_PASS);
        ps.setString(1, mail);
        ps.setString(2, pass);
        ResultSet resultSet = ps.executeQuery();

        if (resultSet.next()) {
            String email = resultSet.getString("email");
            String pas = resultSet.getString("pass");
            String job = resultSet.getString("job");

            user = new Administrador(email, job, pass);
            System.out.println(email + pas);
        } else {
            System.out.println("No encontrado");
        }

        return user;

    }

    @Override
    public List<Administrador> leerUsuarios() {

        List<Administrador> listaUsuarios = new ArrayList<>();

        try {
            Connection conexion = conectar();
            PreparedStatement ps = conexion.prepareStatement(LEER_TODOS);
            ResultSet resultSet = ps.executeQuery();

            while (resultSet.next()) {
                Integer uid = resultSet.getInt("uno");
                String nombre = resultSet.getString("uname");
                String ap = resultSet.getString("uap");
                String email = resultSet.getString("email");
                String job = resultSet.getString("job");
                String pass = resultSet.getString("pass");
                String cpass = resultSet.getString("cpass");

                Administrador user = new Administrador(uid, nombre, ap, email, job, pass, cpass);
                listaUsuarios.add(user);
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
    public boolean actualizarUsuario(Administrador admin) {
        boolean rowUpdated = false;
        try {
            Connection conexion = conectar();
            PreparedStatement statement = conexion.prepareStatement(ACTUALIZAR_USUARIO);
            statement.setString(1, admin.getUname());
            statement.setString(2, admin.getUap());
            statement.setString(3, admin.getEmail());
            statement.setString(4, admin.getJob());
            statement.setString(5, admin.getPass());
            statement.setString(6, admin.getCpass());
            statement.setInt(7, admin.getUno());
            rowUpdated = statement.executeUpdate() > 0;

            statement.close();
            conexion.close();
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rowUpdated;
    }

    @Override
    public boolean borrarUsuario(Integer idUsuario) {
        boolean rowUpdated = false;
        try {
            Connection conexion = conectar();
            PreparedStatement statement = conexion.prepareStatement(BORRAR_USUARIO);
            statement.setInt(1, idUsuario);

            rowUpdated = statement.executeUpdate() > 0;

            statement.close();
            conexion.close();
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return rowUpdated;
    }

}
