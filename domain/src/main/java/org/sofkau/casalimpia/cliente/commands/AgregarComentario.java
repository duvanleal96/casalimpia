package org.sofkau.casalimpia.cliente.commands;

import co.com.sofka.domain.generic.Command;
import org.sofkau.casalimpia.cliente.values.Comentario;

public class AgregarComentario extends Command {
    private final Comentario comentario;

    public AgregarComentario(Comentario comentario) {
        this.comentario = comentario;
    }

    public Comentario getComentario() {
        return comentario;
    }
}
