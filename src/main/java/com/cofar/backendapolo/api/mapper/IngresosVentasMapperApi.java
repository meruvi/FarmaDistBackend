package com.cofar.backendapolo.api.mapper;

import com.cofar.backendapolo.api.v1.molulos.ingresoVenta.model.IngresosVentas;
import com.cofar.backendapolo.api.v1.molulos.ingresoVenta.model.IngresosVentasDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface IngresosVentasMapperApi {

    /*
    ** INGRESOS VENTAS
     */

    // DAO

    IngresosVentas findIngresosByIdAndArea(Integer id, Integer codAreaEmpresa);

    List<IngresosVentasDto> findAllIngresosVentas(Integer codArea);

    IngresosVentas findIngresosVentasById(Integer id);

    IngresosVentasDto findIngresosVentasByIdAndArea(Integer id, Integer codAreaEmpresa);

    Integer maxIngresosVentas(Integer codArea);

    Integer nroIngresosVentas(int codGestion, int codAlmacen);

    Integer saveIngresoVenta(IngresosVentas ingresoVenta);

    Integer updateIngresoVenta(IngresosVentas ingresoVenta);

    Integer deleteIngresoVenta(Integer id);





}
