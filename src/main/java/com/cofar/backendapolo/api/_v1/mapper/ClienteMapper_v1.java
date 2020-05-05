package com.cofar.backendapolo.api._v1.mapper;

import com.cofar.backendapolo.api._v1.molulos.cliente.model.ClienteDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.ArrayList;

@Mapper
public interface ClienteMapper_v1 {

    /*
    ** ALMACENNES_VENTA
     */

    ArrayList<ClienteDto> getCodAndNombreActive(int codArea);

    ArrayList<ClienteDto> getCodAndNombreActiveByTipo(int codArea, int codTipoCliente);




}
