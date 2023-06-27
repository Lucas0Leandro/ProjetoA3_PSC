package Tela.Delete;


import java.util.Scanner;
import DAO.DAO_Salas;

public class TelaSalas {
    
    public void exibir() {
        int ra;
        Scanner teclado = new Scanner(System.in);

        System.out.println("//--------------------//");
        System.out.print("ID da Sala: ");
        ra = teclado.nextInt();

        DAO_Salas daoSalas = new DAO_Salas();
        daoSalas.remover(ra);


    }

}
