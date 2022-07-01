package org.sofkau.casalimpia.cliente.events;

import co.com.sofka.domain.generic.DomainEvent;
import org.sofkau.casalimpia.cliente.values.Nombre;

public class ClienteCreado extends DomainEvent {

    private final Nombre nombre;

    public ClienteCreado(Nombre nombre) {
        super("org.sofkau.casalimpia");
        this.nombre = nombre;
    }

    public Nombre getNombre() {
        return nombre;
    }
}
