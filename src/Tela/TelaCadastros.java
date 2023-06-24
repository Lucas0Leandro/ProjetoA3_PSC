package Tela;

import javax.swing.text.AbstractDocument.BranchElement;

public class TelaCadastros {

    public static void clearTerminal() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public void exibir() {
        int opcao = exibiropcaocadastros();

            System.out.println("//--------------------//");
            System.out.println("       CADASTROS");
            System.out.println("Escolha uma das opcoes:");
            System.out.println("1 - Alunos");
            System.out.println("2 - Professor");
            System.out.println("3 - Cursos");
            System.out.println("4 - Turmas");
            System.out.println("0 - Voltar\n");

            /*switch (opcao){
                case 1:
                    break;
                case 2:
                    break;
                case 0:
                    Main menu = new Main();
                    menu.exibir();
                    break;
            }*/

    }

    public int exibiropcaocadastros() {
        return 0;
    }

}

    

