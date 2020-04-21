package com.cofar.backendapolo.pruebasCRUD.service;

import com.cofar.backendapolo.pruebasCRUD.mapper.PaisMapper;
import com.cofar.backendapolo.pruebasCRUD.model.Pais;
import com.cofar.backendapolo.pruebasCRUD.model.ResponseClient;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

@Service
public class PaisService {

    ObjectMapper mapper = new ObjectMapper();

    @Autowired
    PaisMapper paisMapper;


    public List<Pais> getPaises() {
        return paisMapper.getPaises();
    }

    public List<Pais> getPaisesWithChild() {
        return paisMapper.getPaisesWithChild();
    }

    public Pais getPaisById(int id) {
        return paisMapper.getPaisById(id);
    }

    public Pais getPaisByIdWithChild(int id) {
        return paisMapper.getPaisByIdWithChild(id);
    }

    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public ResponseEntity<?> insertPais(Pais pais) {
        List<Pais> p = new ArrayList<>();
        try {
            System.out.println("MAPPER" + mapper.writeValueAsString(pais));
            int i =paisMapper.insertPais(pais);
            if(i > 0) p.add(paisMapper.getPaisById(pais.getCodPais()));
            return ResponseClient.success("Datos registrados correctamente!!!", p);
        } catch (Exception e){
            e.printStackTrace();
            return ResponseClient.error("Ocurrio un error al registrar los datos!!!", e.toString());
        }
    }

    public ResponseEntity<?> updatePais(int id, Pais pais) {
        LinkedHashMap<String, Object> response = new LinkedHashMap<String, Object>();
        Pais p = new Pais();
        try {
            System.out.println(mapper.writeValueAsString(pais));
            Pais paisBean = paisMapper.getPaisById(id);
            if(paisBean == null){
                return ResponseClient.error("No existe el registro con ese ID!!!", "No existe el registro con ese ID!!!");
            } else {
                int i = paisMapper.updatePais(pais);
                if(i > 0) p = paisMapper.getPaisById(pais.getCodPais());
                return ResponseClient.success("Datos modificados correctamente!!!", p);
            }
        } catch (Exception e){
            e.printStackTrace();
            return ResponseClient.error("Ocurrio un error al modificar los datos!!!", e.toString());
        }
    }

    public ResponseEntity<?> deletePais(int id) {
        LinkedHashMap<String, Object> response = new LinkedHashMap<String, Object>();
        List<Pais> p = new ArrayList<>();
        try {
            Pais paisBean = paisMapper.getPaisById(id);
            if(paisBean == null){
                return ResponseClient.error("No existe el registro con ese ID!!!", "No existe el registro con ese ID!!!");
            }else{
                int i = paisMapper.deletePais(id);
                if(i > 0) p.add(paisMapper.getPaisById(id));
                return ResponseClient.success("Datos eliminados correctamente!!!", paisBean);
            }
        }catch (Exception e){
            e.printStackTrace();
            return ResponseClient.error("Ocurrio un error al eliminar los datos!!!", e.toString());
        }
    }

}
