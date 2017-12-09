package atividade4.questao6.model;

public class Postagem {
    private static int controle;
    private int id;
    private String texto;
    private int qtdCurtida;

    public Postagem(String texto) {
        this.id = controle++;
        this.texto = texto;
    }

    public int getId() {
        return id;
    }

    public void curtir(){
        this.qtdCurtida++;
    }

    @Override
    public String toString() {
        return "id: " + this.id +"\n"+ this.texto + "\n" +
                "curtidas: " + this.qtdCurtida;
    }
}
