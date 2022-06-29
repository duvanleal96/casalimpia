package org.sofkau.casalimpia.empleado;

import co.com.sofka.domain.generic.AggregateEvent;
import org.sofkau.casalimpia.empleado.values.EmpleadoId;

public class Empleado extends AggregateEvent<EmpleadoId> {

    protected DatosEmpleado datosEmpleado;
    protected Curso curso;
    protected Calificacion calificacion;

    public Empleado(EmpleadoId entityId) {
        super(entityId);
    }
}
