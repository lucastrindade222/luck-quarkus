package br.com.lucas.recouser;

import static javax.ws.rs.core.MediaType.APPLICATION_JSON;

import java.util.List;

import javax.inject.Inject;
import javax.transaction.Transactional;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.eclipse.microprofile.openapi.annotations.Operation;
import org.eclipse.microprofile.openapi.annotations.parameters.RequestBody;
import org.eclipse.microprofile.openapi.annotations.tags.Tag;
import org.jboss.resteasy.reactive.RestPath;

import br.com.lucas.DTO.BingoDTO;
import br.com.lucas.DTO.RaffleName;
import br.com.lucas.service.RaffleService;
import br.com.lucas.DTO.RaffleNumbersDTO;
@Path("/raffle")
public class RaffleControle {
    @Inject
    private RaffleService service;

    @GET
    @Path("/newBingo")
    @Operation(description = "Geração do bingo.", summary = "Carregamento dos numeros do bingo.")
    @Tag(name = "Bingo")
    @Produces(APPLICATION_JSON)
    public Response newbingo() {
        List<BingoDTO> list = service.newbingo();
        return Response.ok(list).build();
    }

   
    @GET
    @Path("/number/{quantity}")
    @Operation(description = "Sorteios de Numeros.", summary = "Sorteio de numeros aleatorios.")
    @Tag(name = "Sorteio")
    @Produces(APPLICATION_JSON)
    public Response raffle(@RestPath Integer quantity) {
        RaffleNumbersDTO raffleNumbersDTO = service.raffleNumbers(quantity);
        return Response.ok(raffleNumbersDTO).build();
    }

    @POST
    @Path("/names")
    @Operation(description = "Sorteios de Nomes.", summary = "Sorteio de Nomes aleatorios.")
    @Tag(name = "Sorteio")
    @Produces(MediaType.APPLICATION_JSON)
    public Response raffleNames(RaffleName names ) {
         
       RaffleName drawn = service.raffleName(names);
        return Response.ok(drawn).build();
    }
    


}
