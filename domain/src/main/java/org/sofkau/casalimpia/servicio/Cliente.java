package org.sofkau.casalimpia.servicio;

import co.com.sofka.domain.generic.Entity;
import org.sofkau.casalimpia.servicio.values.ClienteId;

public class Cliente extends Entity<ClienteId> {
    public Cliente(ClienteId entityId) {
        super(entityId);
    }
}
