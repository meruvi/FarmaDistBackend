package com.cofar.backendapolo.ingresosVentas.model;

import java.util.Date;

public class IngresosVentas {

    private int codIngresoventas = 0;
    private int codAreasEmpresa = 0;
    private int codGestion = 0;
    private int codSalidaVenta = 0;
    private int salidaVentaOrigen = 0;
    private int codAlmacenVenta = 0;
    private int codAlmacenVentaOrigen = 0;
    private int codTipoIngresoVenta = 0;
    private int codPersonal = 0;
    private int codProveedor = 0;
    private int codCliente = 0;
    private int codEstadoIngresoVenta = 0;
    private Date fechaIngresoVenta = new Date();
    private Date fechaModificacionIngresoVenta = new Date();
    private Date fechaRecepcion = new Date();
    private int nroIngresoVentas = 0;
    private int codIngresoRegional = 0;
    private String obsIngresoventas = "";

    public int getCodIngresoventas() {
        return codIngresoventas;
    }

    public void setCodIngresoventas(int codIngresoventas) {
        this.codIngresoventas = codIngresoventas;
    }

    public int getCodAreasEmpresa() {
        return codAreasEmpresa;
    }

    public void setCodAreasEmpresa(int codAreasEmpresa) {
        this.codAreasEmpresa = codAreasEmpresa;
    }

    public int getCodGestion() {
        return codGestion;
    }

    public void setCodGestion(int codGestion) {
        this.codGestion = codGestion;
    }

    public int getCodSalidaVenta() {
        return codSalidaVenta;
    }

    public void setCodSalidaVenta(int codSalidaVenta) {
        this.codSalidaVenta = codSalidaVenta;
    }

    public int getSalidaVentaOrigen() {
        return salidaVentaOrigen;
    }

    public void setSalidaVentaOrigen(int salidaVentaOrigen) {
        this.salidaVentaOrigen = salidaVentaOrigen;
    }

    public int getCodAlmacenVenta() {
        return codAlmacenVenta;
    }

    public void setCodAlmacenVenta(int codAlmacenVenta) {
        this.codAlmacenVenta = codAlmacenVenta;
    }

    public int getCodAlmacenVentaOrigen() {
        return codAlmacenVentaOrigen;
    }

    public void setCodAlmacenVentaOrigen(int codAlmacenVentaOrigen) {
        this.codAlmacenVentaOrigen = codAlmacenVentaOrigen;
    }

    public int getCodTipoIngresoVenta() {
        return codTipoIngresoVenta;
    }

    public void setCodTipoIngresoVenta(int codTipoIngresoVenta) {
        this.codTipoIngresoVenta = codTipoIngresoVenta;
    }

    public int getCodPersonal() {
        return codPersonal;
    }

    public void setCodPersonal(int codPersonal) {
        this.codPersonal = codPersonal;
    }

    public int getCodProveedor() {
        return codProveedor;
    }

    public void setCodProveedor(int codProveedor) {
        this.codProveedor = codProveedor;
    }

    public int getCodCliente() {
        return codCliente;
    }

    public void setCodCliente(int codCliente) {
        this.codCliente = codCliente;
    }

    public int getCodEstadoIngresoVenta() {
        return codEstadoIngresoVenta;
    }

    public void setCodEstadoIngresoVenta(int codEstadoIngresoVenta) {
        this.codEstadoIngresoVenta = codEstadoIngresoVenta;
    }

    public Date getFechaIngresoVenta() {
        return fechaIngresoVenta;
    }

    public void setFechaIngresoVenta(Date fechaIngresoVenta) {
        this.fechaIngresoVenta = fechaIngresoVenta;
    }

    public Date getFechaModificacionIngresoVenta() {
        return fechaModificacionIngresoVenta;
    }

    public void setFechaModificacionIngresoVenta(Date fechaModificacionIngresoVenta) {
        this.fechaModificacionIngresoVenta = fechaModificacionIngresoVenta;
    }

    public Date getFechaRecepcion() {
        return fechaRecepcion;
    }

    public void setFechaRecepcion(Date fechaRecepcion) {
        this.fechaRecepcion = fechaRecepcion;
    }

    public int getNroIngresoVentas() {
        return nroIngresoVentas;
    }

    public void setNroIngresoVentas(int nroIngresoVentas) {
        this.nroIngresoVentas = nroIngresoVentas;
    }

    public int getCodIngresoRegional() {
        return codIngresoRegional;
    }

    public void setCodIngresoRegional(int codIngresoRegional) {
        this.codIngresoRegional = codIngresoRegional;
    }

    public String getObsIngresoventas() {
        return obsIngresoventas;
    }

    public void setObsIngresoventas(String obsIngresoventas) {
        this.obsIngresoventas = obsIngresoventas;
    }
}
