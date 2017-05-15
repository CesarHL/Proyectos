package com.ipn.spring.pojo;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class Modulo implements Serializable {

    private Integer idModulo;
    private String estado;
    private Date fechaInicio;
    private Date fechaFin;
    private String descripcion;
    private List<Actividad> hasActividades;
    private List<Desarrollador> hasDesarrolladores;

    public Modulo() {
    }

    public Modulo(Integer idModulo, String estado, Date fechaInicio, Date fechaFin, String descripcion, List<Actividad> hasActividades, List<Desarrollador> hasDesarrolladores) {
        this.idModulo = idModulo;
        this.estado = estado;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.descripcion = descripcion;
        this.hasActividades = hasActividades;
        this.hasDesarrolladores = hasDesarrolladores;
    }

    public Integer getIdModulo() {
        return idModulo;
    }

    public void setIdModulo(Integer idModulo) {
        this.idModulo = idModulo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
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

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public List<Actividad> getHasActividades() {
        return hasActividades;
    }

    public void setHasActividades(List<Actividad> hasActividades) {
        this.hasActividades = hasActividades;
    }

    public List<Desarrollador> getHasDesarrolladores() {
        return hasDesarrolladores;
    }

    public void setHasDesarrolladores(List<Desarrollador> hasDesarrolladores) {
        this.hasDesarrolladores = hasDesarrolladores;
    }

    @Override
    public String toString() {
        return "Modulo{" + "idModulo=" + idModulo + ", estado=" + estado + ", fechaInicio=" + fechaInicio + ", fechaFin=" + fechaFin + ", descripcion=" + descripcion + ", hasActividades=" + hasActividades + ", hasDesarrolladores=" + hasDesarrolladores + '}';
    }

}
