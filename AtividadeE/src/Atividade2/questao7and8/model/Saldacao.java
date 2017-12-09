package Atividade2.questao7and8.model;

public class Saldacao {
    private String texto;
    private String destinatario;

    public Saldacao(String texto, String destinatario) {
        this.texto = texto;
        this.destinatario = destinatario;
    }

    public String obterSaldacao(){
        return this.texto + this.destinatario;
    }
}
