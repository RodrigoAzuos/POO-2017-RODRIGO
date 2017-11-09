import jdk.net.SocketFlow;

public class Funcionario {

    String nome;
    String departamento;
    double salario;
    Data data;
    String rg;
    String status;

    public Funcionario(String nome, String departamento, double salario, Data data, String rg) {
        this.nome = nome;
        this.departamento = departamento;
        this.salario = salario;
        this.data = data;
        this.rg = rg;
        this.status = "Ativo";
    }

    void recebeAumennto(double aumento){
        this.salario += aumento;

    }

    double calculaGanhoAnual(){

        return this.salario * 12;

    }

    void demitir(){
        this.status = "Inativo";
    }

    String isActive(){
        return this.status;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", departamento='" + departamento + '\'' +
                ", salario=" + salario +
                ", data='" + data + '\'' +
                ", rg='" + rg + '\'' +
                '}';
    }
}
