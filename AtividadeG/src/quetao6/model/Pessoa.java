package quetao6.model;

public class Pessoa {

    private String nome;
    private long cpf;
    private int rg;
    private Data dataNascimento;


    public Pessoa(String nome, long cpf, int rg, Data dataNascimento) {
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
        this.dataNascimento = dataNascimento;
    }

    public String getNome() {
        return nome;
    }

    public Data getDataNascimento() {
        return dataNascimento;
    }

    @Override
    public String toString() {
        return "nome: '" + this.nome + '\'' +
                ", cpf: " + cpf +
                ", data de nascimento: " + this.dataNascimento;
    }
}
