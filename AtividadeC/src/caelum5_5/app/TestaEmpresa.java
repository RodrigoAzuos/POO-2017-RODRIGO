package caelum5_5.app;

import caelum5_5.model.Data;
import caelum5_5.model.Empresa;
import caelum5_5.model.Funcionario;

public class TestaEmpresa {

    public static void main(String[] args) {

        Empresa empresaA = new Empresa("102938842", 20);
        Data dataHoje =  new Data(23,11,2017);

        for(int i = 0; i < 100; i++){
            empresaA.adcionar(new Funcionario("José" + i, "T.I", 1220, dataHoje,"123" + i));
        }


        System.out.println(empresaA.mostrarEmpregados());

    }
}
