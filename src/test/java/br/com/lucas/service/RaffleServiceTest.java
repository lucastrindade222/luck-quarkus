package br.com.lucas.service;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import br.com.lucas.DTO.BingoDTO;
import br.com.lucas.DTO.RaffleName;
import br.com.lucas.DTO.RaffleNumbersDTO;
import io.quarkus.test.junit.QuarkusTest;

@QuarkusTest
public class RaffleServiceTest {

    private RaffleService service;

    

    @Test
    public void raffleNumbers() {
        service = new RaffleService();
        RaffleNumbersDTO number = service.raffleNumbers(1);
        
        Assertions.assertEquals(1, number.getNumber());
    }

    @Test
    public void bingo() {
        service = new RaffleService();
        List<BingoDTO> list = service.newbingo();
       
        Assertions.assertEquals(1, list.get(0).id);
        Assertions.assertEquals(75, list.size());
        Assertions.assertEquals(75, list.get(74).id);
    }

    @Test
    public void namesToList(){

        service = new RaffleService();
        RaffleName  names =    new RaffleName("casa,bola");

        List<RaffleName> listNames = service.raffleNameToList(names);
      
        Assertions.assertEquals(2, listNames.size());
        Assertions.assertEquals("bola", listNames.get(1).getNames());


    }

    @Test
    public void newnamesToList(){

        service = new RaffleService();
        RaffleName  names =    new RaffleName("bola");

        List<RaffleName> listNames = service.raffleNameToList(names); 
       
        Assertions.assertEquals(1, listNames.size());
        Assertions.assertEquals("bola", listNames.get(0).getNames());


    }





    @Test
    public void raffleName(){

        service = new RaffleService();
        RaffleName  names =    new RaffleName("bola");

        
        RaffleName drawn = service.raffleName(names); 
        Assertions.assertNotNull(drawn);

    }

}
