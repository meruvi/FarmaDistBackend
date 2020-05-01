package com.cofar.backendapolo.almacenesVentas.model;

public class AlmacenVentaDto {

    private int codAlmacenVenta = 0;
    private String nombreAlmacenVenta = "";

    public int getCodAlmacenVenta() {
        return codAlmacenVenta;
    }

    public void setCodAlmacenVenta(int codAlmacenVenta) {
        this.codAlmacenVenta = codAlmacenVenta;
    }

    public String getNombreAlmacenVenta() {
        return nombreAlmacenVenta;
    }

    public void setNombreAlmacenVenta(String nombreAlmacenVenta) {
        this.nombreAlmacenVenta = nombreAlmacenVenta;
    }
}
