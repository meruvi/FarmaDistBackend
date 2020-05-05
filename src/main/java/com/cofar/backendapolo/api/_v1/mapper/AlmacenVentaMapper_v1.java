package com.cofar.backendapolo.api._v1.mapper;

import com.cofar.backendapolo.api._v1.molulos.almacenVenta.model.AlmacenVentaDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.ArrayList;

@Mapper
public interface AlmacenVentaMapper_v1 {

    /*******************************************************************************************************************
     *******************************************************************************************************************
     ***********************************************    API VERSION 1     **********************************************
     *******************************************************************************************************************
     ******************************************************************************************************************/

    ArrayList<AlmacenVentaDto> getCodAndNombreActive(int codArea);



}
