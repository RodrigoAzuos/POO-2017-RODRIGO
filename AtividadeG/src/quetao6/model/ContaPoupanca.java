package quetao6.model;

public class ContaPoupanca extends ContaCorrente{

    public ContaPoupanca(Pessoa titular) {
        super(titular);
    }



    @Override
    public void atualiza(double taxa) {
          this.setSaldo(this.getSaldo() + this.getSaldo() * taxa * 3);

    }


}
