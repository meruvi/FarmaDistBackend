package com.cofar.backendapolo.tiposClientes.service;

import com.cofar.backendapolo.tiposClientes.mapper.TipoClienteMapper;
import com.cofar.backendapolo.tiposClientes.model.TipoClienteDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class TipoClienteService {

    @Autowired
    private TipoClienteMapper tipoClienteMapper;

    @Transactional
    public List<TipoClienteDto> findCodClienteAndNombre() {
        return tipoClienteMapper.getCodAndNombreActive();
    }
}
