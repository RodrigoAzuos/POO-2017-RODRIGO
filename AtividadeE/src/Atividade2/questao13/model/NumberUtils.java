package Atividade2.questao13.model;

public class NumberUtils {

    private int numero;

    public NumberUtils(int numero) {
        this.numero = numero;
    }

    public boolean isPair(){
        return (this.numero%2 == 0) ? true : false;
    }

    public boolean isOdd(){
        return (this.isPair())? true : false;
    }

    public boolean isPrime(){
        int cont = 0;
        for(int i = 1; i <= this.numero;i++)
            if (this.numero % i == 0 )
                cont++;

        return (cont == 2)? true : false;
    }

    public String printCount(){
        String numeros = "";
        for(int i = 0; i <= this.numero;i++)
            numeros += i + " ";

        return numeros;
    }

    public String printReverseCount(){
        String numeros = "";
        for(int i = this.numero; i >= 0;i--)
            numeros += i + " ";

        return numeros;
    }
}
