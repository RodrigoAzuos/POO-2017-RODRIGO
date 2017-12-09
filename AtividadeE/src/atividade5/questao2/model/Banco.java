package atividade5.questao2.model;

public class Banco {

    private String razaoSocial;
    private long cnpj;
    private int ultimo;
    private Conta[] contas;

    public Banco(String razaoSocial, long cnpj, int quantidade) {
        this.razaoSocial = razaoSocial;
        this.cnpj = cnpj;
        this.ultimo = 0;
        this.contas = new Conta[quantidade];
    }

    public String adcionaConta(Conta conta){
        if (this.temVaga()){
            if (ultimo > 0) {
                for (int i = 0; i < this.ultimo; i++) {
                    if (conta.getCod() == contas[i].getCod())
                        return "Esta conta já existe";
                }
            }
            this.contas[this.ultimo] = conta;
            this.ultimo++;
            return "Conta adicionada com sucesso!";
        }
        return "Conta não adicionada";
    }

    public boolean temVaga(){
        return  (this.ultimo < this.contas.length) ?  true : false;
    }

    public Conta getConta(int x){
        for(int i = 0; i < ultimo;i++)
            if (x == contas[i].getCod())
                return contas[i];
        return null;
    }

    public int getTotalDeContas(){
        return this.ultimo;
    }

    public String getContas(){
        String contas = " ";
        for(int i = 0; i < ultimo;i++)
            contas += this.contas[i].toString();
        return contas;
    }

    @Override
    public String toString() {
        return "Banco: "+ this.razaoSocial+ "\nQuantidade de contas: "+this.getTotalDeContas();
    }

}
