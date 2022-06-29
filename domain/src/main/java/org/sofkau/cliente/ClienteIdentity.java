package org.sofkau.cliente;

import co.com.sofka.domain.generic.Identity;

public class ClienteIdentity extends Identity {
    public ClienteIdentity(String uuid) {
        super(uuid);
    }

    public static ClienteIdentity of(String id) {
        return new ClienteIdentity(id);
    }
}
