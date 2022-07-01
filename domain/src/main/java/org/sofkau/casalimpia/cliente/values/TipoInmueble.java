package org.sofkau.casalimpia.cliente.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class TipoInmueble implements ValueObject<String> {
    private enum Tipos{CASA, APARTAMENTO, OFICINA};
    private Tipos tipo;

    public TipoInmueble(String tipo) {

        try {
            if(tipo.isBlank()){
                throw new IllegalArgumentException("Valor invalido para tipo de inmueble");
            }
            String upperTipo= tipo.toUpperCase();

            if(!isValid(upperTipo)){
                throw new IllegalArgumentException("Valor invalido para tipo de inmueble");
            }
            this.tipo = Tipos.valueOf(upperTipo);

        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException(e.getMessage());
        }

    }

    private boolean isValid(String tipo) {
        for(Tipos element: Tipos.values()){
            if (element.name().equals(tipo)){
                return true;
            }
        }
        return false;
    }

    @Override
    public String value() {
        return this.tipo.name();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TipoInmueble that = (TipoInmueble) o;
        return tipo == that.tipo;
    }

    @Override
    public int hashCode() {
        return Objects.hash(tipo);
    }
}
