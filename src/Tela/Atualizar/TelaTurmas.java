package Tela.Atualizar;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import DAO.DAO_Aluno;
import DAO.DAO_Turmas;
import EduPack.Turmas;
import PessoaPack.Aluno;

public class TelaTurmas {
    
    public void exibir() {
        String hora;
        int semestre, ano, ID, professor, sala, curso, alunos;

        

        Scanner teclado = new Scanner(System.in);

        DAO_Aluno daoAluno = new DAO_Aluno();

        List<Aluno> listaAluno = daoAluno.listar();

        System.out.println("//--------------------//");
        System.out.println("   ATUALIZAR DADOS");
        System.out.print("ID da Turma: ");
        ID = teclado.nextInt();
        teclado.nextLine();
        System.out.print("Semestre: ");
        semestre = teclado.nextInt();
        teclado.nextLine();
        System.out.print("Ano: ");
        ano = teclado.nextInt();
        teclado.nextLine();
        System.out.println("Curso: ");
        curso = teclado.nextInt();
        teclado.nextLine();
        System.out.println("Professor: ");
        professor = teclado.nextInt();
        teclado.nextLine();
        System.out.println("Sala: ");
        sala = teclado.nextInt();
        teclado.nextLine();
        System.out.println("Horario: ");
        hora = teclado.nextLine();
        System.out.println("Alunos: ");
        alunos = teclado.nextInt();
        

        String alunosSelecionados = teclado.nextLine();

        List<Integer> alunosIds = new ArrayList<>();
        String[] alunosIdsArray = alunosSelecionados.split(",");
        for (String id : alunosIdsArray) {
            alunosIds.add(Integer.parseInt(id.trim()));
    }

        Turmas turmas = new Turmas(0, 0, 0, 0, 0, 0, hora, alunosIds, alunosSelecionados);

        turmas.setSemestre(semestre);
        turmas.setAno(ano);
        turmas.setCurso(curso);
        turmas.setProfessor(professor);
        turmas.setSala(sala);
        turmas.setHora(hora);
        turmas.setAlunos(alunosIds);

        DAO_Turmas daoTurmas = new DAO_Turmas();

        // Verifica disponibilidade da sala
        if (!daoTurmas.verificarSala(sala, hora)) {
            System.out.println("\nErro: A sala ja esta alocada para outra turma no mesmo horario.");
            return; // Retorna sem adicionar a turma ao banco de dados
        }

        // Verifica disponibilidade do professor
        if (!daoTurmas.verificarProf(professor, hora)) {
            System.out.println("\nErro: O professor ja esta alocado para outra turma no mesmo horario.");
            return; // Retorna sem adicionar a turma ao banco de dados
        }

        daoTurmas.cadastrarTurmas(turmas);

        clearTerminal();
    }

    public static void clearTerminal() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

}