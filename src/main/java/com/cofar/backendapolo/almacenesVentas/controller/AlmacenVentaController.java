package com.cofar.backendapolo.almacenesVentas.controller;

import com.cofar.backendapolo.almacenesVentas.model.AlmacenVentaDto;
import com.cofar.backendapolo.almacenesVentas.service.AlmacenVentaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/almacenVenta")
public class AlmacenVentaController {

    @Autowired
    private AlmacenVentaService almacenVentaService;

    @GetMapping("/{codArea}/dto")
    public List<AlmacenVentaDto> getAllAlmacenesVentas(@PathVariable("codArea") int codArea){
        return almacenVentaService.findCodAlmacenAndNombre(codArea);
    }

}
