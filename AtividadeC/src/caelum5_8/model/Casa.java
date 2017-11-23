package caelum5_8.model;

public class Casa {
    private String cor;
    private int totalDePorta;
    private Porta[] portas;
    private int pos = 0;

    public Casa(String cor, Porta[] portas, int totalDePorta) {
        this.cor = cor;
        this.portas = new Porta[totalDePorta];
    }

    public boolean adcionaPorta(Porta porta){
        this.portas[pos] = porta;
        return true;
    }

    public void mudarCor(String cor){
        this.cor = cor;
    }

    public int quantasPortasEstaoAbertas(){
        int cont = 0;
        for(int i =0; i < this.pos;i++){
            if (this.portas[i].isEstado())
                cont ++;
        }

        return cont;
    }

    public int totaDePortas(){
        return this.pos;
    }


}
