package br.com.bancario;

public class Teste {
    public static void main(String[] args) {
        
        Conta cc = new Conta();
        cc.saldo = 50.0;
        cc.agencia = 123;
        cc.numero = 321;

        cc.depositar(1000);

        System.out.println(cc.verifcarSaldo());

    }
}
