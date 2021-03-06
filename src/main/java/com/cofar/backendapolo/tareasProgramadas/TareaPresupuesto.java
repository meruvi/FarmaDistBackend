package com.cofar.backendapolo.tareasProgramadas;

import com.cofar.backendapolo.pruebas.service.ClienteServicePrueba;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class TareaPresupuesto {

    @Autowired
    @Qualifier("clienteServicePrueba")
    private ClienteServicePrueba clienteService;

    @Scheduled(
            cron = "0,30 * * * * *")
    public void PresupuestoVentasFuncionario(){
        System.out.println("PRESUPEUSTO");
    }
}
