package com.ipn.spring.dao;

import static com.ipn.spring.conexion.ConexionOracle.conectar;
import com.ipn.spring.pojo.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class UserDAO implements IUserDAO {

    public static final String CREAR_USUARIO = "INSERT INTO Usuario (uname, uap, email, job, pass, cpass) VALUES (?, ?, ?, ?, ?, ?)";
    public static final String LEER_ID = "SELECT * FROM Usuario WHERE uno = ?";
    public static final String LEER_TODOS = "SELECT * FROM Usuario";
    public static final String ACTUALIZAR_USUARIO = "UPDATE Usuario SET uname = ?, uap = ?, email = ?, job = ?, pass = ?, cpass = ? WHERE uno = ?";
    public static final String BORRAR_USUARIO = "DELETE FROM Usuario WHERE uno = ?";
    public static final String LEER_CORREO_PASS = "SELECT * FROM Usuario WHERE email=? AND pass=?";

    @Override
    public boolean crearUsuario(Usuario usuario) {
        boolean creado = false;
        try {
            Connection conexion = conectar();
            PreparedStatement statement = conexion.prepareStatement(CREAR_USUARIO);
            statement.setString(1, usuario.getUname());
            statement.setString(2, usuario.getUap());
            statement.setString(3, usuario.getEmail());
            statement.setString(4, usuario.getJob());
            statement.setString(5, usuario.getPass());
            statement.setString(6, usuario.getCpass());
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
    public Usuario leerUsuarioId(Integer idUsuario) {
        Usuario user = null;
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

                user = new Usuario(uid, nombre, ap, email, job, pass, cpass);
            }

            resultSet.close();
            ps.close();
            conexion.close();
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return user;
    }

    public Usuario leerCorreoContraseña(String mail, String pass) throws SQLException, ClassNotFoundException {
        Usuario user = null;
        Connection conexion = conectar();
        PreparedStatement ps = conexion.prepareStatement(LEER_CORREO_PASS);
        ps.setString(1, mail);
        ps.setString(2, pass);
        ResultSet resultSet = ps.executeQuery();

        if (resultSet.next()) {
            String email = resultSet.getString("email");
            String pas = resultSet.getString("pass");
            String job = resultSet.getString("job");

            user = new Usuario(email, job, pass);
            System.out.println(email + pas);
        } else {
            System.out.println("No encontrado");
        }

        return user;

    }

    @Override
    public List<Usuario> leerUsuarios() {

        List<Usuario> listaUsuarios = new ArrayList<>();

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

                Usuario user = new Usuario(uid, nombre, ap, email, job, pass, cpass);
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
    public boolean actualizarUsuario(Usuario usuario) {
        boolean rowUpdated = false;
        try {
            Connection conexion = conectar();
            PreparedStatement statement = conexion.prepareStatement(ACTUALIZAR_USUARIO);
            statement.setString(1, usuario.getUname());
            statement.setString(2, usuario.getUap());
            statement.setString(3, usuario.getEmail());
            statement.setString(4, usuario.getJob());
            statement.setString(5, usuario.getPass());
            statement.setString(6, usuario.getCpass());
            statement.setInt(7, usuario.getUno());
            rowUpdated = statement.executeUpdate() > 0;

            statement.close();
            conexion.close();
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rowUpdated;
    }

    @Override
    public boolean borrarUsuario(Usuario usuario) {
        boolean rowUpdated = false;
        try {
            Connection conexion = conectar();
            PreparedStatement statement = conexion.prepareStatement(BORRAR_USUARIO);
            statement.setInt(1, usuario.getUno());

            rowUpdated = statement.executeUpdate() > 0;

            statement.close();
            conexion.close();
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return rowUpdated;
    }

}
