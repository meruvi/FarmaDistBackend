package com.cofar.backendapolo.pruebasCRUD.mapper;

import com.cofar.backendapolo.pruebasCRUD.model.EstadoRegistro;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface EstadoRegistroMapper {

    List<EstadoRegistro> getEstadosRegistros();

    List<EstadoRegistro> getEstadosRegistrosWithChild();

}
