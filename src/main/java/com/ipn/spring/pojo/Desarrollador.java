package com.ipn.spring.pojo;

public class Desarrollador {

    private Integer idDesarrollador;
    private String cargo;
    private String competencia;
    private String nombre;
    private String ap;
    private String am;
    private String email;
    private String tel;
    private String salario;

    public Desarrollador() {
    }

    public Desarrollador(Integer idDesarrollador, String cargo, String competencia, String nombre, String ap, String am, String email, String tel, String salario) {
        this.idDesarrollador = idDesarrollador;
        this.cargo = cargo;
        this.competencia = competencia;
        this.nombre = nombre;
        this.ap = ap;
        this.am = am;
        this.email = email;
        this.tel = tel;
        this.salario = salario;
    }

    public Desarrollador(String cargo, String competencia, String nombre, String ap, String am, String email, String tel, String salario) {
        this.cargo = cargo;
        this.competencia = competencia;
        this.nombre = nombre;
        this.ap = ap;
        this.am = am;
        this.email = email;
        this.tel = tel;
        this.salario = salario;
    }

    public Integer getIdDesarrollador() {
        return idDesarrollador;
    }

    public void setIdDesarrollador(Integer idDesarrollador) {
        this.idDesarrollador = idDesarrollador;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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
        return "Desarrollador{" + "idDesarrollador=" + idDesarrollador + ", cargo=" + cargo + ", competencia=" + competencia + ", nombre=" + nombre + ", ap=" + ap + ", am=" + am + ", email=" + email + ", tel=" + tel + ", salario=" + salario + '}';
    }

}
