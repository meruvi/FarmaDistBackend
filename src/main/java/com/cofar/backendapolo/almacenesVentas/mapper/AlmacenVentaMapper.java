package com.cofar.backendapolo.almacenesVentas.mapper;

import com.cofar.backendapolo.almacenesVentas.model.AlmacenVentaDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.ArrayList;
import java.util.List;

@Mapper
public interface AlmacenVentaMapper {

    /*
    ** ALMACENNES_VENTA
     */

    ArrayList<AlmacenVentaDto> getCodAndNombreActive(int codArea);

}
