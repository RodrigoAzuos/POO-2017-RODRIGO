package atividade3.questao4;

public class Questao4 {
    /*Quando passamos um valor por parametro com o mesmo nome de uma variavel existente temos que usar a palavra reservada
    "this" para dizer que estamos nos referindo a variavel declarada na nossa classe
    */
    double valor;

    void x(double valor) {
        this.valor = this.valor + valor;
    }
}
