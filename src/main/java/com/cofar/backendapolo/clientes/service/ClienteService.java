package com.cofar.backendapolo.clientes.service;

import com.cofar.backendapolo.clientes.mapper.ClienteMapper;
import com.cofar.backendapolo.clientes.model.ClienteDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ClienteService {

    @Autowired
    private ClienteMapper clienteMapper;

    @Transactional
    public List<ClienteDto> findCodClienteAndNombre(int codArea, int codTipoCliente) {
        if(codTipoCliente == 0) {
            return clienteMapper.getCodAndNombreActive(codArea);
        }else{
            return clienteMapper.getCodAndNombreActiveByTipo(codArea, codTipoCliente);
        }
    }
}
