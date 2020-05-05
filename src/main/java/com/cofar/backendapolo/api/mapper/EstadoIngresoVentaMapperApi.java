package com.cofar.backendapolo.api.mapper;

import com.cofar.backendapolo.api.v1.molulos.estadoIngresoVenta.model.EstadoIngresoVentaDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.ArrayList;

@Mapper
public interface EstadoIngresoVentaMapperApi {

    /*
    ** ESTADOS INGRESOS VENTAS
     */

    ArrayList<EstadoIngresoVentaDto> getCodAndNombreActive();


}
