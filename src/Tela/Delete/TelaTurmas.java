package Tela.Delete;


import java.util.Scanner;
import DAO.DAO_Turmas;

public class TelaTurmas {
    
    public void exibir() {
        int ra;
        Scanner teclado = new Scanner(System.in);

        System.out.println("//--------------------//");
        System.out.print("ID da Turma: ");
        ra = teclado.nextInt();

        DAO_Turmas daoTurmas = new DAO_Turmas();
        daoTurmas.remover(ra);


    }

}