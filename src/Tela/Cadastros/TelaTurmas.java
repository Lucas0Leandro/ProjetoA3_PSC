package Tela.Cadastros;

import java.util.Scanner;
import DAO.DAO_Turmas;
import EduPack.Turmas;

public class TelaTurmas {
    
    public void exibir() throws InterruptedException {
        String curso, hora, alunos, professor, sala;
        int semestre, ano;

        Scanner teclado = new Scanner(System.in);

        System.out.println("//--------------------//");
        System.out.println("   CADASTRAR TURMAS"); 
        System.out.print("Semestre: ");
        semestre = teclado.nextInt();
        teclado.nextLine(); 
        System.out.print("\nAno: ");
        ano = teclado.nextInt();
        teclado.nextLine(); 
        System.out.print("\nCurso: ");
        curso = teclado.nextLine();
        System.out.print("\nHorario: ");
        hora = teclado.nextLine();
        System.out.print("\nAlunos: ");
        alunos = teclado.nextLine();
        System.out.print("\nProfessor: ");
        professor = teclado.nextLine();
        System.out.print("\nSala: ");
        sala = teclado.nextLine();
        System.out.println("       CONCLUIDO");
        System.out.println("//--------------------//\n");

        Turmas turmas = new Turmas(0, semestre, ano, curso, hora, alunos, professor, sala);
        
        turmas.setSemestre(semestre);
        turmas.setAno(ano);
        turmas.setCurso(curso);
        turmas.setHora(hora);
        turmas.setAlunos(alunos);
        turmas.setProfessor(professor);
        turmas.setSala(sala);
        
        DAO_Turmas daoTurmas = new DAO_Turmas();
        daoTurmas.cadastrarTurmas(turmas);

        clearTerminal();
    }

    public static void clearTerminal() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

}