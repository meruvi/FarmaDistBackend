package com.cofar.backendapolo.ingresosVentas.service;

import com.cofar.backendapolo.ingresosVentas.mapper.TiposIngresosVentasMapper;
import com.cofar.backendapolo.ingresosVentas.model.TipoIngresoVentasDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class TiposIngresosVentasService {

    @Autowired
    private TiposIngresosVentasMapper tiposIngresosVentasMapper;

    @Transactional
    public List<TipoIngresoVentasDto> findCodAndNombreActive() {
        return tiposIngresosVentasMapper.getCodAndNombreActive();
    }

}
