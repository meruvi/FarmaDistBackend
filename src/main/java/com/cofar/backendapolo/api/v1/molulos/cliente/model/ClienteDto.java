package com.cofar.backendapolo.api.v1.molulos.cliente.model;

public class ClienteDto {

    private int codCliente = 0;
    private String nombreCliente = "";

    public int getCodCliente() {
        return codCliente;
    }

    public void setCodCliente(int codCliente) {
        this.codCliente = codCliente;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }
}
