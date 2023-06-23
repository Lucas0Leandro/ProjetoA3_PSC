package MatriculaPack;

import PessoaPack.Aluno;

public class MatriculaController extends Matricula {

    public static void main(String[] args) {

        Aluno A;

        A = new Aluno();

        System.out.printf("o nome e sobreno do aluno é: " + A.getNome());

        System.out.printf(" " + A.getSobrenome());
        System.out.println("");
    }
    
}
