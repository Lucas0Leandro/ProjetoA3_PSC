package Tela.Cadastros;

import java.util.Scanner;
import DAO.DAO_Aluno;
import PessoaPack.Aluno;

public class TelaAlunos {
    
    public void exibir() throws InterruptedException {
        String nome, sobrenome, CPF, fone, endereco;
        int cep;

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
        cep = teclado.nextInt();
        System.out.println("       CONCLUIDO");
        System.out.println("//--------------------//\n");

        Aluno aluno = new Aluno(0, nome, sobrenome, CPF, fone, endereco, cep);
        aluno.setNome(nome);
        aluno.setSobrenome(sobrenome);
        aluno.setCPF(CPF);
        aluno.setFone(fone);
        aluno.setEndereço(endereco);
        aluno.setCep(cep);

        DAO_Aluno daoAluno = new DAO_Aluno();
        daoAluno.cadastrarAluno(aluno);

        clearTerminal();
    }

    public static void clearTerminal() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

}
