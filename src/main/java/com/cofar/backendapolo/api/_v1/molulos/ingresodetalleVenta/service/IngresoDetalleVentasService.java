package com.cofar.backendapolo.api._v1.molulos.ingresodetalleVenta.service;

import com.cofar.backendapolo.api._v1.mapper.IngresoDetalleVentasMapper_v1;
import com.cofar.backendapolo.api._v1.molulos.ingresodetalleVenta.model.IngresoDetalleVentaDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service("IngresoDetalleVentasService_v1")
public class IngresoDetalleVentasService {

    @Autowired
    private IngresoDetalleVentasMapper_v1 ingresoDetalleVentasMapper;

    public ArrayList<IngresoDetalleVentaDto> getAllDetalle(){
        System.out.println("TAMAÑO>>>>>>  " + ingresoDetalleVentasMapper.findAllDetalle().size());
        return ingresoDetalleVentasMapper.findAllDetalle();
    }

    public ArrayList<IngresoDetalleVentaDto> getAllDetalleAndProducto(){
        System.out.println("TAMAÑO>>>>>>  " + ingresoDetalleVentasMapper.findAllDetalleAndProducto().size());
        return ingresoDetalleVentasMapper.findAllDetalleAndProducto();
    }

    public ArrayList<IngresoDetalleVentaDto> getAllDetalleById(int id) {
        System.out.println("TAMAÑO>>>>>>  " + ingresoDetalleVentasMapper.findAllDetalleById(id).size());
        return ingresoDetalleVentasMapper.findAllDetalleById(id);
    }

    public ArrayList<IngresoDetalleVentaDto> getAllDetalleAndProductoById(int id) {
        System.out.println("TAMAÑO>>>>>>  " + ingresoDetalleVentasMapper.findAllDetalleAndProductoById(id).size());
        return ingresoDetalleVentasMapper.findAllDetalleAndProductoById(id);
    }
}
