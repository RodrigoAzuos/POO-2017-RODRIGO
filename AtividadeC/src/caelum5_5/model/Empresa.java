package caelum5_5.model;

public class Empresa {

    private Funcionario [] funcionarios;
    private String cnpj;
    private int pos = 0;

    public Empresa(String cnpj, int qtdFuncionario) {
        this.cnpj = cnpj;
        this.funcionarios = new Funcionario[qtdFuncionario];
    }

    public boolean adcionar(Funcionario funcionario){
       if (!temVaga()) {
           aumentaTamanho(funcionario);
       }
            this.funcionarios[pos] = funcionario;
            pos++;
            return true;
    }

    public int verficaQuantidade(){
        return pos;
    }

    public boolean vagasLivres(){
        return this.funcionarios.length - this.verficaQuantidade() > 0 ;
    }

    public boolean temVaga(){
        return vagasLivres();
    }

    public String mostrarEmpregados() {
        String funcionarios = "";
        for (int i = 0; i < this.pos; i++){
            funcionarios += this.funcionarios[i].toString();
        }
        return funcionarios;
    }

    public boolean contem(Funcionario funcionario){
        return funcionario.isActive();
    }

    public void aumentaTamanho(Funcionario funcionario){
        Funcionario novoVetor [] = new Funcionario[this.funcionarios.length * 2];
        for(int i=0 ; i < pos;i++){
                novoVetor[i] = funcionarios[i];
        }

        funcionarios = novoVetor;
        adcionar(funcionario);
    }
}
