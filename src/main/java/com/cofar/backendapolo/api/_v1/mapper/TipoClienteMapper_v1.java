package com.cofar.backendapolo.api._v1.mapper;

import com.cofar.backendapolo.api._v1.molulos.tipoCliente.model.TipoClienteDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.ArrayList;

@Mapper
public interface TipoClienteMapper_v1 {

    /*
    ** TIPOS_CLIENTE
     */

    ArrayList<TipoClienteDto> getCodAndNombreActive();


}
