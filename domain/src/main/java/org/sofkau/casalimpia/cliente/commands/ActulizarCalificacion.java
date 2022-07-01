package org.sofkau.casalimpia.cliente.commands;

import co.com.sofka.domain.generic.Command;

public class ActulizarCalificacion extends Command {

    private final Double score;

    public ActulizarCalificacion(Double score) {
        this.score = score;
    }

    public Double getScore() {
        return score;
    }
}
