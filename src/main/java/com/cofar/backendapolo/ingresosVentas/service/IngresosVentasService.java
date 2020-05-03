package com.cofar.backendapolo.ingresosVentas.service;

import com.cofar.backendapolo.EstadosIngresosVentas.mapper.EstadoIngresoVentaMapper;
import com.cofar.backendapolo.EstadosIngresosVentas.model.EstadoIngresoVentaDto;
import com.cofar.backendapolo.almacenesVentas.mapper.AlmacenVentaMapper;
import com.cofar.backendapolo.almacenesVentas.model.AlmacenVentaDto;
import com.cofar.backendapolo.clientes.mapper.ClienteMapper;
import com.cofar.backendapolo.clientes.model.ClienteDto;
import com.cofar.backendapolo.ingresosVentas.mapper.IngresosVentasMapper;
import com.cofar.backendapolo.ingresosVentas.mapper.TiposIngresosVentasMapper;
import com.cofar.backendapolo.ingresosVentas.model.IngresosDetalleVentas;
import com.cofar.backendapolo.ingresosVentas.model.IngresosVentas;
import com.cofar.backendapolo.ingresosVentas.model.TipoIngresoVentasDto;
import com.cofar.backendapolo.tiposClientes.mapper.TipoClienteMapper;
import com.cofar.backendapolo.tiposClientes.model.TipoClienteDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

@Service
public class IngresosVentasService {

    @Autowired
    private IngresosVentasMapper ingresosVentasMapper;

    @Autowired
    private AlmacenVentaMapper almacenVentaMapper;

    @Autowired
    private EstadoIngresoVentaMapper estadoIngresoVentaMapper;

    @Autowired
    private TiposIngresosVentasMapper tiposIngresosVentasMapper;

    @Autowired
    private TipoClienteMapper tipoClienteMapper;

    @Autowired
    private ClienteMapper clienteMapper;

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

    public int findNroIngresosVentas(int codGestion, int codAlmacen){
        return ingresosVentasMapper.nroIngresosVentas(codGestion, codAlmacen);
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

    public LinkedHashMap<String, Object> findNecesarioRegistroIngresosVentas(int codGestion, int codArea, int codTipoCliente) {

        LinkedHashMap<String, Object> response = new LinkedHashMap<String, Object>();

        ArrayList<AlmacenVentaDto> almacenVentaDtos = almacenVentaMapper.getCodAndNombreActive(codArea);
        response.put("almacenesVentas", almacenVentaDtos);

        int codAlmacen = almacenVentaDtos.get(0).getCodAlmacenVenta();
        int numIngreso = ingresosVentasMapper.nroIngresosVentas(codGestion, codAlmacen);
        response.put("numIngreso", numIngreso);

        ArrayList<EstadoIngresoVentaDto> estadoIngresoVentaDtos = estadoIngresoVentaMapper.getCodAndNombreActive();
        response.put("estadosIngresosVentas", estadoIngresoVentaDtos);

        ArrayList<TipoIngresoVentasDto> tipoIngresoVentasDtos = tiposIngresosVentasMapper.getCodAndNombreActive();
        response.put("tiposingresosVentas", tipoIngresoVentasDtos);

        ArrayList<TipoClienteDto> tipoClienteDtos = tipoClienteMapper.getCodAndNombreActive();
        response.put("tiposClientes", tipoClienteDtos);

        ArrayList<ClienteDto> clienteDtos = clienteMapper.getCodAndNombreActive(codArea);
        response.put("clientes", clienteDtos);

        // Devolvemos un objeto con el numero correlatico de ingreso y listados de almacenes_ventas,
        // estados_ingresos_ventas, tipos_ingresos, tipos_clientes y clientes
        return response;
    }
}
