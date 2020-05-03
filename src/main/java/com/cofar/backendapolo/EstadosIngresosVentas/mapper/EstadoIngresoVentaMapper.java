package com.cofar.backendapolo.EstadosIngresosVentas.mapper;

import com.cofar.backendapolo.EstadosIngresosVentas.model.EstadoIngresoVentaDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.ArrayList;
import java.util.List;

@Mapper
public interface EstadoIngresoVentaMapper {

    /*
    ** ESTADOS INGRESOS VENTAS
     */

    ArrayList<EstadoIngresoVentaDto> getCodAndNombreActive();

}
