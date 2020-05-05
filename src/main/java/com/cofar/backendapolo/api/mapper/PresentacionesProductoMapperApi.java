package com.cofar.backendapolo.api.mapper;



import com.cofar.backendapolo.api.v1.molulos.presentacionProducto.model.PresentacionesProducto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PresentacionesProductoMapperApi {

    /*
    ** PRESENTACIONES_PRODUCTOS
     */

    List<PresentacionesProducto> findByNombre(String nombre);

    List<PresentacionesProducto> getCodPresentacionAndNombre(String nombre);

    PresentacionesProducto findById(Integer id);



}
