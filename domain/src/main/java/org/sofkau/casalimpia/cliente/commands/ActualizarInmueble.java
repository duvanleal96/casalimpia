package org.sofkau.casalimpia.cliente.commands;

import co.com.sofka.domain.generic.Command;
import org.sofkau.casalimpia.cliente.values.ClienteId;
import org.sofkau.casalimpia.cliente.values.InmuebleId;
import org.sofkau.casalimpia.cliente.values.TipoInmueble;
import org.sofkau.casalimpia.cliente.values.Ubicacion;

public class ActualizarInmueble extends Command {

    private final ClienteId clienteId;
    private final InmuebleId inmuebleId;
    private final TipoInmueble tipoInmueble;
    private final Ubicacion ubicacion;

    public ActualizarInmueble(ClienteId clienteId, InmuebleId inmuebleId, Ubicacion ubicacion, TipoInmueble tipoInmueble) {
        this.clienteId = clienteId;
        this.inmuebleId = inmuebleId;
        this.ubicacion = ubicacion;
        this.tipoInmueble = tipoInmueble;
    }

    public InmuebleId getInmuebleId() {
        return inmuebleId;
    }

    public TipoInmueble getTipoInmueble() {
        return tipoInmueble;
    }

    public Ubicacion getUbicacion() {
        return ubicacion;
    }
}
