package com.ipn.spring.pojo;

import java.io.Serializable;

public class Usuario implements Serializable{

    private Integer uno;
    private String uname;
    private String uap;
    private String email;
    private String job;
    private String pass;
    private String cpass;

    public Usuario() {
    }

    public Usuario(Integer uno, String uname, String uap, String email, String job, String pass, String cpass) {
        this.uno = uno;
        this.uname = uname;
        this.uap = uap;
        this.email = email;
        this.job = job;
        this.pass = pass;
        this.cpass = cpass;
    }

    public Usuario(String email, String job, String pass) {
        this.email = email;
        this.job = job;
        this.pass = pass;
    }

    public Integer getUno() {
        return uno;
    }

    public void setUno(Integer uno) {
        this.uno = uno;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getUap() {
        return uap;
    }

    public void setUap(String uap) {
        this.uap = uap;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getCpass() {
        return cpass;
    }

    public void setCpass(String cpass) {
        this.cpass = cpass;
    }

    @Override
    public String toString() {
        return "Usuario{" + "uno=" + uno + ", uname=" + uname + ", uap=" + uap + ", email=" + email + ", job=" + job + ", pass=" + pass + ", cpass=" + cpass + '}';
    }

}
