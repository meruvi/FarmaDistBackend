package com.cofar.backendapolo.ingresosVentas.mapper;

import com.cofar.backendapolo.ingresosVentas.model.TipoIngresoVentasDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.ArrayList;
import java.util.List;

@Mapper
public interface TiposIngresosVentasMapper {

    /*
     ** TIPOS INGRESOS VENTAS
     */

    ArrayList<TipoIngresoVentasDto> getCodAndNombreActive();

}
