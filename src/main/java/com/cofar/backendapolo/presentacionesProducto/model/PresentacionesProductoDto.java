package com.cofar.backendapolo.presentacionesProducto.model;

public class PresentacionesProductoDto {

    private int codPresentacion = 0;
    private String nombreProductoPresentacion = "";

    public int getCodPresentacion() {
        return codPresentacion;
    }

    public void setCodPresentacion(int codPresentacion) {
        this.codPresentacion = codPresentacion;
    }

    public String getNombreProductoPresentacion() {
        return nombreProductoPresentacion;
    }

    public void setNombreProductoPresentacion(String nombreProductoPresentacion) {
        this.nombreProductoPresentacion = nombreProductoPresentacion;
    }
}
