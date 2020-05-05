package com.cofar.backendapolo.api._v1.molulos.ingresodetalleVenta.model;

import com.cofar.backendapolo.api._v1.molulos.presentacionProducto.model.PresentacionesProductoDto;

import java.util.Date;

public class IngresoDetalleVentaDto {

    private int codIngresoventas = 0;
    private String codLoteProduccion = "";
    private int codAreaEmpresa = 0;
    private int cantidad = 0;
    private int cantidadUnitaria = 0;
    private Date fechaVenc = new Date();
    private PresentacionesProductoDto presentacionesProductoDto = new PresentacionesProductoDto();

    public int getCodIngresoventas() {
        return codIngresoventas;
    }

    public void setCodIngresoventas(int codIngresoventas) {
        this.codIngresoventas = codIngresoventas;
    }

    public PresentacionesProductoDto getPresentacionesProductoDto() {
        return presentacionesProductoDto;
    }

    public void setPresentacionesProductoDto(PresentacionesProductoDto presentacionesProductoDto) {
        this.presentacionesProductoDto = presentacionesProductoDto;
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

    public Date getFechaVenc() {
        return fechaVenc;
    }

    public void setFechaVenc(Date fechaVenc) {
        this.fechaVenc = fechaVenc;
    }
}
