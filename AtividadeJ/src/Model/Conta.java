package Model;

import Exceptions.SaldoInsuficienteException;

public class Conta {

    private double saldo;

    public Conta() {

    }

    public double getSaldo() {
        return saldo;
    }

    public  void depositar(double valor)  {
        if (valor < 0 )
            throw new IllegalArgumentException("Não pode depositar um valor menor que 0");


        this.saldo += valor;

    }

    public void sacar(double valor){
        if (valor < 0)
            throw new IllegalArgumentException("Você tentou sacar um valor negativo");
        if (valor > this.saldo)
            throw new SaldoInsuficienteException(valor);


        this.saldo -= valor;

    }
}
