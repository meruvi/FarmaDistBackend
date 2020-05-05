package com.cofar.backendapolo.api._v1.mapper;

import com.cofar.backendapolo.api._v1.molulos.estadoIngresoVenta.model.EstadoIngresoVentaDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.ArrayList;

@Mapper
public interface EstadoIngresoVentaMapper_v1 {

    /*
    ** ESTADOS INGRESOS VENTAS
     */

    ArrayList<EstadoIngresoVentaDto> getCodAndNombreActive();


}
