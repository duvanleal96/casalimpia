package org.sofkau.casalimpia.servicio.events;

import co.com.sofka.domain.generic.DomainEvent;
import org.sofkau.casalimpia.servicio.values.FacturaId;
import org.sofkau.casalimpia.servicio.values.Fecha;

public class FechaDeUnaFacturaActualizada extends DomainEvent {
    private final FacturaId facturaId;
    private final Fecha fecha;

    public FechaDeUnaFacturaActualizada(FacturaId facturaId, Fecha fecha) {
        super("org.sofkau.FechaDeUnaFacturaActualizada");
        this.facturaId = facturaId;
        this.fecha = fecha;
    }

    public FacturaId facturaId() {
        return facturaId;
    }

    public Fecha fecha() {
        return fecha;
    }


}
