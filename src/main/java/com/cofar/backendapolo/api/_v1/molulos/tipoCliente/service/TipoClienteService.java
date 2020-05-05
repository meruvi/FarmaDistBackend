package com.cofar.backendapolo.api._v1.molulos.tipoCliente.service;

import com.cofar.backendapolo.api._v1.mapper.TipoClienteMapper_v1;
import com.cofar.backendapolo.api._v1.molulos.tipoCliente.model.TipoClienteDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("TipoClienteService_v1")
public class TipoClienteService {

    @Autowired
    private TipoClienteMapper_v1 tipoClienteMapper;

    @Transactional
    public List<TipoClienteDto> findCodClienteAndNombre() {
        return tipoClienteMapper.getCodAndNombreActive();
    }
}
