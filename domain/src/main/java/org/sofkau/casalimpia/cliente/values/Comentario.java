package org.sofkau.casalimpia.cliente.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Comentario implements ValueObject<String> {
    private final String comentario;

    public Comentario(String comentario) {
        try{
            if(comentario.isBlank()){
                throw new IllegalArgumentException("Valor invalido para comentario");
            }
            this.comentario = comentario;
        } catch (IllegalCallerException e) {
            throw new IllegalArgumentException(e.getMessage());
        }
    }


    @Override
    public String value() {
        return this.comentario;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Comentario that = (Comentario) o;
        return Objects.equals(comentario, that.comentario);
    }

    @Override
    public int hashCode() {
        return Objects.hash(comentario);
    }
}
