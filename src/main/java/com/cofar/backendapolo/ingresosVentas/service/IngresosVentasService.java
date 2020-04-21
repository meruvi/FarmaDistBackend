package com.cofar.backendapolo.ingresosVentas.service;

import com.cofar.backendapolo.ingresosVentas.mapper.IngresosVentasMapper;
import com.cofar.backendapolo.ingresosVentas.model.IngresosVentas;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IngresosVentasService {

    @Autowired
    private IngresosVentasMapper ingresosVentasMapper;

    public List<IngresosVentas> findAllIngresosVentas() {
        return ingresosVentasMapper.findAllIngresosVentas();
    }

    public IngresosVentas findIngresosVentasById(int id){
        return ingresosVentasMapper.findIngresosVentasById(id);
    }

    public int saveIngresoVenta(IngresosVentas ingresosVentas) {
        int codIngresoVenta = ingresosVentasMapper.maxIngresosVentas() + 1;
        ingresosVentas.setCodIngresoventas(codIngresoVenta);
        return ingresosVentasMapper.saveIngresoVenta(ingresosVentas);
    }

    public int updateIngresoVenta(int id, IngresosVentas ingresoVenta){
        IngresosVentas ingreso = ingresosVentasMapper.findIngresosVentasById(id);
        if(ingreso == null){
            return 0;
        }else{
            return ingresosVentasMapper.updateIngresoVenta(ingresoVenta);
        }
    }

    public int deleteIngresoVenta(int id){
        IngresosVentas ingreso = ingresosVentasMapper.findIngresosVentasById(id);
        if(ingreso == null){
            return 0;
        }else{
            return ingresosVentasMapper.deleteIngresoVenta(id);
        }
    }
}
