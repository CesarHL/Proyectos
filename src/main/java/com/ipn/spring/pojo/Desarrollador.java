package com.ipn.spring.pojo;

public class Desarrollador extends Usuario {

    private Integer idDesarrollador;
    private Integer salario;
    private String capacidades;

    public Desarrollador() {
    }

    public Desarrollador(Integer idDesarrollador, Integer salario, String capacidades) {
        this.idDesarrollador = idDesarrollador;
        this.salario = salario;
        this.capacidades = capacidades;
    }

    public Integer getIdDesarrollador() {
        return idDesarrollador;
    }

    public void setIdDesarrollador(Integer idDesarrollador) {
        this.idDesarrollador = idDesarrollador;
    }

    public Integer getSalario() {
        return salario;
    }

    public void setSalario(Integer salario) {
        this.salario = salario;
    }

    public String getCapacidades() {
        return capacidades;
    }

    public void setCapacidades(String capacidades) {
        this.capacidades = capacidades;
    }

    @Override
    public String toString() {
        return "Desarrollador{" + "idDesarrollador=" + idDesarrollador + ", salario=" + salario + ", capacidades=" + capacidades + '}';
    }

}
