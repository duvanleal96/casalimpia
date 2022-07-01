package org.sofkau.casalimpia.cliente.events;

import co.com.sofka.domain.generic.DomainEvent;
import org.sofkau.casalimpia.cliente.values.Comentario;

public class ComentarioAgregado extends DomainEvent {
    private final Comentario comentario;

    public ComentarioAgregado(Comentario comentario) {
        super("org.sofkau.comentarioagregado");
        this.comentario = comentario;
    }

    public Comentario getComentario() {
        return comentario;
    }
}
