package com.cofar.backendapolo.api._v1.molulos.ingresoVenta.service;

import com.cofar.backendapolo.api.mapper.*;
import com.cofar.backendapolo.api._v1.molulos.almacenVenta.model.AlmacenVentaDto;
import com.cofar.backendapolo.api._v1.molulos.cliente.model.ClienteDto;
import com.cofar.backendapolo.api._v1.molulos.estadoIngresoVenta.model.EstadoIngresoVentaDto;
import com.cofar.backendapolo.api._v1.molulos.ingresoVenta.model.IngresosVentas;
import com.cofar.backendapolo.api._v1.molulos.ingresoVenta.model.IngresosVentasDto;
import com.cofar.backendapolo.api._v1.molulos.ingresoVenta.util.IngresoConverter;
import com.cofar.backendapolo.api._v1.molulos.ingresodetalleVenta.model.IngresoDetalleVenta;
import com.cofar.backendapolo.api._v1.molulos.ingresodetalleVenta.model.IngresoDetalleVentaDto;
import com.cofar.backendapolo.api._v1.molulos.ingresodetalleVenta.util.IngresoDetalleConverter;
import com.cofar.backendapolo.api._v1.molulos.tipoCliente.model.TipoClienteDto;
import com.cofar.backendapolo.api._v1.molulos.tipoIngresoVenta.model.TipoIngresoVentaDto;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

@Service("IngresosVentasService_v1")
public class IngresosVentasService {

    @Autowired
    private IngresosVentasMapperApi ingresosVentasMapper;

    @Autowired
    private AlmacenVentaMapperApi almacenVentaMapper;

    @Autowired
    private EstadoIngresoVentaMapperApi estadoIngresoVentaMapper;

    @Autowired
    private TipoIngresoVentaMapperApi tiposIngresosVentasMapper;

    @Autowired
    private TipoClienteMapperApi tipoClienteMapper;

    @Autowired
    private ClienteMapperApi clienteMapper;

    @Autowired
    private IngresoDetalleVentasMapperApi ingresoDetalleVentasMapper;

    public List<IngresosVentasDto> findAllIngresosVentas(int codArea) {
        // Listamos los ingresos_ventas por codAreaEmpresa
        List<IngresosVentasDto> listIngresos = ingresosVentasMapper.findAllIngresosVentas(codArea);

        // Insertamos su detalle a cada ingreso_venta
        for (IngresosVentasDto ingreso: listIngresos) {
            int codIngreso = ingreso.getCodIngresoventas();
            ArrayList<IngresoDetalleVentaDto> listDetalle = ingresoDetalleVentasMapper.findAllDetalleAndProductoById(codIngreso);
            ingreso.setIngresoDetalleVenta(listDetalle);
        }
        // Devolvemos el listado de ingresos_ventas
        return listIngresos;
    }

    @Transactional
    public IngresosVentasDto findIngresosVentasByIdAndArea(int id, int codAreaEmpresa){
        // Listamos los ingresos_ventas por codAreaEmpresa y codIngresoVenta
        IngresosVentasDto ingreso = ingresosVentasMapper.findIngresosVentasByIdAndArea(id, codAreaEmpresa);

        // Verificamos si existe el ingreso_venta
        if(ingreso != null) {
            int codIngreso = ingreso.getCodIngresoventas();
            ArrayList<IngresoDetalleVentaDto> listDetalle = ingresoDetalleVentasMapper.findAllDetalleAndProductoById(codIngreso);
            ingreso.setIngresoDetalleVenta(listDetalle);
        }
        // Devolvemos el ingreso_venta encontrado, en caso contrario vacio
        return ingreso;
    }

    public int findNroIngresosVentas(int codGestion, int codAlmacen){
        return ingresosVentasMapper.nroIngresosVentas(codGestion, codAlmacen);
    }

    @Transactional
    public int saveIngresoVenta(IngresosVentasDto ingresoDto) {

        IngresosVentas ingreso = new IngresosVentas();

        ingreso = IngresoConverter.convertToDao(ingreso, ingresoDto);

        int codIngresoVenta = ingresosVentasMapper.maxIngresosVentas(ingresoDto.getCodAreasEmpresa()) + 1;
        ingreso.setCodIngresoventas(codIngresoVenta);

        int resp = ingresosVentasMapper.saveIngresoVenta(ingreso);

        List<IngresoDetalleVenta> ingresosDetalle = IngresoDetalleConverter.convertToDao(ingresoDto.getIngresoDetalleVenta());
        for (IngresoDetalleVenta detalle: ingresosDetalle) {
            detalle.setCodIngresoventas(codIngresoVenta);
            resp = ingresoDetalleVentasMapper.saveIngresoDetalleVenta(detalle);
        }
        return resp;
    }

    @Transactional
    public int updateIngresoVenta(int codIngreso, IngresosVentasDto ingresoDto){
        Gson gson = new Gson();
        System.out.println("ingresoDto:>>>>>>>>>>>  " + gson.toJson(ingresoDto));
        IngresosVentas ingreso = ingresosVentasMapper.findIngresosByIdAndArea(codIngreso, ingresoDto.getCodAreasEmpresa());
        System.out.println("ingreso:>>>>>>>>>>>  " + gson.toJson(ingreso));
        ingreso = IngresoConverter.convertToDao(ingreso, ingresoDto);

        if(ingreso == null){
            return -1;
        }else{
            int resp = ingresosVentasMapper.updateIngresoVenta(ingreso);

            ArrayList<IngresoDetalleVenta> ingresosDetalle = IngresoDetalleConverter.convertToDao(ingresoDto.getIngresoDetalleVenta());
            System.out.println("detalle:>>>>>>>>>>>  " + gson.toJson(ingresosDetalle));
            ingresoDetalleVentasMapper.deleteIngresoDetalleVenta(codIngreso, ingreso.getCodAreasEmpresa());
            for (IngresoDetalleVenta detalle: ingresosDetalle) {
                detalle.setCodIngresoventas(ingreso.getCodIngresoventas());
                resp = ingresoDetalleVentasMapper.saveIngresoDetalleVenta(detalle);
            }
            return resp;
        }
    }

    @Transactional
    public int deleteIngresoVenta(int id, int codAreaEmpresa){
//        IngresosVentas ingreso = ingresosVentasMapper.findIngresosVentasByIdAndArea(id,codAreaEmpresa);
//        if(ingreso == null){
//            return 0;
//        }else{
//            ingresosVentasMapper.deleteIngresosDetalleVentas(id, codAreaEmpresa);
//            return ingresosVentasMapper.deleteIngresoVenta(id);
//        }
        return 0;
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

        ArrayList<TipoIngresoVentaDto> tipoIngresoVentasDtos = tiposIngresosVentasMapper.getCodAndNombreActive();
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
