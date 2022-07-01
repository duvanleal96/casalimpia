package org.sofkau.casalimpia.cliente;

import co.com.sofka.domain.generic.EventChange;
import org.sofkau.casalimpia.cliente.events.CalificacionActualizada;
import org.sofkau.casalimpia.cliente.events.ClienteCreado;
import org.sofkau.casalimpia.cliente.events.ComentarioAgregado;
import org.sofkau.casalimpia.cliente.events.InmuebleActualizado;

public class ClienteChange extends EventChange {
    public ClienteChange(Cliente cliente) {
        apply((ClienteCreado event) ->{
            cliente.nombre = event.getNombre();
        });

        apply((CalificacionActualizada event)->{
            cliente.calificacion.actualizarPuntaje(event.getScore());
        });

        apply((ComentarioAgregado event)->{
            cliente.calificacion.agregarComentario(event.getComentario());
        });

        apply((InmuebleActualizado event)->{
            if(cliente.inmueble == null){
                cliente.inmueble = new Inmueble(event.getInmuebleId(),event.getUbicacion(),event.getTipoInmueble());
            }else{
                cliente.inmueble.cambiarTipo(event.getTipoInmueble());
                cliente.inmueble.cammbiarUbicacion(event.getUbicacion());
            }
        });


    }
}
