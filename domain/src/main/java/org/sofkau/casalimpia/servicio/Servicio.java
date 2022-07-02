package org.sofkau.casalimpia.servicio;

import co.com.sofka.domain.generic.AggregateEvent;
import org.sofkau.casalimpia.servicio.events.DescripcionDeUnaFacturaActualizada;
import org.sofkau.casalimpia.servicio.events.FechaDeUnaFacturaActualizada;
import org.sofkau.casalimpia.servicio.events.ServicioCreado;
import org.sofkau.casalimpia.servicio.values.*;

import java.util.Objects;

public class Servicio extends AggregateEvent<ServicioId> {

    protected ClienteId clienteId;
    protected FacturaId facturaId;
    protected CitaId citaId;

    protected Descripcion descripcion;

    public Servicio(ServicioId servicioId, ClienteId clienteId, FacturaId facturaId, CitaId citaId) {
        super(servicioId);
        this.clienteId = clienteId;
        this.facturaId = facturaId;
        this.citaId = citaId;
    }

    public CitaId citaId() {
        return citaId;
    }

    public ClienteId clienteId() {
        return clienteId;
    }

    public FacturaId facturaId() {
        return facturaId;
    }
    public Servicio(ServicioId servicioId,ClienteId clienteId) {
        super(servicioId);
        appendChange(new ServicioCreado(servicioId, clienteId)).apply();
        subscribe(new ServicioEventChange(this));
    }
    public void actualizarFechaDeUnaFactura(FacturaId facturaId, Fecha fecha){
        Objects.requireNonNull(facturaId);
        Objects.requireNonNull(fecha);
        appendChange(new FechaDeUnaFacturaActualizada(facturaId,fecha));
    }
    public void actualizarDescripcionDeUnaFactura(FacturaId facturaId,Descripcion descripcion){
        Objects.requireNonNull(facturaId);
        Objects.requireNonNull(descripcion);
        appendChange(new DescripcionDeUnaFacturaActualizada(facturaId,descripcion));
    }

}
