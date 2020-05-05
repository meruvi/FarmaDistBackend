package com.cofar.backendapolo.api._v1.molulos.tipoIngresoVenta.service;

import com.cofar.backendapolo.api.mapper.TipoIngresoVentaMapperApi;
import com.cofar.backendapolo.api._v1.molulos.tipoIngresoVenta.model.TipoIngresoVentaDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("TiposIngresosVentasService_v1")
public class TiposIngresosVentasService {

    @Autowired
    private TipoIngresoVentaMapperApi tiposIngresosVentasMapper;

    @Transactional
    public List<TipoIngresoVentaDto> findCodAndNombreActive() {
        return tiposIngresosVentasMapper.getCodAndNombreActive();
    }

}
