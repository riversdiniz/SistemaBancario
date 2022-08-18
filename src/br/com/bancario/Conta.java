package br.com.bancario;

public class Conta {
    
    int agencia;
    int numero;
    double saldo;

    public Conta(){

    }

    public Conta(int agencia, int numero, double saldo){

        this.agencia =  agencia;
        this.numero = numero;
        this.saldo =  saldo;
        
    }

}
