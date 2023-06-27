package Tela.Consultas;

import java.util.Scanner;
import DAO.DAO_Professor;
import PessoaPack.Professor;

public class TelaProfessor {
    
    public void exibir() {
        int opc;
        Scanner teclado = new Scanner(System.in);
        DAO_Professor daoProfessor = new DAO_Professor();

        do {
            System.out.println("//--------------------//");
            System.out.println("    LISTA DE ALUNOS");        

            List<Professor> listaProfessor = daoProfessor.listar();

            for (Professor professor : listaProfessor) {
                System.out.println("\nRA: " + professor.getId());
                System.out.println("Nome: " + professor.getNome());
                System.out.println("Sobrenome: " + professor.getSobrenome());
                System.out.println("CPF: " + professor.getCPF());
                System.out.println("Fone: " + professor.getfone());
                System.out.println("Endereço: " + professor.getendereço());
                System.out.println("CEP: " + professor.getcep());
                System.out.println("--------------------------------------------------------------------");
            }

            System.out.println("\n\nDigite 0 para sair.");
            opc = teclado.nextInt();

        } while (opc != 0);
        
    }

}
