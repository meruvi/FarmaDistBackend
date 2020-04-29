package com.cofar.backendapolo.presentacionesProducto.service;

import com.cofar.backendapolo.presentacionesProducto.mapper.PresentacionesProductoMapper;
import com.cofar.backendapolo.presentacionesProducto.model.PresentacionesProducto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class PresentacionesProductoService {

    @Autowired
    private PresentacionesProductoMapper presentacionesProductoMapper;

    @Transactional
    public List<PresentacionesProducto> findCodPresentacionAndNombre(String nombre) {
        return presentacionesProductoMapper.getCodPresentacionAndNombre(nombre);
    }

    @Transactional
    public PresentacionesProducto findPresentacionById(int id) {
        return presentacionesProductoMapper.findById(id);
    }

}
