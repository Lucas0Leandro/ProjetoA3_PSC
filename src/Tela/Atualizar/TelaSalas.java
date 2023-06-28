package Tela.Consultas;

import java.util.Scanner;
import DAO.DAO_Salas;
import EduPack.Salas;
import java.util.List;

public class TelaSalas {
    
    public void exibir() {
        String nome, sobrenome, CPF, fone, endereco;
        int ra, cep;

        Scanner teclado = new Scanner(System.in);

        System.out.println("//--------------------//");
        System.out.println("   ATUALIZAR DADOS");
        System.out.print("RA do Aluno: ");
        ra = teclado.nextInt();
        teclado.nextLine();
        System.out.print("\nNome: ");
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
        

        Aluno aluno = new Aluno(ra, nome, sobrenome, CPF, fone, endereco, cep);
        DAO_Aluno daoAluno = new DAO_Aluno();

        aluno.setRa(ra);
        aluno.setNome(nome);
        aluno.setSobrenome(sobrenome);
        aluno.setCPF(CPF);
        aluno.setFone(fone);
        aluno.setEndereço(endereco);
        aluno.setCep(cep);

        daoAluno.atualizar(aluno);

        System.out.println("\nAtualizado com sucesso!");

    }

}
