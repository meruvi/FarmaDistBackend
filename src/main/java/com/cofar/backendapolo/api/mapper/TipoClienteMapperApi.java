package com.cofar.backendapolo.api.mapper;

import com.cofar.backendapolo.api.v1.molulos.tipoCliente.model.TipoClienteDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.ArrayList;

@Mapper
public interface TipoClienteMapperApi {

    /*
    ** TIPOS_CLIENTE
     */

    ArrayList<TipoClienteDto> getCodAndNombreActive();


}
