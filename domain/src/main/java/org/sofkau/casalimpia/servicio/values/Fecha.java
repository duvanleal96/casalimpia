package org.sofkau.casalimpia.servicio.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Date;
import java.util.Objects;

public class Fecha implements ValueObject<Date> {
    private final Date fecha;

    public Fecha(Date fecha) {
        this.fecha = fecha;
    }

    @Override
    public Date value() {
        return fecha;
    }

    public Date fecha() {
        return fecha;
    }

    public Fecha actualizarFecha(Fecha fecha){
        return new Fecha(Objects.requireNonNull(fecha.actualizarFecha(fecha).value()));
    }
}
