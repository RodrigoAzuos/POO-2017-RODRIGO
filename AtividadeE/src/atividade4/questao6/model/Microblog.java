package atividade4.questao6.model;

public class Microblog {

    private Postagem[] postagens;
    private int tamanho;
    private int ultimo;

    public Microblog(int tamanho) {
        this.tamanho = tamanho;
        postagens = new Postagem[this.tamanho];
        this.ultimo = 0;
    }

    public void incluirPostagem(Postagem postagem){
        if(temVaga()){
            this.postagens[ultimo] = postagem;
            ultimo++;
        }

    }

    public String excluir(int id){
        int index = 0;
        for (int i = 0; i < this.ultimo;i++){
            if(this.postagens[i].getId() == id){
                index = i;
            }
            return "Postagem não existente.";
        }


        if(index == this.ultimo - 1){
            this.ultimo--;

        }else{
            for (int i = index; i < ultimo;i++ ){
                this.postagens[i] = this.postagens[i+1];
            }
            this.ultimo--;
        }

        return "Postagem excluida";

    }

    public boolean temVaga(){
        return (ultimo < tamanho);
    }

    public void curtir(int id){
        Postagem postagem = pegarpostagem(id);
        if (postagem !=null)
            postagem.curtir();
    }

    public Postagem pegarpostagem(int id) {
        if (existe(id))
            for (int i = 0; i < this.ultimo; i++) {
                if (this.postagens[i].getId() == id) {
                    return this.postagens[i];
                }
            }
            return null;
    }

    public boolean existe(int id) {
        for (int i = 0; i < this.ultimo; i++) {
            if (this.postagens[i].getId() == id) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString(){
        String postagens = "";
        for (int i = 0; i < ultimo;i++){
            postagens += this.postagens[i].toString() + "\n";
        }

        return postagens;
    }
}
