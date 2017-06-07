package com.ipn.spring.dao;

import com.ipn.spring.pojo.Modulo;
import java.util.List;

public interface IModulo {

    public void crearModulo(Modulo modulo);

    public Modulo leerModuloId(Integer idModulo);

    public List<Modulo> leerModulo();

    public boolean actualizarModulo(Modulo modulo);

    public boolean borrarModulo(Integer idModulo);
}
