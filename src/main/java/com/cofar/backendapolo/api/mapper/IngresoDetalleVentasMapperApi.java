package com.cofar.backendapolo.api.mapper;

import com.cofar.backendapolo.api._v1.molulos.ingresodetalleVenta.model.IngresoDetalleVenta;
import com.cofar.backendapolo.api._v1.molulos.ingresodetalleVenta.model.IngresoDetalleVentaDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.ArrayList;

@Mapper
public interface IngresoDetalleVentasMapperApi {

    /*
     ** INGRESOS DETALLES VENTAS
     */

    ArrayList<IngresoDetalleVentaDto> findAllDetalle();

    ArrayList<IngresoDetalleVentaDto> findAllDetalleAndProducto();

    

    ArrayList<IngresoDetalleVentaDto> findAllDetalleById(int id);

    ArrayList<IngresoDetalleVentaDto> findAllDetalleAndProductoById(int id);

    Integer saveIngresoDetalleVenta(IngresoDetalleVenta ingresoDetalle);

    Integer deleteIngresoDetalleVenta(Integer codIngreso, Integer codArea);



}
