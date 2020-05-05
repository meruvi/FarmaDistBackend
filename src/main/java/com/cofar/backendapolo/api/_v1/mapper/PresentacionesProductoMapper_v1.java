package com.cofar.backendapolo.api._v1.mapper;



import com.cofar.backendapolo.api._v1.molulos.presentacionProducto.model.PresentacionesProducto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PresentacionesProductoMapper_v1 {

    /*
    ** PRESENTACIONES_PRODUCTOS
     */

    List<PresentacionesProducto> findByNombre(String nombre);

    List<PresentacionesProducto> getCodPresentacionAndNombre(String nombre);

    PresentacionesProducto findById(Integer id);



}
