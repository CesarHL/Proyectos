package com.ipn.spring.pojo;

import java.io.Serializable;

public class Administrador implements Serializable {

    private String cargo;
    private String competencia;
    private String nom;
    private String pass;
    private String ap;
    private String am;
    private String mail;
    private String tel;
    private String sal;

    public Administrador() {
    }

    public Administrador(String cargo, String competencia, String nom, String pass, String ap, String am, String mail, String tel, String sal) {
        this.cargo = cargo;
        this.competencia = competencia;
        this.nom = nom;
        this.pass = pass;
        this.ap = ap;
        this.am = am;
        this.mail = mail;
        this.tel = tel;
        this.sal = sal;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getCompetencia() {
        return competencia;
    }

    public void setCompetencia(String competencia) {
        this.competencia = competencia;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getAp() {
        return ap;
    }

    public void setAp(String ap) {
        this.ap = ap;
    }

    public String getAm() {
        return am;
    }

    public void setAm(String am) {
        this.am = am;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getSal() {
        return sal;
    }

    public void setSal(String sal) {
        this.sal = sal;
    }

    @Override
    public String toString() {
        return "Administrador{" + "cargo=" + cargo + ", competencia=" + competencia + ", nom=" + nom + ", pass=" + pass + ", ap=" + ap + ", am=" + am + ", mail=" + mail + ", tel=" + tel + ", sal=" + sal + '}';
    }

}
