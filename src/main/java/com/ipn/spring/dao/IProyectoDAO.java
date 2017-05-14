package com.ipn.spring.dao;

import com.ipn.spring.pojo.Proyecto;
import java.util.List;

public interface IProyectoDAO {

    public void crearUsuario(Proyecto proyecto);

    public Proyecto leerUsuarioId(Integer idProyecto);

    public List<Proyecto> leerUsuarios();

    public boolean actualizarUsuario(Proyecto proyecto);

    public boolean borrarUsuario(Proyecto proyecto);
}
