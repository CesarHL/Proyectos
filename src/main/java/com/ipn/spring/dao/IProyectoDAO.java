package com.ipn.spring.dao;

import com.ipn.spring.pojo.Proyecto;
import java.util.List;

public interface IProyectoDAO {

    public void crearProyecto(Proyecto proyecto);

    public List<Proyecto> leerProyectos(Integer idAdm);

    public boolean actualizarProyectos(Proyecto proyecto);

}
