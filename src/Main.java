import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
       int opc;
       Scanner teclado = new Scanner(System.in);

       do{
            System.out.println("//--------------------//");
            System.out.println("         MENU");
            System.out.println("Escolha uma das opcoes:");
            System.out.println("1 - Cadastros");
            System.out.println("2 - Consultas");
            System.out.println("0 - Sair\n");

            opc = teclado.nextInt();

            switch(opc){

                case 1:
                    break;
                case 2:
                    break;
                case 0:
                    System.out.println("\nPrograma Encerrado!\n");
                    break;
                default:
                    System.out.println("\nOpcao invalida!\n\n");    

            }

       }while(opc !=  0);

    }
}
