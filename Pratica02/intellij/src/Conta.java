package com.company;
public class Conta {
    int numero;
    String nome;
    double saldo;
    String cpf;
    public void visualizarSaldo(){
        System.out.printf("Conta: "+numero + "com Saldo R$: " + saldo);
    }
    public void depositar(double valorparadepositar){
        saldo += valorparadepositar;

    }
    public void sacar(double valorparasacar){
        saldo -= valorParaSacar;


    }
    public void transferirDinheiro(double valor, Conta beneficiado){
        sacar(valor);
        beneficiado.depositar(valor);

    }
}
