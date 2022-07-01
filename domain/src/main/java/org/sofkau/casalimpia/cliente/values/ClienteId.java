package org.sofkau.casalimpia.cliente.values;

import co.com.sofka.domain.generic.Identity;

public class ClienteId extends Identity {
    private ClienteId(String uuid) {
        super(uuid);
    }

    public ClienteId() {
    }

    public static ClienteId of(String id) {
        return new ClienteId(id);
    }
}
