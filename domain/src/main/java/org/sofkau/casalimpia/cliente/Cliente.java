package org.sofkau.casalimpia.cliente;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import org.sofkau.casalimpia.cliente.events.*;
import org.sofkau.casalimpia.cliente.values.*;

import java.util.List;

public class Cliente extends AggregateEvent<ClienteId> {
    protected Inmueble inmueble;
    protected Nombre nombre;
    protected Calificacion calificacion;

    public Cliente(ClienteId entityId, Nombre nombre) {
        super(entityId);
        appendChange(new ClienteCreado(entityId, nombre)).apply();
    }

    private Cliente(ClienteId entityId) {
        super(entityId);
        subscribe(new ClienteChange(this));
    }

    public static Cliente from(ClienteId aggregateId, List<DomainEvent> list) {
        Cliente team = new Cliente(aggregateId);
        list.forEach(team::applyEvent);
        return team;
    }

    public void actualizarInmueble(InmuebleId inmuebleId, Ubicacion ubicacion, TipoInmueble tipoInmueble){
        appendChange(new InmuebleActualizado(inmuebleId,ubicacion,tipoInmueble)).apply();
    }

    public void actulizarCalificacion(Double score){
        appendChange(new CalificacionActualizada(score)).apply();
    }

    public void agregarComentario(Comentario comentario){
        appendChange(new ComentarioAgregado(comentario)).apply();
    }

    public void solicitarServicio(){
        appendChange(new ServicioSolicitado(this.identity())).apply();
    }



}
