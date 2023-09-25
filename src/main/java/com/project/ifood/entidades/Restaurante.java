package com.project.ifood.entidades;

public class Restaurante {

    private String nome;
    private String local;
    private int avaliacao;

    public Restaurante(String nome, String local, int avaliacao) {
        this.nome = nome;
        this.local = local;
        this.avaliacao = avaliacao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public int getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(int avaliacao) {
        this.avaliacao = avaliacao;
    }
}