package com.cofar.backendapolo.api._v1.molulos.estadoIngresoVenta.service;

import com.cofar.backendapolo.api._v1.mapper.EstadoIngresoVentaMapper_v1;
import com.cofar.backendapolo.api._v1.molulos.estadoIngresoVenta.model.EstadoIngresoVentaDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("EstadoIngresoVentaService_v1")
public class EstadoIngresoVentaService {

    @Autowired
    private EstadoIngresoVentaMapper_v1 estadoIngresoVentaMapper;

    @Transactional
    public List<EstadoIngresoVentaDto> findCodEstadoIngresoAndNombre() {
        return estadoIngresoVentaMapper.getCodAndNombreActive();
    }
}
