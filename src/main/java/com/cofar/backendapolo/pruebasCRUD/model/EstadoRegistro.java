package com.cofar.backendapolo.pruebasCRUD.model;

import java.util.ArrayList;
import java.util.List;

public class EstadoRegistro {
    private int codEstadoRegistro;
    private String nombreEstadoRegistro;
    private String obsEstadoRegistro;
    private List<Pais> paises = new ArrayList<>();

    public int getCodEstadoRegistro() {
        return codEstadoRegistro;
    }

    public void setCodEstadoRegistro(int codEstadoRegistro) {
        this.codEstadoRegistro = codEstadoRegistro;
    }

    public String getNombreEstadoRegistro() {
        return nombreEstadoRegistro;
    }

    public void setNombreEstadoRegistro(String nombreEstadoRegistro) {
        this.nombreEstadoRegistro = nombreEstadoRegistro;
    }

    public String getObsEstadoRegistro() {
        return obsEstadoRegistro;
    }

    public void setObsEstadoRegistro(String obsEstadoRegistro) {
        this.obsEstadoRegistro = obsEstadoRegistro;
    }


    public List<Pais> getPaises() {
        return paises;
    }

    public void setPaises(List<Pais> paises) {
        this.paises = paises;
    }

}
