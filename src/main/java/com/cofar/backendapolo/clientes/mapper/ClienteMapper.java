package com.cofar.backendapolo.clientes.mapper;

import com.cofar.backendapolo.clientes.model.ClienteDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.ArrayList;
import java.util.List;

@Mapper
public interface ClienteMapper {

    /*
    ** ALMACENNES_VENTA
     */

    ArrayList<ClienteDto> getCodAndNombreActive(int codArea);

    ArrayList<ClienteDto> getCodAndNombreActiveByTipo(int codArea, int codTipoCliente);

}
