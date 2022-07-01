package org.sofkau.casalimpia.cliente.commands;

import co.com.sofka.domain.generic.Command;
import org.sofkau.casalimpia.cliente.values.ClienteId;
import org.sofkau.casalimpia.cliente.values.Comentario;

public class AgregarComentario extends Command {
    private final ClienteId clienteId;
    private final Comentario comentario;

    public AgregarComentario(ClienteId clienteId, Comentario comentario) {
        this.clienteId = clienteId;
        this.comentario = comentario;
    }

    public Comentario getComentario() {
        return comentario;
    }
}
