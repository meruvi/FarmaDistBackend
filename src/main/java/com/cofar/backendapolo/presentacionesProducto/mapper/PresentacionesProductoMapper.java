package com.cofar.backendapolo.presentacionesProducto.mapper;



import com.cofar.backendapolo.presentacionesProducto.model.PresentacionesProducto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PresentacionesProductoMapper {

    /*
    ** PRESENTACIONES_PRODUCTOS
     */

    List<PresentacionesProducto> findByNombre(String nombre);

    List<PresentacionesProducto> getCodPresentacionAndNombre(String nombre);

    PresentacionesProducto findById(Integer id);

//    List<PresentacionesProducto> findAll(Integer codArea);
//
//    PresentacionesProducto findByIdAndArea(Integer id, Integer codAreaEmpresa);
//
//    Integer findMax(Integer codArea);
//
//    Integer save(PresentacionesProducto presentacionesProducto);
//
//    Integer update(PresentacionesProducto presentacionesProducto);
//
//    Integer delete(Integer id);

}
