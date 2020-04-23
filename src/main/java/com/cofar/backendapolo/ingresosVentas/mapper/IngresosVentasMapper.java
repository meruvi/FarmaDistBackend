package com.cofar.backendapolo.ingresosVentas.mapper;

import com.cofar.backendapolo.ingresosVentas.model.IngresosDetalleVentas;
import com.cofar.backendapolo.ingresosVentas.model.IngresosVentas;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface IngresosVentasMapper {

    /*
    ** INGRESOS VENTAS
     */

    List<IngresosVentas> findAllIngresosVentas(Integer codArea);

    IngresosVentas findIngresosVentasById(Integer id);

    IngresosVentas findIngresosVentasByIdAndArea(Integer id, Integer codAreaEmpresa);

    Integer maxIngresosVentas(Integer codArea);

    Integer saveIngresoVenta(IngresosVentas ingresoVenta);

    Integer updateIngresoVenta(IngresosVentas ingresoVenta);

    Integer deleteIngresoVenta(Integer id);



    /*
     ** INGRESOS DETALLES VENTAS
     */

    List<IngresosDetalleVentas> findAllIngresosDetalleVentas();

    List<IngresosDetalleVentas> findIngresosDetallesVentasById(Integer id);

    Integer saveIngresoDetalleVenta(IngresosDetalleVentas ingresoDetalleVenta);

    Integer updateIngresoDetalleVenta(IngresosDetalleVentas ingresoDetalleVenta);

    Integer deleteIngresosDetalleVentas(Integer id, Integer codAreaEmpresa);
}
