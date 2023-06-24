package Tela;

import java.util.Scanner;
<<<<<<< Updated upstream

import Tela.Cadastros.TelaCadastros;
import Tela.Consultas.TelaConsulta;
import Tela.Delete.TelaDelete;

=======
>>>>>>> Stashed changes
import java.lang.Thread;

public class Main {
    public static void main(String[] args) throws InterruptedException {
<<<<<<< Updated upstream
        int opc;                                                            //variável que armazena opção escolhida 
        Scanner teclado = new Scanner(System.in);                           //Cria o objeto que lê o que entra no sistema

        do {

            System.out.println("//--------------------//");               //Mostra as opções do menu principal
=======
        int opc;
        Scanner teclado = new Scanner(System.in);

        do {

            System.out.println("//--------------------//");
>>>>>>> Stashed changes
            System.out.println("         MENU");
            System.out.println("Escolha uma das opcoes:");
            System.out.println("1 - Cadastros");
            System.out.println("2 - Consultas");
<<<<<<< Updated upstream
            System.out.println("3 - Exclusao");
            System.out.println("0 - Sair");
            System.out.println("//--------------------//\n");

            opc = teclado.nextInt();                                        //Diz que o que foi lido pelo objeto teclado vai ser armazenado em opc (opção)

            switch (opc) {                                                  //Switch com cases que dizem o que casa opção vai fazer
                case 1:                                                     
                    clearTerminal();                                        //Da clear no sistema            
                    TelaCadastros telacadastros = new TelaCadastros();          //Cria o objeto que chama a classe TelaCadastros     
                    telacadastros.exibir();                                     //Chama a classe TelaCadastros com o método exibir        
                    break;
                case 2:
                    clearTerminal();
                    TelaConsulta telaconsultas = new TelaConsulta();            //Cria o objeto que chama a classe TelaConsulta  
                    telaconsultas.exibir();                                     //Chama a classe TelaConsulta com o método exibir
                    break;
                case 3:
                    clearTerminal();
                    TelaDelete teladelete = new TelaDelete();                  //Cria o objeto que chama a classe TelaDelete  
                    teladelete.exibir();                                       //Chama a classe TelaDelete com o método exibir
                    break;
                case 0:                                                     //Encerra o laço, consequentemente o programa
                    clearTerminal();
                    System.out.println("//---------------------//");
                    System.out.println("\n   Programa Encerrado!\n");     
                    System.out.println("//---------------------//\n");
                    break;
                default:                                                    //Se nenhum dos casos acontecer, mostra a mensagem de inválido
                    clearTerminal();
                    System.out.println("\nEsta opcao e invalida, tente novamente!\n\n");
                    Thread.sleep(3000);                                     //Aguarda 3 segundos
                    clearTerminal();                                        //Da clear no sistema e volta a rodar o laço
                    break;              
            }

        } while (opc != 0);                                                 //Indica que o laço vai rodar enquanto a opção escolhida for diferente de zero

    }

    public static void clearTerminal() {                                    //Cria o método de dar clear no terminal
=======
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
>>>>>>> Stashed changes
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

<<<<<<< Updated upstream
}
=======
    public void exibir() {
    }

}
>>>>>>> Stashed changes
