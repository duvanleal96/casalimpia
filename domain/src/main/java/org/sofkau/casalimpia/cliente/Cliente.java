package org.sofkau.casalimpia.cliente;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import org.sofkau.casalimpia.cliente.values.ClienteId;
import org.sofkau.casalimpia.cliente.values.Nombre;

import java.util.List;

public class Cliente extends AggregateEvent<ClienteId> {
    protected Inmueble inmueble;
    protected Nombre nombre;
    protected Calificacion calificacion;

    public Cliente(ClienteId entityId) {
        super(entityId);
    }


    public static Cliente from(ClienteId aggregateId, List<DomainEvent> list) {
        Cliente team = new Cliente(aggregateId);
        list.forEach(team::applyEvent);
        return team;
    }


}
