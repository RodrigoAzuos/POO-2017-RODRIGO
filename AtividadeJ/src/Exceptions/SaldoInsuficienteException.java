package Exceptions;

public class SaldoInsuficienteException extends RuntimeException {

    public SaldoInsuficienteException(double valor) {
        super("Saldo insuficiente, para este valor: " + valor);
    }
}
