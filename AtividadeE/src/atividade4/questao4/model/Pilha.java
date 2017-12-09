package atividade4.questao4.model;

public class Pilha {

    private int[] array;
    private int ultimo;

    public Pilha() {
        this.array = new int[5];
        this.ultimo = 0;
    }

    public void empilhar(int valor){
        if(!estaCheia()){
            array[ultimo] = valor;
            ultimo++;
        }
    }

    public boolean estaCheia(){
        return (ultimo == 5)? true :false;
    }

    public void desempilhar(){
        this.ultimo--;
    }

    public int retornaTopo(){
        return this.array[0];
    }

    public String exibir(){
        String valores ="";
        for (int i = 0; i < this.ultimo;i++)
            valores += this.array[i]+" ";
        valores += "\n";
        return valores;
    }
}
