package br.com.lucas.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.enterprise.context.ApplicationScoped;

import br.com.lucas.DTO.BingoDTO;
import br.com.lucas.DTO.BingoNewDTO;
import br.com.lucas.DTO.RaffleName;
import br.com.lucas.DTO.RaffleNumbersDTO;

@ApplicationScoped
public class RaffleService {

    public BingoDTO bingo(BingoDTO obj) {

        Random random = new Random();
        BingoNewDTO drawn =  obj.getToDraw().get(random.nextInt(obj.getToDraw().size()));
        obj.getToDraw().remove(drawn);
        obj.getDrawns().add(drawn);
        return obj;

    }

    public List<BingoNewDTO> newbingo() {

        List<BingoNewDTO> list = new ArrayList<BingoNewDTO>();

        for (int x = 1; x < 76; x++) {
            if (x >= 1 && x <= 15) {
                BingoNewDTO obj = new BingoNewDTO(x, "B");
                list.add(obj);
            }
            if (x >= 16 && x <= 30) {
                BingoNewDTO obj = new BingoNewDTO(x, "I");
                list.add(obj);
            }
            if (x >= 31 && x <= 45) {
                BingoNewDTO obj = new BingoNewDTO(x, "N");
                list.add(obj);
            }
            if (x >= 46 && x <= 60) {
                BingoNewDTO obj = new BingoNewDTO(x, "G");
                list.add(obj);
            }
            if (x >= 61 && x <= 75) {
                BingoNewDTO obj = new BingoNewDTO(x, "O");
                list.add(obj);
            }
        }

        return list;
    }

    public RaffleNumbersDTO raffleNumbers(Integer max) {
        Integer min = 1;
        Random random = new Random();
        int number = random.nextInt((max - min) + 1) + min;
        return new RaffleNumbersDTO(number);

    }

    public RaffleName raffleName(RaffleName raffleNames) {

        List<RaffleName> list = this.raffleNameToList(raffleNames);
        Random random = new Random();
        return list.get(random.nextInt(list.size()));

    }

    public List<RaffleName> raffleNameToList(RaffleName raffleNames) {

        String tex = raffleNames.getNames();
        String separator = ",";
        List<RaffleName> list = new ArrayList<>();

        if (tex.indexOf(separator) != -1) {

            List<Integer> local = new ArrayList<>();
            local.add(0);
            for (int index = tex.indexOf(separator); index >= 0; index = tex.indexOf(separator, index + 1)) {

                local.add(index);
            }

            int counter = 0;
            for (Integer integer : local) {

                if (counter == 0 && local.size() > 1) {
                    String name = tex.substring(0, local.get(1));
                    list.add(new RaffleName(name));
                    System.out.println("1" + name);
                }
                if (local.size() < 1) {
                    list.add(new RaffleName(tex));

                }
                counter++;
                if (counter != local.size()) {
                    // String name = tex.substring(integer + 1, local.get(counter));

                    // if(!name.equals("")){
                    // list.add(new RaffleName(name));
                    // }

                }
                if (counter == local.size()) {
                    String name = tex.substring(integer + 1, tex.length());
                    System.out.println("4" + name);
                    list.add(new RaffleName(name));

                }

            }

        } else {
            list.add(new RaffleName(tex));
        }

        return list;

    }

}
