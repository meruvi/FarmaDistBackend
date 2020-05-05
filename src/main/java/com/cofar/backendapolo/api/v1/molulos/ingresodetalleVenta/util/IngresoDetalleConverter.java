package com.cofar.backendapolo.api.v1.molulos.ingresodetalleVenta.util;

import com.cofar.backendapolo.api.v1.molulos.ingresodetalleVenta.model.IngresoDetalleVenta;
import com.cofar.backendapolo.api.v1.molulos.ingresodetalleVenta.model.IngresoDetalleVentaDto;

import java.util.ArrayList;
import java.util.List;

public class IngresoDetalleConverter {

    public static ArrayList<IngresoDetalleVenta> convertToDao(List<IngresoDetalleVentaDto> listDetalleDto) {

        ArrayList<IngresoDetalleVenta> listdetalleDao = new ArrayList<>();

        for (IngresoDetalleVentaDto detalledto  : listDetalleDto) {
            IngresoDetalleVenta detalleDao = new IngresoDetalleVenta();
            detalleDao.setCodIngresoventas(detalledto.getCodIngresoventas());
            detalleDao.setCodPresentacion(detalledto.getPresentacionesProductoDto().getCodPresentacion());
            detalleDao.setCodLoteProduccion(detalledto.getCodLoteProduccion());
            detalleDao.setCodAreaEmpresa(detalledto.getCodAreaEmpresa());
            detalleDao.setCantidad(detalledto.getCantidad());
            detalleDao.setCantidadUnitaria(detalledto.getCantidadUnitaria());
            detalleDao.setFechaVenc(detalledto.getFechaVenc());

            listdetalleDao.add(detalleDao);
        }

        return listdetalleDao;
    }
}
