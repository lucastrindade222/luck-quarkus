package br.com.lucas.DTO;

public class BingoNewDTO {

    public Integer id;
    public String nome;

    public BingoNewDTO() {

    }

    public BingoNewDTO(Integer id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
