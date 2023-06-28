package Tela.Atualizar;

import java.util.List;
import java.util.Scanner;

import com.mysql.cj.conf.HostInfo;

import DAO.DAO_Turmas;
import EduPack.Turmas;

public class TelaTurmas {
    
    public void exibir() {
        String hora, tipo;
        int id, semestre, ano;

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
        System.out.println("Tipo: ");
        tipo = teclado.nextLine();
        

        Turmas turmas = new Turmas(id, semestre, ano, hora, tipo);
        DAO_Turmas daoTurmas = new DAO_Turmas();

        turmas.setID(id);
        turmas.setSemestre(semestre);
        turmas.setAno(ano);
        turmas.setHora(hora);
        turmas.setTipo(tipo);

        daoTurmas.atualizar(turmas);

        System.out.println("\nAtualizado com sucesso!");

    }

}