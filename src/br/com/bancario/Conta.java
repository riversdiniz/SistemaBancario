package br.com.bancario;

/**
 * Classe que abstrai uma Conta Bancária
 * 
 * @author River Diniz
 * @version 1.0
 */

public class Conta {

    // Atributos de Classes
    int agencia;
    int numero;
    double saldo;

    public Conta() {

    }

    // Construtor de Classe
    public Conta(int agencia, int numero, double saldo) {
        this.agencia = agencia;
        this.numero = numero;
        this.saldo = saldo;

    }

    /**
     * Realiza um depósito na conta corrente
     * 
     * @param agencia o número da agencia
     * @param numero  o número da conta
     * @param Valor   o Valor que será depositado
     * @return O número do protcolo de confirmação
     */

    /**
     * Acrescena valor do Saldo da Conta
     * 
     * @param valor que será depositado
     * @see depositar
     */

    public void depositar(double valor) {
        this.saldo += valor;
    }

    /**
     * Retira um valor do Saldo da Conta
     * 
     * @param valor que seá retirado
     * @see depositar
     */

    public void retirar(double valor) {
        this.saldo -= valor;
    }

    /**
     * Verifica o Saldo da Conta
     * 
     * @return Valor do Saldo da Conta
     */

    public double verifcarSaldo() {
        return this.saldo;
    }

}
