package com.ipn.spring.pojo;

public class Desarrollador {

    private Integer idDev;
    private Integer idPM;
    private Integer idAdmin;
    private String cargo;
    private String competencia;
    private String nombre;
    private String pass;
    private String ap;
    private String am;
    private String mail;
    private String tel;
    private String salario;

    public Desarrollador() {
    }

    public Desarrollador(Integer idDev, Integer idPM, Integer idAdmin, String cargo, String competencia, String nombre, String pass, String ap, String am, String mail, String tel, String salario) {
        this.idDev = idDev;
        this.idPM = idPM;
        this.idAdmin = idAdmin;
        this.cargo = cargo;
        this.competencia = competencia;
        this.nombre = nombre;
        this.pass = pass;
        this.ap = ap;
        this.am = am;
        this.mail = mail;
        this.tel = tel;
        this.salario = salario;
    }

    public Integer getIdDev() {
        return idDev;
    }

    public void setIdDev(Integer idDev) {
        this.idDev = idDev;
    }

    public Integer getIdPM() {
        return idPM;
    }

    public void setIdPM(Integer idPM) {
        this.idPM = idPM;
    }

    public Integer getIdAdmin() {
        return idAdmin;
    }

    public void setIdAdmin(Integer idAdmin) {
        this.idAdmin = idAdmin;
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

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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

    public String getSalario() {
        return salario;
    }

    public void setSalario(String salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Desarrollador{" + "idDev=" + idDev + ", idPM=" + idPM + ", idAdmin=" + idAdmin + ", cargo=" + cargo + ", competencia=" + competencia + ", nombre=" + nombre + ", pass=" + pass + ", ap=" + ap + ", am=" + am + ", mail=" + mail + ", tel=" + tel + ", salario=" + salario + '}';
    }

}
