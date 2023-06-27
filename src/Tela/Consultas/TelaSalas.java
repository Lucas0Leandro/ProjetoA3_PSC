package Tela.Consultas;

import java.util.Scanner;
import DAO.DAO_Salas;
import EduPack.Salas;
import java.util.List;

public class TelaSalas {
    
    public void exibir() {
        int opc;
        Scanner teclado = new Scanner(System.in);
        DAO_Salas daoSalas = new DAO_Salas();

        do {
            System.out.println("//-------------------------//");
            System.out.println("       LISTA DE SALAS");        

            List<Salas> listaSalas = daoSalas.listar();

            for (Salas salas : listaSalas) {
                System.out.println("\nID: " + salas.getID());
                System.out.println("Capacidade: " + salas.getCapacidade());
                System.out.println("Local: " + salas.getLocal());
                System.out.println("--------------------------------------------------------------------");
            }

            System.out.println("\n\nDigite 0 para sair.");
            opc = teclado.nextInt();

        } while (opc != 0);
        
    }

}
