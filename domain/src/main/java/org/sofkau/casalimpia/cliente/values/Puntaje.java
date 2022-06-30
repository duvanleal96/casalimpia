package org.sofkau.casalimpia.cliente.values;

import co.com.sofka.domain.generic.ValueObject;

public class Puntaje implements ValueObject<Double> {
    private final Double score;
    //private final Double numberOfPoints;
    public Puntaje(Double score) {
        this.score = score;
    }

    @Override
    public Double value() {
        return this.score;
    }

    public Puntaje update(Double newScore) {
        if(this.score == 0.0){
            return new Puntaje(newScore);
        }
        Double promedio = (this.score + newScore)/2;
        return  new Puntaje(promedio);
    }
}
