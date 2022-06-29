package org.sofkau.casalimpia.cliente;

import co.com.sofka.domain.generic.Entity;
import org.sofkau.casalimpia.cliente.values.CalificacionIdentity;
import org.sofkau.casalimpia.cliente.values.Comentario;
import org.sofkau.casalimpia.cliente.values.Puntaje;

import java.util.Set;

public class Calificacion extends Entity<CalificacionIdentity> {

    private Set<Comentario> comentarios;
    private Puntaje puntaje;

    public Calificacion(CalificacionIdentity entityId) {
        super(entityId);
    }
}
