package com.cofar.backendapolo.pruebasCRUD.mapper;

import com.cofar.backendapolo.pruebasCRUD.model.Pais;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PaisMapper {

    List<Pais> getPaises();

    List<Pais> getPaisesWithChild();

    Pais getPaisById(Integer id);

    Pais getPaisByIdWithChild(int id);

    Integer insertPais(Pais pais);

    Integer updatePais(Pais pais);

    Integer deletePais(Integer id);

}
