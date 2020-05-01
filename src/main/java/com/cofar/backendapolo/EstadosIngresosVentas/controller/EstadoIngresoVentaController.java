package com.cofar.backendapolo.EstadosIngresosVentas.controller;

import com.cofar.backendapolo.EstadosIngresosVentas.model.EstadoIngresoVentaDto;
import com.cofar.backendapolo.EstadosIngresosVentas.service.EstadoIngresoVentaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/estadosIngresos")
public class EstadoIngresoVentaController {

    @Autowired
    private EstadoIngresoVentaService estadoIngresoVentaService;

    @GetMapping("/dto")
    public List<EstadoIngresoVentaDto> getAllEstadosIngresosVentas(){
        return estadoIngresoVentaService.findCodEstadoIngresoAndNombre();
    }

}
