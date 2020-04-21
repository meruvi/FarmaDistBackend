package com.cofar.backendapolo.pruebasCRUD.model;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.LinkedHashMap;

public class ResponseClient {

    private boolean ok;
    private String message;
    private Object object;
    private String error;

    public ResponseClient(boolean ok, String message, Object object){
        this.ok = ok;
        this.message = message;
        this.object = object;
    }

    public ResponseClient(boolean ok, String message, String error){
        this.ok = ok;
        this.message = message;
        this.error = error;
    }

    public LinkedHashMap<String, Object> enviar(){
        LinkedHashMap<String, Object> response = new LinkedHashMap<String, Object>();
        if(object != null){
            response.put("ok", ok);
            response.put("message", message);
            response.put("data", object);
        }else{
            response.put("ok", ok);
            response.put("message", message);
            response.put("error", error);
        }
        return response;
    }

    public static ResponseEntity<?> success(String message, Object object){
        LinkedHashMap<String, Object> response = new LinkedHashMap<String, Object>();
        response.put("ok", true);
        response.put("message", message);
        response.put("data", object);
        return ResponseEntity.status(HttpStatus.OK).body(response);
    }

    public static ResponseEntity<?> error(String message, String error){
        LinkedHashMap<String, Object> response = new LinkedHashMap<String, Object>();
        response.put("ok", false);
        response.put("message", message);
        response.put("error", error);
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(response);
    }

}
