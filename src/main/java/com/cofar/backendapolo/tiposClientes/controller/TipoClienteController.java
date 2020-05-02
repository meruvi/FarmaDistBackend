package com.cofar.backendapolo.tiposClientes.controller;

import com.cofar.backendapolo.tiposClientes.model.TipoClienteDto;
import com.cofar.backendapolo.tiposClientes.service.TipoClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/tiposCliente")
public class TipoClienteController {

    @Autowired
    private TipoClienteService tipoClienteService;

    @GetMapping("/dto")
    public List<TipoClienteDto> getAllAlmacenesVentas(){
        return tipoClienteService.findCodClienteAndNombre();
    }

}
