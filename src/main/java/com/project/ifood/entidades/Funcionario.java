package com.project.ifood.entidades;

public class Funcionario extends Pessoa {

    private String cargo;
    private double salario;

    public Funcionario(String nome, String cpf, int idade, String sexo, String cargo, int salario) {
        super(nome, cpf, idade, sexo);
        this.cargo = cargo;
        this.salario = salario;
    }
}