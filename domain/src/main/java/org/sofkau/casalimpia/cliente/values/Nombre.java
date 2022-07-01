package org.sofkau.casalimpia.cliente.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Nombre nombre1 = (Nombre) o;
        return Objects.equals(nombre, nombre1.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre);
    }
}
