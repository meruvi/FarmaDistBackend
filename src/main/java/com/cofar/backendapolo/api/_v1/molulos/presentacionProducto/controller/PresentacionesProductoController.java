package com.cofar.backendapolo.api._v1.molulos.presentacionProducto.controller;

import com.cofar.backendapolo.api._v1.molulos.presentacionProducto.model.PresentacionesProducto;
import com.cofar.backendapolo.api._v1.molulos.presentacionProducto.service.PresentacionesProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController("PresentacionesProductoController_v1")
@RequestMapping("/_v1/productos")
public class PresentacionesProductoController {

    @Autowired
    private PresentacionesProductoService presentacionesProductoService;

    @GetMapping("/search/{nombre}")
    public List<PresentacionesProducto> getIngresosVentasByName(@PathVariable("nombre") String nombre){
        return presentacionesProductoService.findCodPresentacionAndNombre(nombre);
    }

    @GetMapping("/{id}")
    public PresentacionesProducto getIngresosVentasById(@PathVariable("id") int id){
        return presentacionesProductoService.findPresentacionById(id);
    }

    /*@GetMapping("/{codArea}/{id}")
    public IngresosVentas findIngresosVentasById(@PathVariable("codArea") int codArea, @PathVariable("id") int id){
        return ingresosVentasService.findIngresosVentasByIdAndArea(id, codArea);
    }

    @PostMapping("")
    public int insertIngresosVentas(@Valid @RequestBody IngresosVentas ingresoVenta){
        return ingresosVentasService.saveIngresoVenta(ingresoVenta);
    }

    @PutMapping("/{id}")
    public int updateIngresoVenta(@PathVariable("id") int id, @Valid @RequestBody IngresosVentas ingresoVenta){
        return ingresosVentasService.updateIngresoVenta(id, ingresoVenta);
    }

    @DeleteMapping("/{codArea}/{id}")
    public int deleteIngresoVenta(@PathVariable("codArea") int codArea, @PathVariable("id") int id){
        return ingresosVentasService.deleteIngresoVenta(id,codArea);
    }*/
}
