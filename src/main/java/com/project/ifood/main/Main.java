package com.project.ifood.main;

import com.project.ifood.entidades.Cliente;
import com.project.ifood.entidades.Funcionario;
import com.project.ifood.pilha.EstruturaPilha;

public class Main {

    public static void main(String[] args) {

        // Pilha utilizada para armazenar os os dados da aplicação.

        EstruturaPilha pilhaClientes = new EstruturaPilha(4);
        EstruturaPilha pilhaFuncionarios = new EstruturaPilha(6);

        // Clientes do Ifood

        Cliente cliente1 = new Cliente("Alice", "099.111.765-87", 23, "Feminino");
        Cliente cliente2 = new Cliente("Matheus", "129.511.985-11", 18, "Masculino");
        Cliente cliente3 = new Cliente("Maria", "765.165.876-22", 29, "Feminino");
        Cliente cliente4 = new Cliente("Felipe", "543.652.785-07", 23, "Masculino");


        pilhaClientes.empilhar(cliente1);
        pilhaClientes.empilhar(cliente2);
        pilhaClientes.empilhar(cliente3);
        pilhaClientes.empilhar(cliente4);

        pilhaClientes.desempilhar();
        pilhaClientes.desempilhar();
        pilhaClientes.desempilhar();
        pilhaClientes.desempilhar();

        pilhaClientes.estaCheia();
        pilhaClientes.estaVazia();

        // Funcionários do Ifood

        Funcionario funcionario1 = new Funcionario("Pedro", "099.111.765-87", 23, "Feminino","Entregador",1300);
        Funcionario funcionario2 = new Funcionario("David", "099.111.765-87", 19, "Masculino","Gerente",5000);
        Funcionario funcionario3 = new Funcionario("Victor", "099.111.765-87", 23, "Masculino","Entregador",1800);
        Funcionario funcionario4 = new Funcionario("José", "099.111.765-87", 38, "Masculino","Gerente",2000);

        pilhaFuncionarios.empilhar(funcionario1);
        pilhaFuncionarios.empilhar(funcionario2);
        pilhaFuncionarios.empilhar(funcionario3);
        pilhaFuncionarios.empilhar(funcionario4);

        pilhaFuncionarios.desempilhar();
        pilhaFuncionarios.desempilhar();
        pilhaFuncionarios.desempilhar();
        pilhaFuncionarios.desempilhar();

        pilhaFuncionarios.estaCheia();
        pilhaFuncionarios.estaVazia();

    }
}