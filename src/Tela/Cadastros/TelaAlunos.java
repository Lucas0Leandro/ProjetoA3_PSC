package Tela.Cadastros;


import java.util.Scanner;
import DAO.DAO_Aluno;
import PessoaPack.Aluno;

public class TelaAlunos {

    public void exibir() throws InterruptedException {
        int opc;
        Scanner teclado = new Scanner(System.in);

        do{
            System.out.println("//--------------------//");
            System.out.println("    CADASTRAR ALUNO");
            System.out.println("//--------------------//\n");

            opc = teclado.nextInt();

            switch (opc){
                case 1:
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

    public static void main(String[] args){

        Aluno a = new Aluno();
    
        a.setRa(122131900);
        a.setNome("Lucas");
        a.setSobrenome("Franco");
        a.setCPF("101.200.888-23");
        a.setFone("(47) 2483-8452");
        a.setEndereço("Rua Irani | Apartament | Floresta");
        a.setCep(89550610);
        
        new DAO_Aluno().cadastrarAluno(a);

    }

    public static void clearTerminal() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

}
