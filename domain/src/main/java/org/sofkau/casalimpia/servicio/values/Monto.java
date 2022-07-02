package org.sofkau.casalimpia.servicio.values;

import co.com.sofka.domain.generic.ValueObject;

public class Monto implements ValueObject<Integer> {
    private final Integer monto;

    public Monto(Integer monto) {
        this.monto = monto;
    }

    @Override
    public Integer value() {
        return null;
    }

}
