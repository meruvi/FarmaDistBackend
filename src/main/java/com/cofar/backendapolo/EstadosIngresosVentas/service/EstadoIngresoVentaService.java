package com.cofar.backendapolo.EstadosIngresosVentas.service;

import com.cofar.backendapolo.EstadosIngresosVentas.mapper.EstadoIngresoVentaMapper;
import com.cofar.backendapolo.EstadosIngresosVentas.model.EstadoIngresoVentaDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class EstadoIngresoVentaService {

    @Autowired
    private EstadoIngresoVentaMapper estadoIngresoVentaMapper;

    @Transactional
    public List<EstadoIngresoVentaDto> findCodEstadoIngresoAndNombre() {
        return estadoIngresoVentaMapper.getCodAndNombreActive();
    }
}
