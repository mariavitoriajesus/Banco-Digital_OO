package org.BancoDigital;

public class Main {
    public static void main(String[] args) {
        Cliente Maria = new Cliente();
        Maria.setNome("Maria");

        Conta cc = new ContaCorrente(Maria);
        Conta poupanca = new ContaPoupanca(Maria);

        cc.depositar(100);
        cc.transferiri(100, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}