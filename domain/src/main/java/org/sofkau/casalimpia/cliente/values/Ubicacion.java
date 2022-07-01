package org.sofkau.casalimpia.cliente.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Ubicacion implements ValueObject<String> {
    private final String ubicacion;

    public Ubicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    @Override
    public String value() {
        return this.ubicacion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ubicacion ubicacion1 = (Ubicacion) o;
        return Objects.equals(ubicacion, ubicacion1.ubicacion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ubicacion);
    }
}
