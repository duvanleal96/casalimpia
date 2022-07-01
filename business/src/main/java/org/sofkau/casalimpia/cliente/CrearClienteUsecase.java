package org.sofkau.casalimpia.cliente;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import org.sofkau.casalimpia.cliente.commands.CrearCliente;

public class CrearClienteUsecase extends UseCase<RequestCommand<CrearCliente>, ResponseEvents> {

    @Override
    public void executeUseCase(RequestCommand<CrearCliente> crearClienteRequestCommand) {
        var command = crearClienteRequestCommand.getCommand();
        var cliente = new Cliente(command.getClienteId(), command.getNombre());

        emit().onResponse(new ResponseEvents(cliente.getUncommittedChanges()));
    }
}
