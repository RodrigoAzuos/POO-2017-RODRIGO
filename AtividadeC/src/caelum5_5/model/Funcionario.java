package caelum5_5.model;

public class Funcionario {
    public static int id = 0;
    private int numeroFunc;
    private String nome;
    private String departamento;
    private double salario;
    private Data dataEntrada;
    private String rg;
    private boolean status;


    public Funcionario(String nome, String departamento, double salario, Data data, String rg) {
        this.numeroFunc = id++;
        this.nome = nome;
        this.departamento = departamento;
        this.salario = salario;
        this.dataEntrada = data;
        this.rg = rg;
        this.status = true;
    }

    void recebeAumennto(double aumento){
        this.salario += aumento;

    }

    double calculaGanhoAnual(){

        return this.salario * 12;

    }

    void demitir(){
        this.status = false;
    }

    boolean isActive(){
        return this.status;
    }

    @Override
    public String toString() {
        return  "nome:'" + this.nome + '\'' +
                "\nSalario: "+ this.salario +
                "\ndepartamento: '" + this.departamento + '\'' +
                "\ndata entrada: '" + this.dataEntrada+ "\n";
    }
}
