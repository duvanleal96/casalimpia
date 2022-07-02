package org.sofkau.casalimpia.servicio.values;

import co.com.sofka.domain.generic.ValueObject;

public class Comentario implements ValueObject<String> {
    private final String comentario;

    public Comentario(String comentario) {
        this.comentario = comentario;
    }

    @Override
    public String value() {
        return comentario;
    }
}
