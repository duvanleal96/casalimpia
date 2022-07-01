package org.sofkau.casalimpia.cliente;


import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.support.RequestCommand;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;
import org.sofkau.casalimpia.cliente.commands.CrearCliente;
import org.sofkau.casalimpia.cliente.events.ClienteCreado;
import org.sofkau.casalimpia.cliente.values.ClienteId;
import org.sofkau.casalimpia.cliente.values.Nombre;

import java.util.Objects;

@ExtendWith(MockitoExtension.class)
class CrearClienteUsecaseTest {

    @InjectMocks
    CrearClienteUsecase useCase;


    @Test
    public void crearClienteCorrecto(){
        //arrange
        ClienteId clienteId = ClienteId.of("123456789");
        Nombre nombre = new Nombre("Prueba");
        var command = new CrearCliente(clienteId, nombre);

        //act
        var events = UseCaseHandler.getInstance()
                .syncExecutor(useCase,new RequestCommand<>(command))
                .orElseThrow()
                .getDomainEvents();
        var clienteCreado = (ClienteCreado) events.get(0);
        //assert
        Assertions.assertTrue(Objects.nonNull(clienteCreado.getClienteId().value()));
        Assertions.assertEquals("Prueba", clienteCreado.getNombre().value());
        Assertions.assertEquals("123456789", clienteCreado.getClienteId().value());

    }
}