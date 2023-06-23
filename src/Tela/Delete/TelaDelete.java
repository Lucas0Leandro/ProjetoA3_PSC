package Tela.Delete;

import java.util.Scanner;

public class TelaDelete {

    public void exibir() throws InterruptedException {
        int opc = menu();
        Scanner teclado = new Scanner(System.in);

        do{
            System.out.println("//--------------------//");
            System.out.println("       EXCLUSAO");
            System.out.println("Escolha uma das opcoes:");
            System.out.println("1 - Alunos");
            System.out.println("2 - Professor");
            System.out.println("3 - Cursos");
            System.out.println("4 - Turmas");
            System.out.println("5 - Salas");
            System.out.println("6 - Lista de espera");
            System.out.println("9 - Voltar");
            System.out.println("//--------------------//\n");

            opc = teclado.nextInt();

            switch (opc){
                case 1:
                    System.out.println("TESTE");
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 9:
                    clearTerminal();
                    return;
                default:
                    clearTerminal();
                    System.out.println("\nEsta opcao eh invalida, tente novamente!\n\n");
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

    public int menu() {
        return 0;
    }
}

