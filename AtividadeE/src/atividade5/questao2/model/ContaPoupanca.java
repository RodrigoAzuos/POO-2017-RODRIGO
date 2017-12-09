package atividade5.questao2.model;

public class ContaPoupanca extends Conta {


    public ContaPoupanca(Pessoa titular) {
        super(titular);
    }

    @Override
    public void atualiza(double taxa) {
        this.setSaldo(this.getSaldo() + this.getSaldo() * taxa * 3);

    }

}
