package com.cofar.backendapolo.api.v1.molulos.estadoIngresoVenta.model;

public class EstadoIngresoVenta {

    private int codEstadoIngresoVentas = 0;
    private String nombreEstadoIngresoVenta = "";
    private String obsEstadoIngresoVenta = "";

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

    public String getObsEstadoIngresoVenta() {
        return obsEstadoIngresoVenta;
    }

    public void setObsEstadoIngresoVenta(String obsEstadoIngresoVenta) {
        this.obsEstadoIngresoVenta = obsEstadoIngresoVenta;
    }
}
