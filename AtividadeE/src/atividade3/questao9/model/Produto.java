package atividade3.questao9.model;

public class Produto {
    private static int controle;
    private int codigo;
    private double valor;
    private int quantidade;
    private int quantidadeMinima;

    public Produto(double valor, int quantidade, int quantidadeMinima) {
        this.codigo = ++controle;
        this.valor = valor;
        this.quantidade = quantidade;
        this.quantidadeMinima = quantidadeMinima;
    }

    public int baixar(int valor){
        if (valor > 0 && !this.estaAbaixo()){
            if (this.quantidade - valor > this.quantidadeMinima)
                this.quantidade -= valor;
        }
        return this.quantidade;
    }

    public int repor(int valor){
        if (valor > 0){
            this.quantidade += valor;
        }
        return this.quantidade;
    }

    public boolean estaAbaixo(){
        return (this.quantidade > quantidadeMinima)? false : true;
    }

    public double reajusta(double taxa){
        this.valor = this.valor + this.valor * (taxa/100);
        return this.valor;
    }

    public boolean equals(Produto produto){
        return (this.codigo == produto.codigo)? true : false;
    }


}
