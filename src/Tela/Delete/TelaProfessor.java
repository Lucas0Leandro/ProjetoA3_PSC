package Tela.Delete;


import java.util.Scanner;
import DAO.DAO_Professor;

public class TelaProfessor {
    
    public void exibir() {
        int ra;
        Scanner teclado = new Scanner(System.in);

        System.out.println("//--------------------//");
        System.out.print("RA do Professor: ");
        ra = teclado.nextInt();

        DAO_Professor daoProfessor = new DAO_Professor();
        daoProfessor.remover(ra);

        System.out.println("Deletado com sucesso!");

        
    }

}
