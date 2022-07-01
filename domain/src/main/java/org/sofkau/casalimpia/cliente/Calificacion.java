package org.sofkau.casalimpia.cliente;

import co.com.sofka.domain.generic.Entity;
import org.sofkau.casalimpia.cliente.values.CalificacionId;
import org.sofkau.casalimpia.cliente.values.Comentario;
import org.sofkau.casalimpia.cliente.values.Puntaje;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Calificacion extends Entity<CalificacionId> {

    private Set<Comentario> comentarios;
    private Puntaje puntaje;

    public Calificacion(CalificacionId entityId) {
        super(entityId);
        this.comentarios =new HashSet<>();
        this.puntaje = new Puntaje(0.0);
    }

    public void agregarComentario(Comentario newComentario){

        this.comentarios.add(Objects.requireNonNull(newComentario));
    }

    public void actualizarPuntaje(Double newScore){
        this.puntaje = this.puntaje.update(newScore);
    }
}
