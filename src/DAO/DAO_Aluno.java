package DAO;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import Conexao.ConexaoBD;
import PessoaPack.Aluno;

public class DAO_Aluno {

    public void cadastrarAluno(Aluno aluno){

        String sql = "INSERT INTO ALUNO (RA, NOME, SOBRENOME, FONE, ENDEREÇO, CPF, CEP) VALUES(?, ?, ?, ?, ?, ?, ?)";

        PreparedStatement ps = null;
        
            try {
                ps = ConexaoBD.getConexao().prepareStatement(sql);
                ps.setLong(1, aluno.getRa());
                ps.setString(2, aluno.getNome());
                ps.setString(3, aluno.getSobrenome());
                ps.setString(4, aluno.getfone());
                ps.setString(5, aluno.getendereço());
                ps.setString(6, aluno.getCPF());
                ps.setLong(7, aluno.getcep());

                ps.execute();
                ps.close();
                
            } catch (SQLException e) {
                
                e.printStackTrace();
            }

    }

    
}