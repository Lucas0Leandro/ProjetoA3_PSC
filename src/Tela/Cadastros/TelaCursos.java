package Tela.Cadastros;

import java.util.Scanner;
import DAO.DAO_Cursos;
import EduPack.Cursos;

public class TelaCursos {
    
    public void exibir() throws InterruptedException {
        String nome, desc;
        int id, carga;

        Scanner teclado = new Scanner(System.in);

        System.out.println("//--------------------//");
        System.out.println("  CADASTRAR CURSOS");
        System.out.print("Nome: ");
        nome = teclado.nextLine();
        System.out.print("\nCarga Horaria: ");
        carga = teclado.nextInt();
        System.out.print("\nDescricao: ");
        desc = teclado.nextLine();
        System.out.print("\nID: ");
        id = teclado.nextInt();
        System.out.println("       CONCLUIDO");
        System.out.println("//--------------------//\n");

        Cursos Cursos = new Cursos();
        Cursos.setId(id);
        Cursos.setNome(nome);
        Cursos.setDescriçãoSobre(desc);
        Cursos.setCargaHoraria(carga);
        
        DAO_Cursos daoCursos = new DAO_Cursos();
        daoCursos.cadastrarCursos(Cursos);

        clearTerminal();
    }

    public static void clearTerminal() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

}
