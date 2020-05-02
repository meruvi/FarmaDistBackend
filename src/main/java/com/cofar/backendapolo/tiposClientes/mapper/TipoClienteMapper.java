package com.cofar.backendapolo.tiposClientes.mapper;

import com.cofar.backendapolo.tiposClientes.model.TipoClienteDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TipoClienteMapper {

    /*
    ** TIPOS_CLIENTE
     */

    List<TipoClienteDto> getCodAndNombreActive();

}
