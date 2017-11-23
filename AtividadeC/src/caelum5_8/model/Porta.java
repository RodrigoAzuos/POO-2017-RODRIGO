package caelum5_8.model;

public class Porta {

    private int tamanho;
    private String tipo;
    private boolean estado;
    private String cor;


    public Porta(int tamanho, String tipo,String cor) {
        this.tamanho = tamanho;
        this.tipo = tipo;
        this.cor = cor;
    }

    public void abrirPorta(){
        this.estado = true;
    }

    public void fechaPorta(){
        this.estado = false;
    }

    public boolean isEstado() {
        return estado;
    }
}
