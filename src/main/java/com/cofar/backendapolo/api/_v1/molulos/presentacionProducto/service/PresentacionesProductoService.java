package com.cofar.backendapolo.api._v1.molulos.presentacionProducto.service;

import com.cofar.backendapolo.api.mapper.PresentacionesProductoMapperApi;
import com.cofar.backendapolo.api._v1.molulos.presentacionProducto.model.PresentacionesProducto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("PresentacionesProductoService_v1")
public class PresentacionesProductoService {

    @Autowired
    private PresentacionesProductoMapperApi presentacionesProductoMapper;

    @Transactional
    public List<PresentacionesProducto> findCodPresentacionAndNombre(String nombre) {
        return presentacionesProductoMapper.getCodPresentacionAndNombre(nombre);
    }

    @Transactional
    public PresentacionesProducto findPresentacionById(int id) {
        return presentacionesProductoMapper.findById(id);
    }

}
