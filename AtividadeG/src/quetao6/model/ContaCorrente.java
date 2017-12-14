package quetao6.model;

public class ContaCorrente extends Conta {



    public ContaCorrente(Pessoa titular) {
        super(titular);
    }

    @Override
    public boolean sacar(double valor) {
        if (valor < this.saldo) {
            this.saldo -= valor;
            return true;
        }
          return false;
    }


    @Override
    public void atualiza(double taxa) {
        this.setSaldo(this.getSaldo() + this.getSaldo() * taxa * 2);
    }

    public void deposita(double valor) {
        this.setSaldo(this.getSaldo() + valor - 0.10);
    }
}
