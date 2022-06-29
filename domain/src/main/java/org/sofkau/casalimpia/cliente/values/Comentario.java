package org.sofkau.casalimpia.cliente.values;

import co.com.sofka.domain.generic.ValueObject;

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
        return null;
    }
}
