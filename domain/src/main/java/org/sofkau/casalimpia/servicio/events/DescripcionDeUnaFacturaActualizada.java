package org.sofkau.casalimpia.servicio.events;

import co.com.sofka.domain.generic.DomainEvent;
import org.sofkau.casalimpia.servicio.values.Descripcion;
import org.sofkau.casalimpia.servicio.values.FacturaId;

public class DescripcionDeUnaFacturaActualizada extends DomainEvent {
    private final FacturaId facturaId;
    private final Descripcion descripcion;

    public DescripcionDeUnaFacturaActualizada(FacturaId facturaId, Descripcion descripcion) {
        super("org.sofkau.DescripcionDeUnaFacturaActualizada");
        this.facturaId = facturaId;
        this.descripcion = descripcion;
    }

    public Descripcion descripcion() {
        return descripcion;
    }

    public FacturaId facturaId() {
        return facturaId;
    }
}
