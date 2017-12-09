package atividade3Extra.questao6.model;

public class Post {

    private int contLike;

    public Post(int contLike) {
        this.contLike = contLike;
    }

    public void addLike(){
        this.contLike++;
    }

    public int getContLike() {
        return contLike;
    }
}
