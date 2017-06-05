package com.ipn.spring.dao;

import static com.ipn.spring.conexion.ConexionOracle.conectar;
import com.ipn.spring.pojo.Administrador;
import com.ipn.spring.pojo.Empleado;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class UserDAO implements IUserDAO {

    public static final String CREAR_ADMIN = "insert into admin(cargo, competencia, nom, pass, ap, am, mail, tel, sal)  VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
    public static final String CREAR_PM = "insert into admin(cargo, competencia, nom, pass, ap, am, mail, tel, sal)  VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
    public static final String CREAR_DEV = "insert into admin(cargo, competencia, nom, pass, ap, am, mail, tel, sal)  VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
    public static final String LEER_ID = "SELECT * FROM admin WHERE idAdmin = ?";
    public static final String LEER_TODOS = "SELECT * FROM admin";
    public static final String ACTUALIZAR_USUARIO = "UPDATE admin SET uname = ?, uap = ?, email = ?, job = ?, pass = ?, cpass = ? WHERE uno = ?";
    public static final String BORRAR_USUARIO = "DELETE FROM admin WHERE uno = ?";
    public static final String LEER_EMP = "SELECT * FROM emp where mail=? AND pass=?";
    public static final String LEER_TODOS_EMP = "SELECT * FROM emp where idAdmin=?";

    @Override
    public boolean crearUsuario(Administrador admin) {
        boolean creado = false;
        try {
            if (admin.getCargo().equals("admin")) {
                Connection conexion = conectar();
                PreparedStatement statement = conexion.prepareStatement(CREAR_ADMIN);
                statement.setString(1, admin.getCargo());
                statement.setString(2, admin.getCompetencia());
                statement.setString(3, admin.getNom());
                statement.setString(4, admin.getPass());
                statement.setString(5, admin.getAp());
                statement.setString(6, admin.getAm());
                statement.setString(7, admin.getMail());
                statement.setString(8, admin.getTel());
                statement.setString(9, admin.getSal());

                statement.executeUpdate();
                statement.close();
                conexion.close();
            }
            return true;
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return creado;
    }

    @Override
    public Administrador leerUsuarioId(Integer idUsuario) {

        return null;
    }

    @Override
    public List<Administrador> leerUsuarios() {
        return null;
    }

    @Override
    public boolean actualizarUsuario(Administrador admin) {
        return false;
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

    public Empleado leerEmpleados(String correou, String passu) {
        Empleado user = null;
        try {
            Connection conexion = conectar();
            PreparedStatement ps = conexion.prepareStatement(LEER_EMP);
            ps.setString(1, correou);
            ps.setString(2, passu);

            ResultSet resultSet = ps.executeQuery();

            while (resultSet.next()) {
                Integer idEmp = resultSet.getInt("idEmp");
                Integer idAdmin = resultSet.getInt("idAdmin");
                String cargo = resultSet.getString("cargo");
                String competencia = resultSet.getString("competencia");
                String nom = resultSet.getString("nom");
                String pass = resultSet.getString("pass");
                String ap = resultSet.getString("ap");
                String am = resultSet.getString("am");
                String mail = resultSet.getString("mail");
                String tel = resultSet.getString("tel");
                String sal = resultSet.getString("sal");

                user = new Empleado(idEmp, idAdmin, cargo, competencia, nom, pass, ap, am, mail, tel, sal);
            }

            resultSet.close();
            ps.close();
            conexion.close();
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return user;
    }

    public List<Empleado> leerEmpleados(Integer idAdm) {
        List<Empleado> listaEmpleados = new ArrayList<>();

        try {
            Connection conexion = conectar();
            PreparedStatement ps = conexion.prepareStatement(LEER_TODOS_EMP);
            ps.setInt(1, idAdm);
            ResultSet resultSet = ps.executeQuery();

            while (resultSet.next()) {
                Integer idEmp = resultSet.getInt("idEmp");
                Integer idAdmin = resultSet.getInt("idAdmin");
                String cargo = resultSet.getString("cargo");
                String competencia = resultSet.getString("competencia");
                String nom = resultSet.getString("nom");
                String pass = resultSet.getString("pass");
                String ap = resultSet.getString("ap");
                String am = resultSet.getString("am");
                String mail = resultSet.getString("mail");
                String tel = resultSet.getString("tel");
                String sal = resultSet.getString("sal");

                Empleado emp = new Empleado(idEmp, idAdmin, cargo, competencia, nom, pass, ap, am, mail, tel, sal);
                listaEmpleados.add(emp);
            }

            resultSet.close();
            ps.close();
            conexion.close();
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listaEmpleados;
    }

}
