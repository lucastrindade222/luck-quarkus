package br.com.lucas.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.enterprise.context.ApplicationScoped;

import br.com.lucas.DTO.BingoDTO;
import br.com.lucas.DTO.RaffleNumbersDTO;

@ApplicationScoped
public class RaffleService {

    public RaffleNumbersDTO raffleNumbers(Integer max) {
        Integer min = 1;
        Random random = new Random();
        int number = random.nextInt((max - min) + 1) + min;
        return new RaffleNumbersDTO(number);

    }

    public List<BingoDTO> newbingo() {

        List<BingoDTO> list = new ArrayList<BingoDTO>();

        for (int x = 1; x < 76; x++) {
            if (x >= 1 && x <= 15) {
                BingoDTO obj = new BingoDTO(x, "B");
                list.add(obj);
            }
            if (x >= 16 && x <= 30) {
                BingoDTO obj = new BingoDTO(x, "I");
                list.add(obj);
            }
            if (x >= 31 && x <= 45) {
                BingoDTO obj = new BingoDTO(x, "N");
                list.add(obj);
            }
            if (x >= 46 && x <= 60) {
                BingoDTO obj = new BingoDTO(x, "G");
                list.add(obj);
            }
            if (x >= 61 && x <= 75) {
                BingoDTO obj = new BingoDTO(x, "O");
                list.add(obj);
            }
        }

        return list;
    }

}
