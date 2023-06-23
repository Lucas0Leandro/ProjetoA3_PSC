package Tela.Cadastros;

import DAO.DAO_Aluno;
import PessoaPack.Aluno;

public class TelaAlunos {

    public static void main(String[] args) {

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

    public void exibir() {
    }
}
