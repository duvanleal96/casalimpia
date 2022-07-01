package org.sofkau.casalimpia.cliente.commands;

import co.com.sofka.domain.generic.Command;
import org.sofkau.casalimpia.cliente.values.ClienteId;

public class ActulizarCalificacion extends Command {
    private final ClienteId clienteId;
    private final Double score;

    public ActulizarCalificacion(ClienteId clienteId, Double score) {
        this.clienteId = clienteId;
        this.score = score;
    }

    public Double getScore() {
        return score;
    }
}
