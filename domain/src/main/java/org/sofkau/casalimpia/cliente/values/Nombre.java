package org.sofkau.casalimpia.cliente.values;

import co.com.sofka.domain.generic.ValueObject;

public class Nombre implements ValueObject<String> {
    private final String nombre;

    public Nombre(String nombre) {
        try{
            if(nombre.isBlank()){
                throw new IllegalArgumentException("Valor invalido para nombre");
            }
            this.nombre = nombre;
        } catch (IllegalCallerException e) {
            throw new IllegalArgumentException(e.getMessage());
        }
    }

    @Override
    public String value() {
        return this.nombre;
    }
}
