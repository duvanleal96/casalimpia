package org.sofkau.casalimpia.cliente;

import co.com.sofka.domain.generic.Entity;
import org.sofkau.casalimpia.cliente.values.InmuebleId;
import org.sofkau.casalimpia.cliente.values.TipoInmueble;
import org.sofkau.casalimpia.cliente.values.Ubicacion;

import java.util.Objects;

public class Inmueble extends Entity<InmuebleId> {
    private TipoInmueble tipo;
    private Ubicacion ubicacion;

    public Inmueble(InmuebleId entityId, Ubicacion ubicacion, TipoInmueble tipoInmueble)
    {
        super(entityId);
        this.ubicacion = ubicacion;
        this.tipo =tipoInmueble;
    }

    public void cammbiarUbicacion(Ubicacion nuevaUbicacion){
        this.ubicacion = Objects.requireNonNull(nuevaUbicacion);
    }

    public void cambiarTipo(TipoInmueble newTipo){
        this.tipo = Objects.requireNonNull(newTipo);
    }
}
