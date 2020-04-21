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

    @GetMapping("")
    public List<IngresosVentas> getIngresosVentas(){
        return ingresosVentasService.findAllIngresosVentas();
    }

    @GetMapping("/{id}")
    public IngresosVentas findIngresosVentasById(@PathVariable("id") int id){
        return ingresosVentasService.findIngresosVentasById(id);
    }

    @PostMapping("")
    public int insertIngresosVentas(@Valid @RequestBody IngresosVentas ingresoVenta){
        return ingresosVentasService.saveIngresoVenta(ingresoVenta);
    }

    @PutMapping("/{id}")
    public int updateIngresoVenta(@PathVariable("id") int id, @Valid @RequestBody IngresosVentas ingresoVenta){
        return ingresosVentasService.updateIngresoVenta(id, ingresoVenta);
    }

    @DeleteMapping("/{id}")
    public int deleteIngresoVenta(@PathVariable("id") int id){
        return ingresosVentasService.deleteIngresoVenta(id);
    }
}
