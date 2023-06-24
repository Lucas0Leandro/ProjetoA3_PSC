package Tela.Cadastros;


import java.util.Scanner;
import DAO.DAO_Aluno;
import PessoaPack.Aluno;

public class TelaAlunos {
    String nome, sobrenome, CPF, fone, endereco, ra, cep;

    public void exibir() throws InterruptedException {

        Scanner teclado = new Scanner(System.in);

            System.out.println("//--------------------//");
            System.out.println("    CADASTRAR ALUNO");
            System.out.print("Nome: ");
            nome = teclado.nextLine();
            System.out.print("\nSobrenome: ");
            sobrenome = teclado.nextLine();
            System.out.print("\nCPF: ");
            CPF = teclado.nextLine();
            System.out.print("\nFone: ");
            fone = teclado.nextLine();
            System.out.print("\nEndereco: ");
            endereco = teclado.nextLine();
            System.out.print("\nCEP: ");
            cep = teclado.nextLine();
            System.out.print("\nRA: ");
            ra = teclado.nextLine();
            System.out.println("       CONCLUIDO");
            System.out.println("//--------------------//\n");
        
    }
/* 
    public static void main(String[] args){

        Aluno a = new Aluno();
    
        a.setRa(ra);
        a.setNome(nome);
        a.setSobrenome(sobrenome);
        a.setCPF(CPF);
        a.setFone(fone);
        a.setEndereço(endereco);
        a.setCep(cep);
        
        new DAO_Aluno().cadastrarAluno(a);

    }*/

    public static void clearTerminal() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

}
