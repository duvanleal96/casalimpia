package org.sofkau.casalimpia.cliente.values;

import co.com.sofka.domain.generic.Identity;

public class ClienteIdentity extends Identity {
    public ClienteIdentity(String uuid) {
        super(uuid);
    }

    public static ClienteIdentity of(String id) {
        return new ClienteIdentity(id);
    }
}
