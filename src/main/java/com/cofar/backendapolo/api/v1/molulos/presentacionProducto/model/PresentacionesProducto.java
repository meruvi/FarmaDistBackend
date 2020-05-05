package com.cofar.backendapolo.api.v1.molulos.presentacionProducto.model;

public class PresentacionesProducto {

    private int codPresentacion = 0;
    private int codLineaMKT = 0;
    private int cantidadPresentacion = 0;
    private int codTipoMercaderia = 0;
    private String obsPresentacion = "";
    private int codEstadoPresentacionProducto = 0;
    private String nombreProductoPresentacion = "";
    private int codTipoPresentacion = 0;
    private int codCategoria = 0;
    private double peso = 0.0D;

    public int getCodPresentacion() {
        return codPresentacion;
    }

    public void setCodPresentacion(int codPresentacion) {
        this.codPresentacion = codPresentacion;
    }

    public int getCodLineaMKT() {
        return codLineaMKT;
    }

    public void setCodLineaMKT(int codLineaMKT) {
        this.codLineaMKT = codLineaMKT;
    }

    public int getCantidadPresentacion() {
        return cantidadPresentacion;
    }

    public void setCantidadPresentacion(int cantidadPresentacion) {
        this.cantidadPresentacion = cantidadPresentacion;
    }

    public int getCodTipoMercaderia() {
        return codTipoMercaderia;
    }

    public void setCodTipoMercaderia(int codTipoMercaderia) {
        this.codTipoMercaderia = codTipoMercaderia;
    }

    public String getObsPresentacion() {
        return obsPresentacion;
    }

    public void setObsPresentacion(String obsPresentacion) {
        this.obsPresentacion = obsPresentacion;
    }

    public int getCodEstadoPresentacionProducto() {
        return codEstadoPresentacionProducto;
    }

    public void setCodEstadoPresentacionProducto(int codEstadoPresentacionProducto) {
        this.codEstadoPresentacionProducto = codEstadoPresentacionProducto;
    }

    public String getNombreProductoPresentacion() {
        return nombreProductoPresentacion;
    }

    public void setNombreProductoPresentacion(String nombreProductoPresentacion) {
        this.nombreProductoPresentacion = nombreProductoPresentacion;
    }

    public int getCodTipoPresentacion() {
        return codTipoPresentacion;
    }

    public void setCodTipoPresentacion(int codTipoPresentacion) {
        this.codTipoPresentacion = codTipoPresentacion;
    }

    public int getCodCategoria() {
        return codCategoria;
    }

    public void setCodCategoria(int codCategoria) {
        this.codCategoria = codCategoria;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
}
