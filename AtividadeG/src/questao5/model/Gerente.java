package questao5.model;

public class Gerente extends Funcionario{

    private double percetual;

    public Gerente(String nome, String cpf, String sexo, double percetual) {
        super(nome, cpf, sexo);
        this.percetual = percetual;
    }

    @Override
    public double getBonificacao() {
        return getSalario() + (getSalario() * this.percetual);
    }
}
