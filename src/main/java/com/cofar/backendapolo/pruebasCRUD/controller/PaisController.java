package com.cofar.backendapolo.pruebasCRUD.controller;

import com.cofar.backendapolo.pruebasCRUD.model.Pais;
import com.cofar.backendapolo.pruebasCRUD.service.PaisService;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/paises")
public class PaisController {

    Gson gson = new Gson();

    @Autowired
    PaisService paisService;

    @GetMapping("/**")
    public String saludo(){
        return "Bienvenido a Spring Boot!!!";
    }

    @GetMapping
    public List<Pais> selectAllPaises(){
        System.out.println("listar todos");
        return paisService.getPaises();
    }

    @GetMapping("/withChild")
    public List<Pais> selectAllPaisesWithChild(){
        System.out.println("Listar todos con sus anidados");
        return paisService.getPaisesWithChild();
    }

    @GetMapping("/{id}")
    public Pais getPais(@PathVariable("id") int id){
        System.out.println("Listar uno: " + id);
        return paisService.getPaisById(id);
    }

    @GetMapping("/{id}/withChild")
    public Pais getPaisWithChild(@PathVariable("id") int id){
        System.out.println("Listar uno con sus anidados: " + id);
        return paisService.getPaisByIdWithChild(id);
    }

    @PostMapping
    public ResponseEntity<?> insertPais(@Valid @RequestBody Pais pais){
        System.out.println("Registrar datos: " + gson.toJson(pais));
        return paisService.insertPais(pais);
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> updatePais(@PathVariable("id") int id, @Valid @RequestBody Pais pais){
        System.out.println("Actualizar ID: " + id);
        System.out.println("Actualizar datos: " + gson.toJson(pais));
        return paisService.updatePais(id, pais);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deletePais(@PathVariable("id") int id){
        System.out.println("Eliminar ID: " + id);
        return paisService.deletePais(id);
    }

}
