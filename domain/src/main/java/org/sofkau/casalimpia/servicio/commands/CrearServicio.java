package org.sofkau.casalimpia.servicio.commands;

import co.com.sofka.domain.generic.Command;
import org.sofkau.casalimpia.servicio.values.ClienteId;
import org.sofkau.casalimpia.servicio.values.ServicioId;

public class CrearServicio extends Command {
    private final ServicioId servicioId;
    private final ClienteId clienteId;

    public CrearServicio(ServicioId servicioId, ClienteId clienteId) {
        this.servicioId = servicioId;
        this.clienteId = clienteId;
    }

    public ServicioId getServicioId() {
        return servicioId;
    }

    public ClienteId getClienteId() {
        return clienteId;
    }
}
