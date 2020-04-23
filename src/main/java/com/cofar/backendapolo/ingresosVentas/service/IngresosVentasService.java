package com.cofar.backendapolo.ingresosVentas.service;

import com.cofar.backendapolo.ingresosVentas.mapper.IngresosVentasMapper;
import com.cofar.backendapolo.ingresosVentas.model.IngresosDetalleVentas;
import com.cofar.backendapolo.ingresosVentas.model.IngresosVentas;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class IngresosVentasService {

    @Autowired
    private IngresosVentasMapper ingresosVentasMapper;

    public List<IngresosVentas> findAllIngresosVentas(int codArea) {
        // Listamos los ingresos_ventas por codAreaEmpresa
        List<IngresosVentas> listIngresos = ingresosVentasMapper.findAllIngresosVentas(codArea);

        // Insertamos su detalle a cada ingreso_venta
        for (IngresosVentas ingreso: listIngresos) {
            int codIngreso = ingreso.getCodIngresoventas();
            List<IngresosDetalleVentas> listDetalle = ingresosVentasMapper.findIngresosDetallesVentasById(codIngreso);
            ingreso.setIngresoDetalleVenta(listDetalle);
        }
        // Devolvemos el listado de ingresos_ventas
        return listIngresos;
    }

    @Transactional
    public IngresosVentas findIngresosVentasByIdAndArea(int id, int codAreaEmpresa){
        // Listamos los ingresos_ventas por codAreaEmpresa y codIngresoVenta
        IngresosVentas ingreso = ingresosVentasMapper.findIngresosVentasByIdAndArea(id, codAreaEmpresa);

        // Verificamos si existe el ingreso_venta
        if(ingreso != null) {
            int codIngreso = ingreso.getCodIngresoventas();
            List<IngresosDetalleVentas> listDetalle = ingresosVentasMapper.findIngresosDetallesVentasById(codIngreso);
            ingreso.setIngresoDetalleVenta(listDetalle);
        }
        // Devolvemos el ingreso_venta encontrado, en caso contrario vacio
        return ingreso;
    }

    @Transactional
    public int saveIngresoVenta(IngresosVentas ingresosVentas) {

        int codIngresoVenta = ingresosVentasMapper.maxIngresosVentas(ingresosVentas.getCodAreasEmpresa()) + 1;
        ingresosVentas.setCodIngresoventas(codIngresoVenta);

        int resp = ingresosVentasMapper.saveIngresoVenta(ingresosVentas);
        List<IngresosDetalleVentas> ingresosDetalleVentas = ingresosVentas.getIngresoDetalleVenta();
        for (IngresosDetalleVentas detalle: ingresosDetalleVentas) {
            detalle.setCodIngresoventas(codIngresoVenta);
            resp = ingresosVentasMapper.saveIngresoDetalleVenta(detalle);
        }
        return resp;
    }

    @Transactional
    public int updateIngresoVenta(int id, IngresosVentas ingresoVenta){
        List<IngresosDetalleVentas> ingresosDetalleVentas = ingresoVenta.getIngresoDetalleVenta();
        IngresosVentas ingreso = ingresosVentasMapper.findIngresosVentasByIdAndArea(id, ingresoVenta.getCodAreasEmpresa());
        if(ingreso == null){
            return -1;
        }else{
            int resp = ingresosVentasMapper.updateIngresoVenta(ingresoVenta);
            ingresosVentasMapper.deleteIngresosDetalleVentas(id, ingresoVenta.getCodAreasEmpresa());
            for (IngresosDetalleVentas detalle: ingresosDetalleVentas) {
                detalle.setCodIngresoventas(ingresoVenta.getCodIngresoventas());
                resp = ingresosVentasMapper.saveIngresoDetalleVenta(detalle);
            }
            return resp;
        }
    }

    @Transactional
    public int deleteIngresoVenta(int id, int codAreaEmpresa){
        IngresosVentas ingreso = ingresosVentasMapper.findIngresosVentasByIdAndArea(id,codAreaEmpresa);
        if(ingreso == null){
            return 0;
        }else{
            ingresosVentasMapper.deleteIngresosDetalleVentas(id, codAreaEmpresa);
            return ingresosVentasMapper.deleteIngresoVenta(id);
        }
    }
}
