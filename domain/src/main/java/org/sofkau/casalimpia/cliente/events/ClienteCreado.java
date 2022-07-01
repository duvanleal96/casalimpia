package org.sofkau.casalimpia.cliente.events;

import co.com.sofka.domain.generic.DomainEvent;
import org.sofkau.casalimpia.cliente.values.ClienteId;
import org.sofkau.casalimpia.cliente.values.Nombre;

public class ClienteCreado extends DomainEvent {
    private final ClienteId clienteId;
    private final Nombre nombre;


    public ClienteCreado(ClienteId clienteId, Nombre nombre) {
        super("org.sofkau.casalimpia");
        this.clienteId = clienteId;
        this.nombre = nombre;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public ClienteId getClienteId() {
        return clienteId;
    }
}
