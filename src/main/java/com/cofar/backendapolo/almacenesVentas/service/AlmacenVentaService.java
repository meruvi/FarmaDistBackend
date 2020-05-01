package com.cofar.backendapolo.almacenesVentas.service;

import com.cofar.backendapolo.almacenesVentas.mapper.AlmacenVentaMapper;
import com.cofar.backendapolo.almacenesVentas.model.AlmacenVentaDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class AlmacenVentaService {

    @Autowired
    private AlmacenVentaMapper almacenVentaMapper;

    @Transactional
    public List<AlmacenVentaDto> findCodAlmacenAndNombre(int codArea) {
        return almacenVentaMapper.getCodAndNombreActive(codArea);
    }
}
