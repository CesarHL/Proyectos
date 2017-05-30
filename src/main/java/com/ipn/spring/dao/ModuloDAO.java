package com.ipn.spring.dao;

import com.ipn.spring.pojo.Modulo;
import java.util.List;

public class ModuloDAO implements IModulo {

    public static final String CREAR_MODULO = "insert into modulo(nomAct, fechaInicio, fechaFin, estado) values (?, ?, ?, ?)";
    public static final String LEER_ID_MODULO = "SELECT * FROM modulo WHERE idMod = ?";
    public static final String LEER_TODOS = "SELECT * FROM modulo";
    public static final String ACTUALIZAR_MODULOS = "UPDATE modulo SET nomAct = ?, fechaInicio = ?, fechaFin = ?, estado = ? WHERE idMod = ?";
    public static final String BORRAR_MODULOS = "DELETE FROM modulo WHERE idMod = ?";

    @Override
    public boolean crearModulo(Modulo modulo) {
//        for (Integer seat : list) {
//            ps.setInt(8, seat);
//            ps.addBatch();
//        }
//        ps.executeBatch();
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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

}
