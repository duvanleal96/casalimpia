package org.sofkau.casalimpia.servicio;

import co.com.sofka.domain.generic.Entity;
import org.sofkau.casalimpia.servicio.values.Descripcion;
import org.sofkau.casalimpia.servicio.values.FacturaId;
import org.sofkau.casalimpia.servicio.values.Fecha;
import org.sofkau.casalimpia.servicio.values.Monto;

public class Factura extends Entity<FacturaId> {

    protected Fecha fecha ;
    protected Descripcion descripcion;
    protected Monto monto;
    public Factura(FacturaId facturaId,Fecha fecha,Descripcion descripcion,Monto monto) {
        super(facturaId);

        this.fecha = fecha;
        this.descripcion = descripcion;
        this.monto = monto;
    }

    public Descripcion descripcion() {
        return descripcion;
    }

    public Fecha fecha() {
        return fecha;
    }

    public Monto monto() {
        return monto;
    }
    public void actualizarFecha(Fecha fecha){
        this.fecha=fecha.actualizarFecha(fecha);
    }
    public void actualizarDescripcion(Descripcion descripcion){
        this.descripcion= descripcion.actualizarDescripcion(descripcion);
    }
}
