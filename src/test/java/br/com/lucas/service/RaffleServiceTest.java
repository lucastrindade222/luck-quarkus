package br.com.lucas.service;

import javax.inject.Inject;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import br.com.lucas.DTO.RaffleDTO;
import io.quarkus.test.junit.QuarkusTest;

@QuarkusTest
public class RaffleServiceTest {
    @Inject
    public RaffleService service;

    @Test
    public void raffleNumbers() {

      
        

        RaffleDTO obj = service.raffleNumbers();
        Assertions.assertEquals("", obj.getNome());

    }

}
