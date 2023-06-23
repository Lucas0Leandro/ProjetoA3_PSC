package DAO;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import Conexao.conexao;
import PessoaPack.Aluno;

public class DAO_Aluno {

    public void cadastrarAluno(Aluno aluno){

        String sql = "INSERTE INTO ALUNO (RA, NOME, FONE, ENDEREÇO, CPF, CEP) VALUES(?, ?, ?, ?, ?, ?)";

        PreparedStatement ps = null;
        
        try {
            ps = conexao.getConexao().prepareStatement(sql);
            ps.setLong(1, aluno.getRa());
            ps.setString(2, aluno.getNome());
            ps.setString(3, aluno.getfone());
            ps.setString(4, aluno.getendereço());
            ps.setString(5, aluno.getCPF());
            ps.setLong(6, aluno.getcep());

            ps.execute();
            ps.close();
            
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
    
}