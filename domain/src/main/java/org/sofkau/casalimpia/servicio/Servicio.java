package org.sofkau.casalimpia.servicio;

import co.com.sofka.domain.generic.AggregateEvent;

public class Servicio extends AggregateEvent<ServicioId> {

    public Servicio(ServicioId servicioId) {
        super(servicioId);
    }
}
