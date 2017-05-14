package com.ipn.spring.pojo;

import java.io.Serializable;
import java.util.Date;

public class Proyecto implements Serializable {

    private Integer idProyecto;
    private String nombre;
    private Date fechaInicio;
    private Date fechaFin;
    private String estado;
    private String especificaciones;
    private String alcance;
    private Integer costoFijo;
    private Integer costoVariable;

    public Proyecto() {
    }

    public Proyecto(Integer idProyecto, String nombre, Date fechaInicio, Date fechaFin, String estado, String especificaciones, String alcance, Integer costoFijo, Integer costoVariable) {
        this.idProyecto = idProyecto;
        this.nombre = nombre;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.estado = estado;
        this.especificaciones = especificaciones;
        this.alcance = alcance;
        this.costoFijo = costoFijo;
        this.costoVariable = costoVariable;
    }

    public Integer getIdProyecto() {
        return idProyecto;
    }

    public void setIdProyecto(Integer idProyecto) {
        this.idProyecto = idProyecto;
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

    public String getEspecificaciones() {
        return especificaciones;
    }

    public void setEspecificaciones(String especificaciones) {
        this.especificaciones = especificaciones;
    }

    public String getAlcance() {
        return alcance;
    }

    public void setAlcance(String alcance) {
        this.alcance = alcance;
    }

    public Integer getCostoFijo() {
        return costoFijo;
    }

    public void setCostoFijo(Integer costoFijo) {
        this.costoFijo = costoFijo;
    }

    public Integer getCostoVariable() {
        return costoVariable;
    }

    public void setCostoVariable(Integer costoVariable) {
        this.costoVariable = costoVariable;
    }

    @Override
    public String toString() {
        return "Proyecto{" + "idProyecto=" + idProyecto + ", nombre=" + nombre + ", fechaInicio=" + fechaInicio + ", fechaFin=" + fechaFin + ", estado=" + estado + ", especificaciones=" + especificaciones + ", alcance=" + alcance + ", costoFijo=" + costoFijo + ", costoVariable=" + costoVariable + '}';
    }

}
