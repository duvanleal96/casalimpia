package org.sofkau.casalimpia.cliente;

import co.com.sofka.domain.generic.Entity;
import org.sofkau.casalimpia.cliente.values.InmuebleId;
import org.sofkau.casalimpia.cliente.values.TipoInmueble;
import org.sofkau.casalimpia.cliente.values.Ubicacion;

public class Inmueble extends Entity<InmuebleId> {
    private TipoInmueble tipo;
    private Ubicacion ubicacion;

    public Inmueble(InmuebleId entityId) {
        super(entityId);
    }
}
