package Tela.Cadastros;

import java.util.Scanner;
import DAO.DAO_Turmas;
import EduPack.Turmas;

public class TelaTurmas {
    
    public void exibir() throws InterruptedException {
        String tipo, hora;
        int id, semestre, ano;

        Scanner teclado = new Scanner(System.in);

        System.out.println("//--------------------//");
        System.out.println("   CADASTRAR TURMAS");
        System.out.print("ID: ");
        id = teclado.nextInt();
        teclado.nextLine(); // Consumir a nova linha pendente antes de ler a próxima string
        System.out.print("\nSemestre: ");
        semestre = teclado.nextInt();
        teclado.nextLine(); // Consumir a nova linha pendente antes de ler a próxima string
        System.out.print("\nAno: ");
        ano = teclado.nextInt();
        teclado.nextLine(); // Consumir a nova linha pendente antes de ler a próxima string
        System.out.print("\nTipo: ");
        tipo = teclado.nextLine();
        System.out.print("\nHorario: ");
        hora = teclado.nextLine();
        System.out.println("       CONCLUIDO");
        System.out.println("//--------------------//\n");

        Turmas turmas = new Turmas();
        turmas.setID(id);
        turmas.setSemestre(semestre);
        turmas.setAno(ano);
        turmas.setTipo(tipo);
        turmas.setHora(hora);
        
        DAO_Turmas daoTurmas = new DAO_Turmas();
        daoTurmas.cadastrarTurmas(turmas);

        clearTerminal();
    }

    public static void clearTerminal() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

}