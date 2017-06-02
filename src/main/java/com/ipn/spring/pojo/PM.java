package com.ipn.spring.pojo;

public class PM {

    private Integer idPM;
    private String nombre;
    private String ap;
    private String am;
    private String email;
    private String tel;
    private String salario;

    public PM() {
    }

    public PM(String nombre) {
        this.nombre = nombre;
    }

    public PM(Integer idPM, String nombre, String ap, String am, String email, String tel, String salario) {
        this.idPM = idPM;
        this.nombre = nombre;
        this.ap = ap;
        this.am = am;
        this.email = email;
        this.tel = tel;
        this.salario = salario;
    }

    public PM(String nombre, String ap, String am, String email, String tel, String salario) {
        this.nombre = nombre;
        this.ap = ap;
        this.am = am;
        this.email = email;
        this.tel = tel;
        this.salario = salario;
    }

    public Integer getIdPM() {
        return idPM;
    }

    public void setIdPM(Integer idPM) {
        this.idPM = idPM;
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
        return "PM{" + "idPM=" + idPM + ", nombre=" + nombre + ", ap=" + ap + ", am=" + am + ", email=" + email + ", tel=" + tel + ", salario=" + salario + '}';
    }

}
