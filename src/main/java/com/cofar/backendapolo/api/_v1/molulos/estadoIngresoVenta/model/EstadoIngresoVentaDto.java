package com.cofar.backendapolo.api._v1.molulos.estadoIngresoVenta.model;

public class EstadoIngresoVentaDto {

    private int codEstadoIngresoVentas = 0;
    private String nombreEstadoIngresoVenta = "";

    public int getCodEstadoIngresoVentas() {
        return codEstadoIngresoVentas;
    }

    public void setCodEstadoIngresoVentas(int codEstadoIngresoVentas) {
        this.codEstadoIngresoVentas = codEstadoIngresoVentas;
    }

    public String getNombreEstadoIngresoVenta() {
        return nombreEstadoIngresoVenta;
    }

    public void setNombreEstadoIngresoVenta(String nombreEstadoIngresoVenta) {
        this.nombreEstadoIngresoVenta = nombreEstadoIngresoVenta;
    }
}
