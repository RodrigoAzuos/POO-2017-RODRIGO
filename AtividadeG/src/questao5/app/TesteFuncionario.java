package questao5.app;

import questao5.model.Diretor;
import questao5.model.Gerente;

public class TesteFuncionario {

    public static void main(String[] args) {

        Gerente gerente = new Gerente("rodrigo", "1234","masculino", 0.05);
        Gerente diretor = new Diretor("rodrigo", "1234","masculino", 0.1);

        System.out.println(gerente.getBonificacao());
        System.out.println(diretor.getBonificacao());
    }
}
