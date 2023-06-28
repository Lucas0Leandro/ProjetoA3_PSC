package Tela.Atualizar;

import java.util.List;
import java.util.Scanner;
import DAO.DAO_Turmas;
import EduPack.Turmas;

public class TelaTurmas {
    
    public void exibir() {
        String hora;
        int semestre, ano, id, professor, sala, curso, alunos;

        Scanner teclado = new Scanner(System.in);

        System.out.println("//--------------------//");
        System.out.println("   ATUALIZAR DADOS");
        System.out.print("ID da Turma: ");
        id = teclado.nextInt();
        teclado.nextLine();
        System.out.print("Semestre: ");
        semestre = teclado.nextInt();
        teclado.nextLine();
        System.out.print("Ano: ");
        ano = teclado.nextInt();
        teclado.nextLine();
        System.out.println("Curso: ");
        curso = teclado.nextInt();
        System.out.println("Professor: ");
        professor = teclado.nextInt();
        teclado.nextLine();
        System.out.println("Sala: ");
        sala = teclado.nextInt();
        teclado.nextLine();
        System.out.println("Alunos: ");
        alunos = teclado.nextInt();
        teclado.nextLine();
        System.out.println("Horario: ");
        hora = teclado.nextLine();
        

        Turmas turmas = new Turmas(0, 0, 0, 0, 0, 0, 0, hora);
        
        turmas.setSemestre(semestre);
        turmas.setAno(ano);
        turmas.setCurso(curso);
        turmas.setProfessor(professor);
        turmas.setSala(sala);
        turmas.setListaAlunos(alunos);
        turmas.setHora(hora);

        DAO_Turmas daoTurmas = new DAO_Turmas();

        daoTurmas.atualizar(turmas);

        System.out.println("\nAtualizado com sucesso!");

    }

}