package atividade3Extra.questao6.app;

import atividade3Extra.questao6.model.Post;

public class TestaPost {

    public static void main(String[] args) {

        Post  post = new Post(1);
        post.addLike();
        System.out.println(post.getContLike());
    }
}
