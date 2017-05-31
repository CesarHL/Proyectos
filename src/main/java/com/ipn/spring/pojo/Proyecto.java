package com.ipn.spring.pojo;

import java.io.Serializable;
import java.util.Date;

public class Proyecto implements Serializable {

    private Integer idProyecto;
    private Integer idAdmin;
    private String nombrePr;
    private Date fIni;
    private Date fFin;
    private String estado;
    private String especific;

    public Proyecto() {
    }

    public Proyecto(Integer idProyecto, Integer idAdmin, String nombrePr, Date fIni, Date fFin, String estado, String especific) {
        this.idProyecto = idProyecto;
        this.idAdmin = idAdmin;
        this.nombrePr = nombrePr;
        this.fIni = fIni;
        this.fFin = fFin;
        this.estado = estado;
        this.especific = especific;
    }

    public Proyecto(Integer idAdmin, String nombrePr, Date fIni, Date fFin, String estado, String especific) {
        this.idAdmin = idAdmin;
        this.nombrePr = nombrePr;
        this.fIni = fIni;
        this.fFin = fFin;
        this.estado = estado;
        this.especific = especific;
    }

    public Integer getIdProyecto() {
        return idProyecto;
    }

    public void setIdProyecto(Integer idProyecto) {
        this.idProyecto = idProyecto;
    }

    public Integer getIdAdmin() {
        return idAdmin;
    }

    public void setIdAdmin(Integer idAdmin) {
        this.idAdmin = idAdmin;
    }

    public String getNombrePr() {
        return nombrePr;
    }

    public void setNombrePr(String nombrePr) {
        this.nombrePr = nombrePr;
    }

    public Date getfIni() {
        return fIni;
    }

    public void setfIni(Date fIni) {
        this.fIni = fIni;
    }

    public Date getfFin() {
        return fFin;
    }

    public void setfFin(Date fFin) {
        this.fFin = fFin;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getEspecific() {
        return especific;
    }

    public void setEspecific(String especific) {
        this.especific = especific;
    }

    @Override
    public String toString() {
        return "Proyecto{" + "idProyecto=" + idProyecto + ", idAdmin=" + idAdmin + ", nombrePr=" + nombrePr + ", fIni=" + fIni + ", fFin=" + fFin + ", estado=" + estado + ", especific=" + especific + '}';
    }

}
