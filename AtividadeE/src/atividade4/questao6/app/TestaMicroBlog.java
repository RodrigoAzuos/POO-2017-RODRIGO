package atividade4.questao6.app;

import atividade4.questao6.model.Microblog;
import atividade4.questao6.model.Postagem;

public class TestaMicroBlog {

    public static void main(String[] args) {

        Postagem postagem1 = new Postagem("O dia esta lindo hj!");
        Postagem postagem2 = new Postagem("O dia estah lindo hj!");
        Postagem postagem3 = new Postagem("O dia está lindo hj!");

        Microblog microblog = new Microblog(5);

        microblog.incluirPostagem(postagem1);
        microblog.incluirPostagem(postagem2);
        microblog.incluirPostagem(postagem3);

        System.out.println(microblog.temVaga());

        System.out.println(microblog);

        microblog.curtir(0);
        microblog.curtir(0);
        microblog.curtir(1);
        System.out.println(microblog);

    }
}
