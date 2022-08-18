package br.com.bancario;

public class Conta {
    
    // Atributos de Classes
    int agencia;
    int numero;
    double saldo;

    public Conta(){

    }

    // Construtor de Classe
    public Conta(int agencia, int numero, double saldo){
        this.agencia =  agencia;
        this.numero = numero;
        this.saldo =  saldo;
        
    }

    // Depositar da Classe Conta
    public void depositar(double valor){
        this.saldo += valor;
    }

    public void retirar(double valor){
        this.saldo -= valor;
    }

    public double verifcarSaldo(){
        return this.saldo;
    }

}
