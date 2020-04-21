package com.cofar.backendapolo.pruebasCRUD.service;

import com.cofar.backendapolo.pruebasCRUD.mapper.EstadoRegistroMapper;
import com.cofar.backendapolo.pruebasCRUD.model.EstadoRegistro;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EstadoRegistroService {

    @Autowired
    private EstadoRegistroMapper estadoRegistroMapper;

    public List<EstadoRegistro> getEstadosRegistros() {
        return estadoRegistroMapper.getEstadosRegistros();
    }

    public List<EstadoRegistro> getEstadosRegistrosWithChild() {
        return estadoRegistroMapper.getEstadosRegistrosWithChild();
    }

}
