package org.sofkau.casalimpia.cliente.events;

import co.com.sofka.domain.generic.DomainEvent;
import org.sofkau.casalimpia.cliente.values.InmuebleId;
import org.sofkau.casalimpia.cliente.values.TipoInmueble;
import org.sofkau.casalimpia.cliente.values.Ubicacion;

public class InmuebleActualizado extends DomainEvent {
    private final InmuebleId inmuebleId;
    private final Ubicacion ubicacion;
    private final TipoInmueble tipoInmueble;

    public InmuebleActualizado(InmuebleId inmuebleId, Ubicacion ubicacion, TipoInmueble tipoInmueble) {
        super("org.sofkau.inmuebleactualizado");
        this.inmuebleId = inmuebleId;
        this.ubicacion = ubicacion;
        this.tipoInmueble = tipoInmueble;
    }

    public InmuebleId getInmuebleId() {
        return inmuebleId;
    }

    public Ubicacion getUbicacion() {
        return ubicacion;
    }

    public TipoInmueble getTipoInmueble() {
        return tipoInmueble;
    }
}
