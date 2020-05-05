package com.cofar.backendapolo.api.v1.molulos.tipoCliente.model;

public class TipoCliente {

    private int codTipoCliente = 0;
    private String nombreTipoCliente = "";
    private String obsTipoCliente = "";
    private int codEstadoRegistro = 0;

    public int getCodTipoCliente() {
        return codTipoCliente;
    }

    public void setCodTipoCliente(int codTipoCliente) {
        this.codTipoCliente = codTipoCliente;
    }

    public String getNombreTipoCliente() {
        return nombreTipoCliente;
    }

    public void setNombreTipoCliente(String nombreTipoCliente) {
        this.nombreTipoCliente = nombreTipoCliente;
    }

    public String getObsTipoCliente() {
        return obsTipoCliente;
    }

    public void setObsTipoCliente(String obsTipoCliente) {
        this.obsTipoCliente = obsTipoCliente;
    }

    public int getCodEstadoRegistro() {
        return codEstadoRegistro;
    }

    public void setCodEstadoRegistro(int codEstadoRegistro) {
        this.codEstadoRegistro = codEstadoRegistro;
    }
}
