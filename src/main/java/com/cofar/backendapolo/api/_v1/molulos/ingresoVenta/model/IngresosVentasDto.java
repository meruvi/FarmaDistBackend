package com.cofar.backendapolo.api._v1.molulos.ingresoVenta.model;

import com.cofar.backendapolo.api._v1.molulos.ingresodetalleVenta.model.IngresoDetalleVentaDto;

import java.util.ArrayList;
import java.util.Date;

public class IngresosVentasDto {

    private int codIngresoventas = 0;
    private int codAreasEmpresa = 0;
    private int codAlmacenVenta = 0;
    private int codTipoIngresoVenta = 0;
    private int codCliente = 0;
    private int codEstadoIngresoVenta = 0;
    private Date fechaIngresoVenta = new Date();
    private int nroIngresoVentas = 0;
    private String obsIngresoventas = "";
    private ArrayList<IngresoDetalleVentaDto> ingresoDetalleVenta = new ArrayList<>();

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

    public int getCodAlmacenVenta() {
        return codAlmacenVenta;
    }

    public void setCodAlmacenVenta(int codAlmacenVenta) {
        this.codAlmacenVenta = codAlmacenVenta;
    }

    public int getCodTipoIngresoVenta() {
        return codTipoIngresoVenta;
    }

    public void setCodTipoIngresoVenta(int codTipoIngresoVenta) {
        this.codTipoIngresoVenta = codTipoIngresoVenta;
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

    public int getNroIngresoVentas() {
        return nroIngresoVentas;
    }

    public void setNroIngresoVentas(int nroIngresoVentas) {
        this.nroIngresoVentas = nroIngresoVentas;
    }

    public String getObsIngresoventas() {
        return obsIngresoventas;
    }

    public void setObsIngresoventas(String obsIngresoventas) {
        this.obsIngresoventas = obsIngresoventas;
    }

    public ArrayList<IngresoDetalleVentaDto> getIngresoDetalleVenta() {
        return ingresoDetalleVenta;
    }

    public void setIngresoDetalleVenta(ArrayList<IngresoDetalleVentaDto> ingresoDetalleVenta) {
        this.ingresoDetalleVenta = ingresoDetalleVenta;
    }
}
