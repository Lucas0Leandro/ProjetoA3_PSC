package Tela.Cadastros;

import java.util.Scanner;
import DAO.DAO_Salas;
import EduPack.Salas;

public class TelaSalas {
    
    public void exibir() throws InterruptedException {
        String local;
        int id, capacidade;

        Scanner teclado = new Scanner(System.in);

        System.out.println("//--------------------//");
        System.out.println("   CADASTRAR SALAS");
        System.out.print("ID: ");
        id = teclado.nextInt();
        teclado.nextLine(); 
        System.out.print("\nLocal: ");
        local = teclado.nextLine();
        System.out.print("\nCapacidade de Alunos: ");
        capacidade = teclado.nextInt();
        teclado.nextLine(); 
        System.out.println("       CONCLUIDO");
        System.out.println("//--------------------//\n");

        Salas salas = new Salas();
        salas.setID(id);
        salas.setLocal(local);
        salas.setCapacidade(capacidade);
        
        DAO_Salas daoSalas = new DAO_Salas();
        daoSalas.cadastrarSalas(salas);

        clearTerminal();
    }

    public static void clearTerminal() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

}
