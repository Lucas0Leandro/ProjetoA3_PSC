package MatriculaPackage;

import PessoaPackage.Aluno;
import PessoaPackage.Pessoa;

public class MatriculaController extends Matricula {

    public static void main(String[] args) {

        Aluno A = new Aluno();

        System.out.println("nome do aluno é:" + A.getnome());
        System.out.println("sobrenome do aluno é:" + A.getsobrenome());
    }
}
