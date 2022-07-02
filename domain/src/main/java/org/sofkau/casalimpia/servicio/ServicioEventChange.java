package org.sofkau.casalimpia.servicio;

import co.com.sofka.domain.generic.EventChange;
import org.sofkau.casalimpia.servicio.events.DescripcionDeUnaFacturaActualizada;
import org.sofkau.casalimpia.servicio.events.ServicioCreado;

public class ServicioEventChange extends EventChange {
    public ServicioEventChange(Servicio servicio) {
        apply((ServicioCreado event)->{
            servicio.clienteId=event.clienteId();
        });
        apply((DescripcionDeUnaFacturaActualizada event)->{
            servicio.descripcion.actualizarDescripcion(event.descripcion());
        });
    }
}
