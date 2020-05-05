package com.cofar.backendapolo.api.v1.molulos.ingresodetalleVenta.model;

import java.util.Date;

public class IngresoDetalleVenta {
    private int codIngresoventas = 0;
    private int codPresentacion = 0;
    private String codLoteProduccion = "";
    private int codAreaEmpresa = 0;
    private int cantidad = 0;
    private int cantidadUnitaria = 0;
    private int cantidadRestante = 0;
    private int cantidadUnitariaRestante = 0;
    private int codTipoObsIngreso = 0;
    private Date fechaVenc = new Date();
    private int cantidadFRV = 0;
    private int cantidadUnitariaFRV = 0;
    private int cantidadMAS = 0;
    private int cantidadUnitariaMAS = 0;
    private int cantidadMENOS = 0;
    private int cantidadUnitariaMENOS = 0;

    public int getCodIngresoventas() {
        return codIngresoventas;
    }

    public void setCodIngresoventas(int codIngresoventas) {
        this.codIngresoventas = codIngresoventas;
    }

    public int getCodPresentacion() {
        return codPresentacion;
    }

    public void setCodPresentacion(int codPresentacion) {
        this.codPresentacion = codPresentacion;
    }

    public String getCodLoteProduccion() {
        return codLoteProduccion;
    }

    public void setCodLoteProduccion(String codLoteProduccion) {
        this.codLoteProduccion = codLoteProduccion;
    }

    public int getCodAreaEmpresa() {
        return codAreaEmpresa;
    }

    public void setCodAreaEmpresa(int codAreaEmpresa) {
        this.codAreaEmpresa = codAreaEmpresa;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getCantidadUnitaria() {
        return cantidadUnitaria;
    }

    public void setCantidadUnitaria(int cantidadUnitaria) {
        this.cantidadUnitaria = cantidadUnitaria;
    }

    public int getCantidadRestante() {
        return cantidadRestante;
    }

    public void setCantidadRestante(int cantidadRestante) {
        this.cantidadRestante = cantidadRestante;
    }

    public int getCantidadUnitariaRestante() {
        return cantidadUnitariaRestante;
    }

    public void setCantidadUnitariaRestante(int cantidadUnitariaRestante) {
        this.cantidadUnitariaRestante = cantidadUnitariaRestante;
    }

    public int getCodTipoObsIngreso() {
        return codTipoObsIngreso;
    }

    public void setCodTipoObsIngreso(int codTipoObsIngreso) {
        this.codTipoObsIngreso = codTipoObsIngreso;
    }

    public Date getFechaVenc() {
        return fechaVenc;
    }

    public void setFechaVenc(Date fechaVenc) {
        this.fechaVenc = fechaVenc;
    }

    public int getCantidadFRV() {
        return cantidadFRV;
    }

    public void setCantidadFRV(int cantidadFRV) {
        this.cantidadFRV = cantidadFRV;
    }

    public int getCantidadUnitariaFRV() {
        return cantidadUnitariaFRV;
    }

    public void setCantidadUnitariaFRV(int cantidadUnitariaFRV) {
        this.cantidadUnitariaFRV = cantidadUnitariaFRV;
    }

    public int getCantidadMAS() {
        return cantidadMAS;
    }

    public void setCantidadMAS(int cantidadMAS) {
        this.cantidadMAS = cantidadMAS;
    }

    public int getCantidadUnitariaMAS() {
        return cantidadUnitariaMAS;
    }

    public void setCantidadUnitariaMAS(int cantidadUnitariaMAS) {
        this.cantidadUnitariaMAS = cantidadUnitariaMAS;
    }

    public int getCantidadMENOS() {
        return cantidadMENOS;
    }

    public void setCantidadMENOS(int cantidadMENOS) {
        this.cantidadMENOS = cantidadMENOS;
    }

    public int getCantidadUnitariaMENOS() {
        return cantidadUnitariaMENOS;
    }

    public void setCantidadUnitariaMENOS(int cantidadUnitariaMENOS) {
        this.cantidadUnitariaMENOS = cantidadUnitariaMENOS;
    }
}
