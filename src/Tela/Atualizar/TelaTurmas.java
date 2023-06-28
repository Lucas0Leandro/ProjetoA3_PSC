package Tela.Atualizar;

import java.util.List;
import java.util.Scanner;

import com.mysql.cj.conf.HostInfo;

import DAO.DAO_Turmas;
import EduPack.Turmas;

public class TelaTurmas {
    
    public void exibir() {
        String curso, hora, alunos, professor, sala;
        int semestre, ano, id;

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
        System.out.println("Horario: ");
        hora = teclado.nextLine();
        System.out.println("Curso: ");
        curso = teclado.nextLine();
        System.out.println("Professor: ");
        professor = teclado.nextLine();
        System.out.println("Sala: ");
        sala = teclado.nextLine();
        System.out.println("Alunos: ");
        alunos = teclado.nextLine();
        

        Turmas turmas = new Turmas(0, semestre, ano, curso, hora, alunos, professor, sala);
        
        turmas.setSemestre(semestre);
        turmas.setAno(ano);
        turmas.setCurso(curso);
        turmas.setHora(hora);
        turmas.setAlunos(alunos);
        turmas.setProfessor(professor);
        turmas.setSala(sala);

        DAO_Turmas daoTurmas = new DAO_Turmas();

        daoTurmas.atualizar(turmas);

        System.out.println("\nAtualizado com sucesso!");

    }

}