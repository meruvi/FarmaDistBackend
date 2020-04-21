package com.cofar.backendapolo.pruebasCRUD.controller;

import com.cofar.backendapolo.pruebasCRUD.model.EstadoRegistro;
import com.cofar.backendapolo.pruebasCRUD.service.EstadoRegistroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/estadosRegistros")
public class EstadoRegistroController {

    @Autowired
    private EstadoRegistroService estadoRegistroService;

    @GetMapping("")
    public List<EstadoRegistro> selectAllEstadosRegistros(){
        System.out.println("Listar todos con sus anidados");
        return estadoRegistroService.getEstadosRegistros();
    }

    @GetMapping("/withChild")
    public List<EstadoRegistro> selectAllEstadosRegistrosWithChild(){
        System.out.println("Listar todos con sus anidados");
        return estadoRegistroService.getEstadosRegistrosWithChild();
    }

}
