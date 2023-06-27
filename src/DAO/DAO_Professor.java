package DAO;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import Conexao.ConexaoBD;
import PessoaPack.Professor;

public class DAO_Professor {

    public void cadastrarProfessor(Professor professor){

        String sql = "INSERT INTO PROFESSOR (ID, NOME, SOBRENOME, CPF, FONE, ENDEREÇO, CEP) VALUES(?, ?, ?, ?, ?, ?, ?)";

        PreparedStatement ps = null;
        
            try {
                ps = ConexaoBD.getConexao().prepareStatement(sql);
                ps.setLong(1, professor.getId());
                ps.setString(2, professor.getNome());
                ps.setString(3, professor.getSobrenome());
                ps.setString(4, professor.getfone());
                ps.setString(5, professor.getendereço());
                ps.setString(6, professor.getCPF());
                ps.setLong(7, professor.getcep());

                ps.execute();
                ps.close();
                
            } catch (SQLException e) {
                
                e.printStackTrace();
        }

    }
    
}