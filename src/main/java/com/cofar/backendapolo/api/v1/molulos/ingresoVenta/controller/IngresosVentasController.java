package com.cofar.backendapolo.api.v1.molulos.ingresoVenta.controller;

import com.cofar.backendapolo.api.v1.molulos.ingresoVenta.model.IngresosVentas;
import com.cofar.backendapolo.api.v1.molulos.ingresoVenta.model.IngresosVentasDto;
import com.cofar.backendapolo.api.v1.molulos.ingresoVenta.service.IngresosVentasService;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.LinkedHashMap;
import java.util.List;

@RestController("IngresosVentasController_v1")
@RequestMapping("/v1/ingresosVentas")
public class IngresosVentasController {

    @Autowired
    private IngresosVentasService ingresosVentasService;

    @GetMapping("/{codArea}")
    public List<IngresosVentasDto> getIngresosVentas(@PathVariable("codArea") int codArea){
        return ingresosVentasService.findAllIngresosVentas(codArea);
    }

    @GetMapping("/{codArea}/{id}")
    public IngresosVentasDto findIngresosVentasById(@PathVariable("codArea") int codArea, @PathVariable("id") int id){
        return ingresosVentasService.findIngresosVentasByIdAndArea(id, codArea);
    }

    @GetMapping("/nroIngreso/{codGestion}/{codAlmacen}")
    public int findNroIngresosVentas(@PathVariable("codGestion") int codGestion, @PathVariable("codAlmacen") int codAlmacen){
        return ingresosVentasService.findNroIngresosVentas(codGestion, codAlmacen);
    }

    @PostMapping("")
    public int insertIngresosVentas(@Valid @RequestBody IngresosVentasDto ingresosVentasDto){
        return ingresosVentasService.saveIngresoVenta(ingresosVentasDto);
    }

    @PutMapping("/{id}")
    public int updateIngresoVenta(@PathVariable("id") int id, @Valid @RequestBody IngresosVentasDto ingresosVentasDto){
        Gson gson = new Gson();
        System.out.println("RECUPERADO:>>>>>  " + gson.toJson(ingresosVentasDto));
        return ingresosVentasService.updateIngresoVenta(id, ingresosVentasDto);
    }

    @DeleteMapping("/{codArea}/{id}")
    public int deleteIngresoVenta(@PathVariable("codArea") int codArea, @PathVariable("id") int id){
        return ingresosVentasService.deleteIngresoVenta(id,codArea);
    }


    @GetMapping("/{codGestion}/{codArea}/{codTipoCliente}")
    public LinkedHashMap<String, Object> recuperarNecesarioRegistroIngresosVentas(
            @PathVariable("codGestion") int codGestion,
            @PathVariable("codArea") int codArea,
            @PathVariable("codTipoCliente") int codTipoCliente){

        return ingresosVentasService.findNecesarioRegistroIngresosVentas(codGestion, codArea, codTipoCliente);
    }

}
