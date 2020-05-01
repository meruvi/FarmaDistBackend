package com.cofar.backendapolo.ingresosVentas.model;

public class TipoIngresoVentas {

    private int codTipoIngresoVenta = 0;
    private String nombreTipoIngresoVenta = "";
    private String obsTipoIngresoVenta = "";
    private int codEstadoRegistro = 0;
    private String abreviaturaTipoIngresoVenta = "";

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

    public String getObsTipoIngresoVenta() {
        return obsTipoIngresoVenta;
    }

    public void setObsTipoIngresoVenta(String obsTipoIngresoVenta) {
        this.obsTipoIngresoVenta = obsTipoIngresoVenta;
    }

    public int getCodEstadoRegistro() {
        return codEstadoRegistro;
    }

    public void setCodEstadoRegistro(int codEstadoRegistro) {
        this.codEstadoRegistro = codEstadoRegistro;
    }

    public String getAbreviaturaTipoIngresoVenta() {
        return abreviaturaTipoIngresoVenta;
    }

    public void setAbreviaturaTipoIngresoVenta(String abreviaturaTipoIngresoVenta) {
        this.abreviaturaTipoIngresoVenta = abreviaturaTipoIngresoVenta;
    }
}



