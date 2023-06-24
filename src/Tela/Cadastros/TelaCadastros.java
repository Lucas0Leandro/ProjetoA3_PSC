package Tela.Cadastros;

import java.util.Scanner;

public class TelaCadastros {

    public void exibir() throws InterruptedException {
        int opc;
        Scanner teclado = new Scanner(System.in);

        do{
            System.out.println("//--------------------//");
            System.out.println("       CADASTROS");
            System.out.println("Escolha uma das opcoes:");
            System.out.println("1 - Alunos");
            System.out.println("2 - Professor");
            System.out.println("3 - Cursos");
            System.out.println("4 - Turmas");
            System.out.println("5 - Salas");
            System.out.println("9 - Voltar");
            System.out.println("//--------------------//\n");

            opc = teclado.nextInt();

            switch (opc){
                case 1:
                    clearTerminal();
                    TelaAlunos telaalunos = new TelaAlunos();
                    telaalunos.exibir();
                    break;
                case 2:
                    clearTerminal();
                    TelaProfessor telaprofessor = new TelaProfessor();
                    telaprofessor.exibir();
                    break;
                case 3:
                    clearTerminal();
                    TelaCursos telacursos = new TelaCursos();
                    telacursos.exibir();
                    break;
                case 4:
                    clearTerminal();
                    TelaTurmas telaturmas = new TelaTurmas();
                    telaturmas.exibir();
                    break;
                case 5:
                    clearTerminal();
                    TelaSalas telasalas = new TelaSalas();
                    telasalas.exibir();
                    break;
                case 9:
                    clearTerminal();
                    return;
                default:
                    clearTerminal();
                    System.out.println("\nEsta opcao e invalida, tente novamente!\n\n");
                    Thread.sleep(3000);
                    clearTerminal();
                    break;
            }
        } while (opc != 0); 

    }

    public static void clearTerminal() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

}