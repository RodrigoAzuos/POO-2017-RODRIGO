package quetao6.model;

public abstract class Conta {
    public static  int controle = 0;
    private int cod;
    private Pessoa titular;
    protected double saldo;

    public Conta(Pessoa titular){
        this.cod = controle++;
        this.titular = titular;
    }

    public void depositar(double valor) {
        if(valor > 0)
            this.saldo += valor;
    }

    public abstract boolean sacar(double valor);

//    public boolean sacar(double valor) {
//

    public String trasferir(Conta conta, double valor) {
        if (valor < this.getSaldo()) {
            this.sacar(valor);
            conta.depositar(valor);
            return "valor depositado!";
        }
        return "valor não depositado.";
    }

    public abstract void atualiza(double taxa);

    public double getSaldo() {
        return this.saldo;
    }

    protected void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getCod() {
        return cod;
    }

    @Override
    public String toString() {
        return "Código: " + this.getCod()+ "\nTitular: "+this.titular.getNome()+"\n";
    }
}

