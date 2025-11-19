package br.com.fuctura.bibliotecaNoite;

public class Categoria extends Livro{

    private Integer id;
    private String nome;
    private String descricao;

    public Categoria (Integer id, String nome, String descricao){
        super(id, nome, descricao);
        this.descricao = descricao;
    }

    public String getDescricao(){
        return descricao;
    }

    public void setDescricao(String descricao){
        this.descricao = descricao;
    }
}
