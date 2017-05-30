package com.ipn.spring.dao;

import com.ipn.spring.pojo.Actividad;
import java.util.List;

public interface IActividades {

    public boolean crearActividad(Actividad actividad);

    public Actividad leerActividadId(Integer idActividad);

    public List<Actividad> leerActividades();

    public boolean actualizarActividad(Actividad actividad);

    public boolean borrarActividad(Integer idActividad);

}
