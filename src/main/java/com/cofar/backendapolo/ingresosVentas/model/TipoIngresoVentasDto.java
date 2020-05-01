package com.cofar.backendapolo.ingresosVentas.model;

public class TipoIngresoVentasDto {

    private int codTipoIngresoVenta = 0;
    private String nombreTipoIngresoVenta = "";

    public int getCodTipoIngresoVenta() {
        return codTipoIngresoVenta;
    }

    public void setCodTipoIngresoVenta(int codTipoIngresoVenta) {
        this.codTipoIngresoVenta = codTipoIngresoVenta;
    }

    public String getNombreTipoIngresoVenta() {
        return nombreTipoIngresoVenta;
    }

    public void setNombreTipoIngresoVenta(String nombreTipoIngresoVenta) {
        this.nombreTipoIngresoVenta = nombreTipoIngresoVenta;
    }
}
