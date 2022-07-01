package org.sofkau.casalimpia.cliente.events;

import co.com.sofka.domain.generic.DomainEvent;
import org.sofkau.casalimpia.cliente.values.ClienteId;

public class ServicioSolicitado extends DomainEvent {
    private final ClienteId clienteId;

    public ServicioSolicitado(ClienteId identity) {
        super("org.sofkau.serviciosolicitado");
        this.clienteId = identity;
    }

    public ClienteId getClienteId() {
        return clienteId;
    }
}
