package org.sofkau.cliente;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;

import java.util.List;

public class Cliente extends AggregateEvent<ClienteIdentity> {
    private final Inmueble inmueble;
    private final Nombre nombre;
    private final Calificacion;

    public Cliente(ClienteIdentity entityId) {
        super(entityId);
    }


    public static Cliente from(ClienteIdentity aggregateId, List<DomainEvent> list) {
        Cliente team = new Cliente(aggregateId);
        list.forEach(team::applyEvent);
        return team;
    }


}
