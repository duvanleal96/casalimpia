package org.sofkau.casalimpia.cliente.values;

import co.com.sofka.domain.generic.ValueObject;

public class Ubicacion implements ValueObject<String> {
    private final String ubicacion;

    public Ubicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    @Override
    public String value() {
        return this.ubicacion;
    }
}
