package com.cofar.backendapolo.api.v1.molulos.almacenVenta.model;

public class AlmacenVenta {

    private int codAlmacenVenta = 0;
    private int codTipoAlmacenVenta = 0;
    private String nombreAlmacenVenta = "";
    private int codAreaEmpresa = 0;
    private int codEstadoRegistro = 0;
    private String obsAlmacenVenta = "";

    public int getCodAlmacenVenta() {
        return codAlmacenVenta;
    }

    public void setCodAlmacenVenta(int codAlmacenVenta) {
        this.codAlmacenVenta = codAlmacenVenta;
    }

    public int getCodTipoAlmacenVenta() {
        return codTipoAlmacenVenta;
    }

    public void setCodTipoAlmacenVenta(int codTipoAlmacenVenta) {
        this.codTipoAlmacenVenta = codTipoAlmacenVenta;
    }

    public String getNombreAlmacenVenta() {
        return nombreAlmacenVenta;
    }

    public void setNombreAlmacenVenta(String nombreAlmacenVenta) {
        this.nombreAlmacenVenta = nombreAlmacenVenta;
    }

    public int getCodAreaEmpresa() {
        return codAreaEmpresa;
    }

    public void setCodAreaEmpresa(int codAreaEmpresa) {
        this.codAreaEmpresa = codAreaEmpresa;
    }

    public int getCodEstadoRegistro() {
        return codEstadoRegistro;
    }

    public void setCodEstadoRegistro(int codEstadoRegistro) {
        this.codEstadoRegistro = codEstadoRegistro;
    }

    public String getObsAlmacenVenta() {
        return obsAlmacenVenta;
    }

    public void setObsAlmacenVenta(String obsAlmacenVenta) {
        this.obsAlmacenVenta = obsAlmacenVenta;
    }
}
