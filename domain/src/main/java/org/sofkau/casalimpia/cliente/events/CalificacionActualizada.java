package org.sofkau.casalimpia.cliente.events;

import co.com.sofka.domain.generic.DomainEvent;

public class CalificacionActualizada extends DomainEvent {
    private final Double score;

    public CalificacionActualizada(Double score) {
        super("org.sofkau.calificacionactualizada");
        this.score = score;
    }

    public Double getScore() {
        return score;
    }
}
