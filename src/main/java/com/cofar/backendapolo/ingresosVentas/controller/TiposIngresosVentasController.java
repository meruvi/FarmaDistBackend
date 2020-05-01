package com.cofar.backendapolo.ingresosVentas.controller;

import com.cofar.backendapolo.ingresosVentas.model.TipoIngresoVentasDto;
import com.cofar.backendapolo.ingresosVentas.service.TiposIngresosVentasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/tiposIngresosVentas")
public class TiposIngresosVentasController {

    @Autowired
    private TiposIngresosVentasService tiposIngresosVentasService;

    @GetMapping("/dto")
    public List<TipoIngresoVentasDto> getIngresosVentasByName(){
        return tiposIngresosVentasService.findCodAndNombreActive();
    }
}
