package com.cofar.backendapolo.api.mapper;

import com.cofar.backendapolo.api.v1.molulos.almacenVenta.model.AlmacenVentaDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.ArrayList;

@Mapper
public interface AlmacenVentaMapperApi {

    /*******************************************************************************************************************
     *******************************************************************************************************************
     ***********************************************    API VERSION 1     **********************************************
     *******************************************************************************************************************
     ******************************************************************************************************************/

    ArrayList<AlmacenVentaDto> getCodAndNombreActive(int codArea);



}
