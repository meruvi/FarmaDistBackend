package com.cofar.backendapolo.component.model;

import java.util.Date;

public class Log {

    private Integer idLog;
    private Date fecha;
    private String detalle;
    private String nombreUsuario;
    private String url;
    private String tiempoRespuesta;

    public Log() {
    }

    public Log(Date fecha, String detalle, String nombreUsuario, String url, String tiempoRespuesta) {
        this.fecha = fecha;
        this.detalle = detalle;
        this.nombreUsuario = nombreUsuario;
        this.url = url;
        this.tiempoRespuesta = tiempoRespuesta;
    }

    public Integer getIdLog() {
        return idLog;
    }

    public void setIdLog(Integer idLog) {
        this.idLog = idLog;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getTiempoRespuesta() {
        return tiempoRespuesta;
    }

    public void setTiempoRespuesta(String tiempoRespuesta) {
        this.tiempoRespuesta = tiempoRespuesta;
    }
}
