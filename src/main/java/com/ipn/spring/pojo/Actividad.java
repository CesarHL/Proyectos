package com.ipn.spring.pojo;

import java.io.Serializable;
import java.util.Date;

public class Actividad implements Serializable {

    private Integer idActividad;
    private String nombre;
    private Date fechaInicio;
    private Date fechaFin;
    private String estado;

    public Actividad() {
    }

    public Actividad(Integer idActividad, String nombre, Date fechaInicio, Date fechaFin, String estado) {
        this.idActividad = idActividad;
        this.nombre = nombre;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.estado = estado;
    }

    public Integer getIdActividad() {
        return idActividad;
    }

    public void setIdActividad(Integer idActividad) {
        this.idActividad = idActividad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Actividad{" + "idActividad=" + idActividad + ", nombre=" + nombre + ", fechaInicio=" + fechaInicio + ", fechaFin=" + fechaFin + ", estado=" + estado + '}';
    }

}
