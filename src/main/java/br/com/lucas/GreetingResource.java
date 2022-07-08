package br.com.lucas;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.eclipse.microprofile.openapi.annotations.Operation;
import org.eclipse.microprofile.openapi.annotations.tags.Tag;

import br.com.lucas.DTO.RaffleDTO;

@Path("/hello")
@Tag(name = "Bom dia")
public class GreetingResource {

    @GET
    @Operation(description = "Mostra um bem vindo da aplicação",summary = "Este é o teste gerado atomaticamente na apicação")
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "Hello from RESTEasy Reactive";
    }

    @GET
    @Path("/bomDia")
    @Tag(name = "bom dia")
    @Operation(description = "Mostra um bom dia",summary = "MOstrar na tela um bom dia ")
    @Produces(MediaType.APPLICATION_JSON_PATCH_JSON)
    public RaffleDTO bomdia() {
        return new RaffleDTO(1,"bom dia");
    }
}