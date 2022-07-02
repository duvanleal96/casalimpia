package org.sofkau.casalimpia.servicio.events;

import co.com.sofka.domain.generic.DomainEvent;
import org.sofkau.casalimpia.servicio.Servicio;
import org.sofkau.casalimpia.servicio.values.ClienteId;
import org.sofkau.casalimpia.servicio.values.ServicioId;

public class ServicioCreado extends DomainEvent {
    private final ClienteId clienteId;
    private final ServicioId servicioId;

    public ServicioCreado(ServicioId servicioId, ClienteId clienteId) {
        super("org.sofkau.ServicioCreado");

        this.clienteId = clienteId;
        this.servicioId = servicioId;
    }

    public ClienteId clienteId() {
        return clienteId;
    }

    public ServicioId servicioId() {
        return servicioId;
    }
}
