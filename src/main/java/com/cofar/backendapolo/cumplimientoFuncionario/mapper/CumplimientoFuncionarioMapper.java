package com.cofar.backendapolo.cumplimientoFuncionario.mapper;

import com.cofar.backendapolo.cumplimientoFuncionario.model.CumplimientoClienteFuncionarioResumen;
import com.cofar.backendapolo.cumplimientoFuncionario.model.CumplimientoFuncionarioResumenLinea;
import com.cofar.backendapolo.cumplimientoFuncionario.payload.*;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface CumplimientoFuncionarioMapper {

    public CumplimientoFucionarioGeneral obtenerCumplimientoFucionarioGeneral(@Param("codPersonal") int codPersonal, @Param("codPresupuesto") int codPresupuesto);
    public CumplimientoFucionarioLineaVenta obtenerCumplimientoFucionarioLineaventa(@Param("codPersonal") int codPersonal, @Param("codPresupuesto") int codPresupuesto);
    public List<CumplimientoFucionarioLineaMkt> obtenerCumplimientoFucionarioLineaMkt(@Param("codPersonal") int codPersonal, @Param("codPresupuesto") int codPresupuesto);
    public List<CumplimientoFucionarioPresentacion> obtenerCumplimientoFucionarioPresentacion(@Param("codPersonal") int codPersonal, @Param("codPresupuesto") int codPresupuesto);
    //Seguimiento de clientes por funcionario
    public CumplimientoFuncionarioResumenLinea getCumplimientoFuncionarioResumenLinea(@Param("codPersonal") int codPersonal, @Param("codPresupuestoPersonal") int codPresupuestoPersonal, @Param("codLineaVenta") int codLineaVenta);
    public CumplimientoClienteFuncionarioResumen getCumplimientoClienteFuncionarioResumen(@Param("codPersonal") int codPersonal, @Param("codPresupuesto") int codPresupuesto);
    public FechaActualizacionVentas getFechaActualizacionVentas(@Param("codAreaEmpresa") int codAreaEmpresa);
    public List<SeguimientoClienteFuncionario> getSeguimientoClienteFuncionario(@Param("codPresupuestoActual") int codPresupuestoActual, @Param("codPersonal") int codPersonal, @Param("codPresupuestoAnterior") int codPresupuestoAnterior);
    //Segumimiento jefe regional
    //public PeriodoSeguimientoVentas getObtener
    public double getObtenerPresupuestoVentasDeRegional(@Param("codGestion") int codGestion,
                                                     @Param("codLineaVenta") int codLineaVenta,
                                                     @Param("codPeriodoVentas") int codPeiodoVentas,
                                                     @Param("codMes") int codMes,
                                                     @Param("codAreaEmpresa") int codAreaEmpresa);
}
