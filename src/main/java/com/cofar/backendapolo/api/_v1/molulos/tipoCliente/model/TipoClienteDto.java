package com.cofar.backendapolo.api._v1.molulos.tipoCliente.model;

public class TipoClienteDto {

    private int codTipoCliente = 0;
    private String nombreTipoCliente = "";

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
}
