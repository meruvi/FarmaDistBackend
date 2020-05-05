package com.cofar.backendapolo.api._v1.molulos.cliente.service;

import com.cofar.backendapolo.api.mapper.ClienteMapperApi;
import com.cofar.backendapolo.api._v1.molulos.cliente.model.ClienteDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("ClienteService_v1")
public class ClienteService {

    @Autowired
    private ClienteMapperApi clienteMapper;

    @Transactional
    public List<ClienteDto> findCodClienteAndNombre(int codArea, int codTipoCliente) {
        if(codTipoCliente == 0) {
            return clienteMapper.getCodAndNombreActive(codArea);
        }else{
            return clienteMapper.getCodAndNombreActiveByTipo(codArea, codTipoCliente);
        }
    }
}
