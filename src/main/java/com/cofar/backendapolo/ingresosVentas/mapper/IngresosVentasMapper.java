package com.cofar.backendapolo.ingresosVentas.mapper;

import com.cofar.backendapolo.ingresosVentas.model.IngresosVentas;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface IngresosVentasMapper {

    List<IngresosVentas> findAllIngresosVentas();

    IngresosVentas findIngresosVentasById(Integer id);

    Integer maxIngresosVentas();

    Integer saveIngresoVenta(IngresosVentas ingresoVenta);

    Integer updateIngresoVenta(IngresosVentas ingresoVenta);

    Integer deleteIngresoVenta(Integer id);
}
