package com.ipn.spring.pojo;

import java.io.Serializable;
import java.util.Date;

public class Modulo implements Serializable {

    private Integer idModulo;
    private Integer idPr;
    private Integer idPm;
    private Integer idDev;
    private String nombre;
    private String estadoMod;
    private Date fechaInicio;
    private Date fechaFin;
    private String descripcion;

    public Modulo() {
    }

    public Modulo(Integer idPr, Integer idPm, Integer idDev, String nombre, String estadoMod, Date fechaInicio, Date fechaFin, String descripcion) {
        this.idPr = idPr;
        this.idPm = idPm;
        this.idDev = idDev;
        this.nombre = nombre;
        this.estadoMod = estadoMod;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.descripcion = descripcion;
    }

    public Modulo(Integer idModulo, Integer idPr, Integer idPm, Integer idDev, String nombre, String estadoMod, Date fechaInicio, Date fechaFin, String descripcion) {
        this.idModulo = idModulo;
        this.idPr = idPr;
        this.idPm = idPm;
        this.idDev = idDev;
        this.nombre = nombre;
        this.estadoMod = estadoMod;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.descripcion = descripcion;
    }

    public Integer getIdModulo() {
        return idModulo;
    }

    public void setIdModulo(Integer idModulo) {
        this.idModulo = idModulo;
    }

    public Integer getIdPr() {
        return idPr;
    }

    public void setIdPr(Integer idPr) {
        this.idPr = idPr;
    }

    public Integer getIdPm() {
        return idPm;
    }

    public void setIdPm(Integer idPm) {
        this.idPm = idPm;
    }

    public Integer getIdDev() {
        return idDev;
    }

    public void setIdDev(Integer idDev) {
        this.idDev = idDev;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEstadoMod() {
        return estadoMod;
    }

    public void setEstadoMod(String estadoMod) {
        this.estadoMod = estadoMod;
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

    @Override
    public String toString() {
        return "Modulo{" + "idModulo=" + idModulo + ", idPr=" + idPr + ", idPm=" + idPm + ", idDev=" + idDev + ", nombre=" + nombre + ", estadoMod=" + estadoMod + ", fechaInicio=" + fechaInicio + ", fechaFin=" + fechaFin + ", descripcion=" + descripcion + '}';
    }

}
