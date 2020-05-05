package com.cofar.backendapolo.api._v1.molulos.almacenVenta.service;

import com.cofar.backendapolo.api.mapper.AlmacenVentaMapperApi;
import com.cofar.backendapolo.api._v1.molulos.almacenVenta.model.AlmacenVentaDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("AlmacenVentaService_v1")
public class AlmacenVentaService {

    @Autowired
    private AlmacenVentaMapperApi almacenVentaMapper;

    @Transactional
    public List<AlmacenVentaDto> findCodAlmacenAndNombre(int codArea) {
        return almacenVentaMapper.getCodAndNombreActive(codArea);
    }
}
