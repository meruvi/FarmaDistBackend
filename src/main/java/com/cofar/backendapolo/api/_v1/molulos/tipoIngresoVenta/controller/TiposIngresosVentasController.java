package com.cofar.backendapolo.api._v1.molulos.tipoIngresoVenta.controller;

import com.cofar.backendapolo.api._v1.molulos.tipoIngresoVenta.model.TipoIngresoVentaDto;
import com.cofar.backendapolo.api._v1.molulos.tipoIngresoVenta.service.TiposIngresosVentasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController("TiposIngresosVentasController_v1")
@RequestMapping("/_v1/tiposIngresosVentas")
public class TiposIngresosVentasController {

    @Autowired
    private TiposIngresosVentasService tiposIngresosVentasService;

    @GetMapping("/dto")
    public List<TipoIngresoVentaDto> getIngresosVentasByName(){
        return tiposIngresosVentasService.findCodAndNombreActive();
    }
}
