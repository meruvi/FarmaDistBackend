package com.cofar.backendapolo.api.v1.molulos.ingresodetalleVenta.controller;

import com.cofar.backendapolo.api.v1.molulos.ingresodetalleVenta.model.IngresoDetalleVentaDto;
import com.cofar.backendapolo.api.v1.molulos.ingresodetalleVenta.service.IngresoDetalleVentasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController("IngresoDetalleVentasController_v1")
@RequestMapping("/v1/ingresosDetalles")
public class IngresoDetalleVentasController {

    @Autowired
    private IngresoDetalleVentasService ingresoDetalleVentasService;

    @GetMapping("")
    public ArrayList<IngresoDetalleVentaDto> getAllDetalle(){
        return ingresoDetalleVentasService.getAllDetalle();
    }

    @GetMapping("/prod")
    public ArrayList<IngresoDetalleVentaDto> getAllDetalleAndProducto(){
        return ingresoDetalleVentasService.getAllDetalleAndProducto();
    }

    @GetMapping("/{id}")
    public ArrayList<IngresoDetalleVentaDto> getAllDetalleById(@PathVariable("id") int id){
        return ingresoDetalleVentasService.getAllDetalleById(id);
    }

    @GetMapping("/prod/{id}")
    public ArrayList<IngresoDetalleVentaDto> getAllDetalleAndProductoById(@PathVariable("id") int id){
        return ingresoDetalleVentasService.getAllDetalleAndProductoById(id);
    }
}
