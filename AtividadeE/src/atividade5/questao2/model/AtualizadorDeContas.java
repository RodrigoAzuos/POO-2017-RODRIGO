package atividade5.questao2.model;

public class AtualizadorDeContas {

    private double saldoTotal = 0;
    private double selic;

    public AtualizadorDeContas(double selic) {
        this.selic = selic;
    }

    public String roda(Conta c) {

        String saldo = "Código da conta "+ c.getCod() +"\nSaldo inicial: ";
        // aqui você imprime o saldo anterior, atualiza a conta,
        saldo += c.getSaldo();

        c.atualiza(this.selic);

        // e depois imprime o saldo final
        saldo +="\nsaldo final: "+ c.getSaldo();
        // lembrando de somar o saldo final ao atributo saldoTotal
        this.saldoTotal += c.getSaldo();

        return saldo;
    }

    public double getSaldoTotal() {
        return saldoTotal;
    }

}
