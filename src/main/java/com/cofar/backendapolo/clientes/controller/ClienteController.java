package com.cofar.backendapolo.clientes.controller;

import com.cofar.backendapolo.clientes.model.ClienteDto;
import com.cofar.backendapolo.clientes.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @GetMapping("/{codArea}/dto")
    public List<ClienteDto> getAllAlmacenesVentas(@PathVariable("codArea") int codArea){
        return clienteService.findCodClienteAndNombre(codArea);
    }

}
