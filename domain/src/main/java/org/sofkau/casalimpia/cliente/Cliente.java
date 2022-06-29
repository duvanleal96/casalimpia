package org.sofkau.casalimpia.cliente;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import org.sofkau.casalimpia.cliente.values.ClienteIdentity;
import org.sofkau.casalimpia.cliente.values.Nombre;

import java.util.List;

public class Cliente extends AggregateEvent<ClienteIdentity> {
    protected Inmueble inmueble;
    protected Nombre nombre;
    protected Calificacion calificacion;

    public Cliente(ClienteIdentity entityId) {
        super(entityId);
    }


    public static Cliente from(ClienteIdentity aggregateId, List<DomainEvent> list) {
        Cliente team = new Cliente(aggregateId);
        list.forEach(team::applyEvent);
        return team;
    }


}
