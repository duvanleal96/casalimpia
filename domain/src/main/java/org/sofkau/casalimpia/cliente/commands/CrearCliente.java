package org.sofkau.casalimpia.cliente.commands;

import co.com.sofka.domain.generic.Command;
import org.sofkau.casalimpia.cliente.values.ClienteId;
import org.sofkau.casalimpia.cliente.values.Nombre;

public class CrearCliente extends Command {

    private final ClienteId clienteId;
    private final Nombre nombre;

    public CrearCliente(ClienteId entityId, Nombre nombre) {
        this.clienteId = entityId;
        this.nombre = nombre;
    }

    public ClienteId getClienteId() {
        return clienteId;
    }

    public Nombre getNombre() {
        return nombre;
    }
}
