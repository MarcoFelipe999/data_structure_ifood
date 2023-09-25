package com.project.ifood.pilha;

import com.project.ifood.entidades.Pessoa;

public class EstruturaPilha {
    private int tamanhoMaximo;
    private int topo;
    private Pessoa[] elementos;

    public EstruturaPilha(int tamanhoMaximo) {

        this.tamanhoMaximo = tamanhoMaximo;
        this.topo = -1;
        this.elementos = new Pessoa[tamanhoMaximo];
    }

    public void empilhar(Pessoa pessoa) {

        if (topo < tamanhoMaximo - 1) {
            topo++;
            elementos[topo] = pessoa;
            System.out.println("Empilhado: " + pessoa.getNome());
        } else {
            System.out.println("A pilha está cheia. Não é possível adicionar mais clientes.");
        }
    }

    public Pessoa desempilhar() {

        if (!estaVazia()) {
            Pessoa pessoaDesempilhada = elementos[topo];
            elementos[topo] = null;
            topo--;
            System.out.println("Desempilhado: " + pessoaDesempilhada.getNome());
            return pessoaDesempilhada;
        } else {
            System.out.println("A pilha está vazia. Não é possível desempilhar.");
            return null;
        }
    }

    public boolean estaVazia() {
        return topo == -1;
    }

    public boolean estaCheia() {
        return topo == tamanhoMaximo - 1;
    }
}