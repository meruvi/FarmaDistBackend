package com.cofar.backendapolo.api.v1.molulos.estadoIngresoVenta.controller;

import com.cofar.backendapolo.api.v1.molulos.estadoIngresoVenta.model.EstadoIngresoVentaDto;
import com.cofar.backendapolo.api.v1.molulos.estadoIngresoVenta.service.EstadoIngresoVentaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController("EstadoIngresoVentaController_v1")
@RequestMapping("/v1/estadosIngresos")
public class EstadoIngresoVentaController {

    @Autowired
    private EstadoIngresoVentaService estadoIngresoVentaService;

    @GetMapping("/dto")
    public List<EstadoIngresoVentaDto> getAllEstadosIngresosVentas(){
        return estadoIngresoVentaService.findCodEstadoIngresoAndNombre();
    }

}
