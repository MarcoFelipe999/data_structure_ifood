package com.project.ifood.entidades;

import com.project.ifood.enums.StatusDoPedido;

public class Pedido {

    private int id;
    private String nomeDoPedido;
    private double valorDoPedido;
    private StatusDoPedido statusDoPedido;

    public Pedido(int id, String nomeDoPedido, double valorDoPedido, StatusDoPedido statusDoPedido) {
        this.id = id;
        this.nomeDoPedido = nomeDoPedido;
        this.valorDoPedido = valorDoPedido;
        this.statusDoPedido = statusDoPedido;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomeDoPedido() {
        return nomeDoPedido;
    }

    public void setNomeDoPedido(String nomeDoPedido) {
        this.nomeDoPedido = nomeDoPedido;
    }

    public double getValorDoPedido() {
        return valorDoPedido;
    }

    public void setValorDoPedido(double valorDoPedido) {
        this.valorDoPedido = valorDoPedido;
    }

    public StatusDoPedido getStatusDoPedido() {
        return statusDoPedido;
    }

    public void setStatusDoPedido(StatusDoPedido statusDoPedido) {
        this.statusDoPedido = statusDoPedido;
    }
}