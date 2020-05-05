package com.cofar.backendapolo.api._v1.mapper;

import com.cofar.backendapolo.api._v1.molulos.tipoIngresoVenta.model.TipoIngresoVentaDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.ArrayList;

@Mapper
public interface TipoIngresoVentaMapper_v1 {

    /*
     ** TIPOS INGRESOS VENTAS
     */

    ArrayList<TipoIngresoVentaDto> getCodAndNombreActive();


}
