package org.sofkau.casalimpia.servicio;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.support.RequestCommand;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;
import org.sofkau.casalimpia.servicio.events.ServicioCreado;
import org.sofkau.casalimpia.servicio.values.ClienteId;
import org.sofkau.casalimpia.servicio.commands.CrearServicio;
import org.sofkau.casalimpia.servicio.values.ServicioId;

import java.util.Objects;

@ExtendWith(MockitoExtension.class)
class CrearServicioUseCaseTest {
    @InjectMocks
    CrearServicioUseCase useCase;

    @Test
    public void crearServicio(){
        //arrange
        ServicioId servicioId = ServicioId.of("1");
        ClienteId clienteId = ClienteId.of("1");
        var command = new CrearServicio(servicioId, clienteId);

        //act
        var events = UseCaseHandler.getInstance()
                .syncExecutor(useCase,new RequestCommand<>(command))
                .orElseThrow()
                .getDomainEvents();
        var servicioCreado = (ServicioCreado) events.get(0);
        //assert
        Assertions.assertTrue(Objects.nonNull(servicioCreado.servicioId().value()));
        Assertions.assertEquals("1", servicioCreado.clienteId().value());

    }
}