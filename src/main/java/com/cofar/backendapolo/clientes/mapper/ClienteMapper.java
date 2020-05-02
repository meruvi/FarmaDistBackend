package com.cofar.backendapolo.clientes.mapper;

import com.cofar.backendapolo.clientes.model.ClienteDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ClienteMapper {

    /*
    ** ALMACENNES_VENTA
     */

    List<ClienteDto> getCodAndNombreActive(int codArea);

}
