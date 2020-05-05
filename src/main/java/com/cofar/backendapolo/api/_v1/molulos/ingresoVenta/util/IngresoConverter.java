package com.cofar.backendapolo.api._v1.molulos.ingresoVenta.util;

import com.cofar.backendapolo.api._v1.molulos.ingresoVenta.model.IngresosVentas;
import com.cofar.backendapolo.api._v1.molulos.ingresoVenta.model.IngresosVentasDto;

public class IngresoConverter {

    public static IngresosVentas convertToDao(IngresosVentas ingresoDao, IngresosVentasDto ingresoDto) {

        ingresoDao.setCodIngresoventas(ingresoDto.getCodIngresoventas());
        ingresoDao.setCodAreasEmpresa(ingresoDto.getCodAreasEmpresa());
        ingresoDao.setCodAlmacenVenta(ingresoDto.getCodAlmacenVenta());
        ingresoDao.setCodTipoIngresoVenta(ingresoDto.getCodTipoIngresoVenta());
        ingresoDao.setCodCliente(ingresoDto.getCodCliente());
        ingresoDao.setCodEstadoIngresoVenta(ingresoDto.getCodEstadoIngresoVenta());
        ingresoDao.setFechaIngresoVenta(ingresoDto.getFechaIngresoVenta());
        ingresoDao.setNroIngresoVentas(ingresoDto.getNroIngresoVentas());
        ingresoDao.setObsIngresoventas(ingresoDto.getObsIngresoventas());

        return ingresoDao;
    }

//    public static CustomerDto convertToDto(CustomerV2Rep rep1) {
//        CustomerDto dto = new CustomerDto();
//        dto.setId(rep1.getId());
//        dto.setCity(rep1.getCity());
//        dto.setName(rep1.getName());
//        dto.setStatus(rep1.getStatus());
//        dto.setEmailAddress(rep1.getEmailAddress());
//        dto.setContactNumber(rep1.getContactNumer());
//        return dto;
//    }
//
//    public static CustomerRep convertToRep(CustomerDto dto) {
//        CustomerRep rep = new CustomerRep();
//        rep.setId(dto.getId());
//        rep.setCity(dto.getCity());
//        rep.setName(dto.getName());
//        rep.setStatus(dto.getStatus());
//        return rep;
//    }
//
//    public static CustomerV2Rep convertToRepV2(CustomerDto dto) {
//        CustomerV2Rep rep = new CustomerV2Rep();
//        rep.setId(dto.getId());
//        rep.setCity(dto.getCity());
//        rep.setName(dto.getName());
//        rep.setStatus(dto.getStatus());
//        rep.setEmailAddress(dto.getEmailAddress());
//        rep.setContactNumer(dto.getContactNumber());
//        return rep;
//    }

}
