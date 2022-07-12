package br.com.lucas.DTO;

import java.util.List;

public class BingoDTO {

    private List<BingoNewDTO> drawns;
    private List<BingoNewDTO> toDraw;


    public BingoDTO() {
    }
    public BingoDTO(List<BingoNewDTO> drawns, List<BingoNewDTO> toDraw) {
        this.drawns = drawns;
        this.toDraw = toDraw;
    }
    public List<BingoNewDTO> getDrawns() {
        return drawns;
    }
    public void setDrawns(List<BingoNewDTO> drawns) {
        this.drawns = drawns;
    }
    public List<BingoNewDTO> getToDraw() {
        return toDraw;
    }
    public void setToDraw(List<BingoNewDTO> toDraw) {
        this.toDraw = toDraw;
    }



    
}
