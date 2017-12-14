package questao5.model;

public abstract class Funcionario {

    private String nome;
    private String cpf;
    private String sexo;
    private double salario;

    public Funcionario(String nome, String cpf, String sexo) {
        this.nome = nome;
        this.cpf = cpf;
        this.sexo = sexo;
    }

    public abstract double getBonificacao();

    public double getSalario() {
        return salario;
    }
}
