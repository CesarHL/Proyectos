package com.ipn.spring.dao;

import static com.ipn.spring.conexion.ConexionOracle.conectar;
import com.ipn.spring.pojo.Empleado;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class EmpleadoDAO {

    public static final String BORRAR_EMPLEADO = "DELETE FROM emp WHERE idEmp=?";
    public static final String ACTUALIZAR_EMPLEADO = "UPDATE emp "
            + "SET idEmp=?, idAdmin=?, cargo=?, competencia=?, nom=?, pass=?, ap=?, am=?, mail=?, tel=?, sal=? WHERE idEmp=?";
    public static final String LEER_IDEMPLEADO = "SELECT * FROM emp WHERE idEmp=?";

    public static Empleado leerProyectoId(Integer idEmpleado) {

        Empleado proyecto = new Empleado();

        try {
            Connection conexion = conectar();
            PreparedStatement statement = conexion.prepareStatement(LEER_IDEMPLEADO);
            statement.setInt(1, idEmpleado);
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                proyecto.setIdEmp(rs.getInt("idEmp"));
                proyecto.setIdAdmin(rs.getInt("idAdmin"));
                proyecto.setCargo(rs.getString("cargo"));
                proyecto.setCompetencia(rs.getString("competencia"));
                proyecto.setNom(rs.getString("nom"));
                proyecto.setPass(rs.getString("pass"));
                proyecto.setAp(rs.getString("ap"));
                proyecto.setAm(rs.getString("am"));
                proyecto.setMail(rs.getString("mail"));
                proyecto.setTel(rs.getString("tel"));
                proyecto.setSal(rs.getString("sal"));
            }

            statement.close();
            conexion.close();
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return proyecto;
    }

    public static boolean borrarEmpleado(Integer idEmpleado) {
        boolean borrado = false;
        try {
            Connection conexion = conectar();
            PreparedStatement statement = conexion.prepareStatement(BORRAR_EMPLEADO);
            statement.setInt(1, idEmpleado);
            statement.executeUpdate();
            borrado = true;
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return borrado;
    }

    public static boolean actualizarEmpleado(Empleado empleado) {
        boolean rowUpdated = false;
        try {
            Connection conexion = conectar();
            PreparedStatement statement = conexion.prepareStatement(ACTUALIZAR_EMPLEADO);

            statement.setInt(1, empleado.getIdEmp());
            statement.setInt(2, empleado.getIdAdmin());
            statement.setString(3, empleado.getCargo());
            statement.setString(4, empleado.getCompetencia());
            statement.setString(5, empleado.getNom());
            statement.setString(6, empleado.getPass());
            statement.setString(7, empleado.getAp());
            statement.setString(8, empleado.getAm());
            statement.setString(9, empleado.getMail());
            statement.setString(10, empleado.getTel());
            statement.setString(11, empleado.getSal());
            statement.setInt(12, empleado.getIdEmp());

            rowUpdated = statement.executeUpdate() > 0;

            statement.close();
            conexion.close();
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rowUpdated;
    }

}
