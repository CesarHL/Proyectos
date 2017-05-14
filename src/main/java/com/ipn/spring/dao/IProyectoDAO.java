package com.ipn.spring.dao;

import com.ipn.spring.pojo.Proyecto;
import java.util.List;

public interface IProyectoDAO {

    public void crearProyecto(Proyecto proyecto);

    public Proyecto leerProyectoId(Integer idProyecto);

    public List<Proyecto> leerProyectos();

    public boolean actualizarProyectos(Proyecto proyecto);

    public boolean borrarProyectos(Proyecto proyecto);
}
