package com.ipn.spring.pojo;

import java.io.Serializable;
import java.util.Date;

public class Proyecto implements Serializable {

    private Integer idAdmin;
    private Integer idPm;
    private String nombrePr;
    private Date fIni;
    private Date fFin;
    private String costo;
    private String estado;
    private String especific;

    public Proyecto() {
    }

    public Proyecto(Integer idAdmin, Integer idPm, String nombrePr, Date fIni, Date fFin, String costo, String estado, String especific) {
        this.idAdmin = idAdmin;
        this.idPm = idPm;
        this.nombrePr = nombrePr;
        this.fIni = fIni;
        this.fFin = fFin;
        this.costo = costo;
        this.estado = estado;
        this.especific = especific;
    }

    public Integer getIdAdmin() {
        return idAdmin;
    }

    public void setIdAdmin(Integer idAdmin) {
        this.idAdmin = idAdmin;
    }

    public Integer getIdPm() {
        return idPm;
    }

    public void setIdPm(Integer idPm) {
        this.idPm = idPm;
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

    public String getCosto() {
        return costo;
    }

    public void setCosto(String costo) {
        this.costo = costo;
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
        return "Proyecto{" + "idAdmin=" + idAdmin + ", idPm=" + idPm + ", nombrePr=" + nombrePr + ", fIni=" + fIni + ", fFin=" + fFin + ", costo=" + costo + ", estado=" + estado + ", especific=" + especific + '}';
    }

}
