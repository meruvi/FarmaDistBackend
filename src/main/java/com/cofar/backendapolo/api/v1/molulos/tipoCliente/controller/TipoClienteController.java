package com.cofar.backendapolo.api.v1.molulos.tipoCliente.controller;

import com.cofar.backendapolo.api.v1.molulos.tipoCliente.model.TipoClienteDto;
import com.cofar.backendapolo.api.v1.molulos.tipoCliente.service.TipoClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController("TipoClienteController_v1")
@RequestMapping("/v1/tiposCliente")
public class TipoClienteController {

    @Autowired
    private TipoClienteService tipoClienteService;

    @GetMapping("/dto")
    public List<TipoClienteDto> getAllAlmacenesVentas(){
        return tipoClienteService.findCodClienteAndNombre();
    }

}
