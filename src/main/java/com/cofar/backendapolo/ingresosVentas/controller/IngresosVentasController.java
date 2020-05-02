package com.cofar.backendapolo.ingresosVentas.controller;

import com.cofar.backendapolo.ingresosVentas.model.IngresosVentas;
import com.cofar.backendapolo.ingresosVentas.service.IngresosVentasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/ingresosVentas")
public class IngresosVentasController {

    @Autowired
    private IngresosVentasService ingresosVentasService;

    @GetMapping("/{codArea}")
    public List<IngresosVentas> getIngresosVentas(@PathVariable("codArea") int codArea){
        return ingresosVentasService.findAllIngresosVentas(codArea);
    }

    @GetMapping("/{codArea}/{id}")
    public IngresosVentas findIngresosVentasById(@PathVariable("codArea") int codArea, @PathVariable("id") int id){
        return ingresosVentasService.findIngresosVentasByIdAndArea(id, codArea);
    }

    @GetMapping("/nroIngreso/{codGestion}/{codAlmacen}")
    public int findNroIngresosVentas(@PathVariable("codGestion") int codGestion, @PathVariable("codAlmacen") int codAlmacen){
        return ingresosVentasService.findNroIngresosVentas(codGestion, codAlmacen);
    }

    @PostMapping("")
    public int insertIngresosVentas(@Valid @RequestBody IngresosVentas ingresoVenta){
        return ingresosVentasService.saveIngresoVenta(ingresoVenta);
    }

    @PutMapping("/{id}")
    public int updateIngresoVenta(@PathVariable("id") int id, @Valid @RequestBody IngresosVentas ingresoVenta){
        return ingresosVentasService.updateIngresoVenta(id, ingresoVenta);
    }

    @DeleteMapping("/{codArea}/{id}")
    public int deleteIngresoVenta(@PathVariable("codArea") int codArea, @PathVariable("id") int id){
        return ingresosVentasService.deleteIngresoVenta(id,codArea);
    }
}
