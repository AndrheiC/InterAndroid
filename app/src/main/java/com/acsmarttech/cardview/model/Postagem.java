package com.acsmarttech.cardview.model;

public class Postagem {
    private String nome;
    private String descricao;
    private String preco;
    private int imagem;

    public Postagem() {
    }

    public Postagem(String nome, String descricao, String preco, int imagem) {
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
        this.imagem = imagem;
    }

    public String getNome() {return nome;}

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getPreco() { return preco;}

    public void setPreco(String preco) {this.preco = preco;}

    public int getImagem() {
        return imagem;
    }

    public void setImagem(int imagem) {
        this.imagem = imagem;
    }
}
