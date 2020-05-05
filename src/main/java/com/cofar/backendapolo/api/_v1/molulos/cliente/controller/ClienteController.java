package com.cofar.backendapolo.api._v1.molulos.cliente.controller;

import com.cofar.backendapolo.api._v1.molulos.cliente.model.ClienteDto;
import com.cofar.backendapolo.api._v1.molulos.cliente.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController("ClienteController_v1")
@RequestMapping("/_v1/clientes")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @GetMapping("/{codArea}/dto/{codTipoCliente}")
    public List<ClienteDto> getAllAlmacenesVentas(@PathVariable("codArea") int codArea, @PathVariable("codTipoCliente") int codTipoCliente){
        return clienteService.findCodClienteAndNombre(codArea, codTipoCliente);
    }

}
