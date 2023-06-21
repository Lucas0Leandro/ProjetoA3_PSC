package Tela;

import java.util.Scanner;
import java.lang.Thread;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        int opc;
        Scanner teclado = new Scanner(System.in);

        do {

            System.out.println("//--------------------//");
            System.out.println("         MENU");
            System.out.println("Escolha uma das opcoes:");
            System.out.println("1 - Cadastros");
            System.out.println("2 - Consultas");
            System.out.println("0 - Sair\n");

            opc = teclado.nextInt();

            switch (opc) {
                case 1:
                    clearTerminal();
                    TelaCadastros cadastros = new TelaCadastros();
                    cadastros.exibir();
                    break;
                case 2:
                    break;
                case 0:
                    clearTerminal();
                    System.out.println("//---------------------//");
                    System.out.println("\n   Programa Encerrado!\n");
                    System.out.println("//---------------------//\n");
                    break;
                default:
                    clearTerminal();
                    System.out.println("\nEsta opcao eh invalida, tente novamente!\n\n");
                    Thread.sleep(3000);
                    clearTerminal();
                    break;
            }

        } while (opc == 0);

    }

    public static void clearTerminal() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public void exibir() {
    }

}