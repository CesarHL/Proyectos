package com.ipn.spring.conexion;

import com.ipn.spring.dao.UserDAO;
import com.ipn.spring.pojo.Usuario;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionOracle {

    static String url = "jdbc:oracle:thin:@localhost:1521:XE";
    static Connection connection;

    public static Connection conectar() throws SQLException, ClassNotFoundException {
        Class.forName("oracle.jdbc.driver.OracleDriver");

        connection = DriverManager.getConnection(url, "topicos", "topicos");

        return connection;
    }

    protected void desconectar() throws SQLException {
        connection.close();
    }

}
