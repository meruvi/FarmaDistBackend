package com.cofar.backendapolo.pruebasCRUD.model;

public class Pais {
    private int codPais = 0;
    private String nombrePais = "";
    private String nacionalidad = "";
    private int codEstadoRegistro = 0;
    private EstadoRegistro estadoRegistro = null;

    public int getCodPais() {
        return codPais;
    }

    public void setCodPais(int codPais) {
        this.codPais = codPais;
    }

    public String getNombrePais() {
        return nombrePais;
    }

    public void setNombrePais(String nombrePais) {
        this.nombrePais = nombrePais;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public int getCodEstadoRegistro() {
        return codEstadoRegistro;
    }

    public void setCodEstadoRegistro(int codEstadoRegistro) {
        this.codEstadoRegistro = codEstadoRegistro;
    }

    public EstadoRegistro getEstadoRegistro() {
        return estadoRegistro;
    }

    public void setEstadoRegistro(EstadoRegistro estadoRegistro) {
        this.estadoRegistro = estadoRegistro;
    }

}
