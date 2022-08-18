package br.com.bancario;

import java.io.Serializable;

/**
 * Classe que abstrai uma Conta Bancária
 * 
 * @author River Diniz
 * @version 1.0
 */

public class Conta implements Serializable {

    // Atributos de Classes
    private int agencia;
    private int numero;
    private double saldo;

    public Conta() {

    }

    // Construtor de Classe
    public Conta(int agencia, int numero, double saldo) {
        this.agencia = agencia;
        this.numero = numero;
        this.saldo = saldo;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void depositar(double valor) {
        this.saldo += valor;
    }

    public void retirar(double valor) {
        this.saldo -= valor;
    }

    public double getSaldo() {
        return this.saldo;
    }

}
