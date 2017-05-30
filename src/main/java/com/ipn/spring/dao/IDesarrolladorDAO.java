package com.ipn.spring.dao;

import com.ipn.spring.pojo.Desarrollador;
import java.util.List;

public interface IDesarrolladorDAO {

    public boolean crearDesarrollador(Desarrollador desarrollador);

    public Desarrollador leerDesarrolladorId(Integer idDesarrollador);

    public List<Desarrollador> leerDesarrolladores();

    public boolean actualizarDesarrollador(Desarrollador desarrollador);

    public boolean borrarDesarrollador(Desarrollador desarrollador);
}
