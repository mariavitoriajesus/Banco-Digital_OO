package org.BancoDigital;

public interface IConta {
    void sacar(double valor);

    void depositar(double valor);

    void transferiri(double valor, IConta contaDestino);

    void imprimirExtrato();
}
