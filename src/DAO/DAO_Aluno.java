package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Conexao.ConexaoBD;
import PessoaPack.Aluno;

public class DAO_Aluno {

    public void cadastrarAluno(Aluno aluno){

        String sql = "INSERT INTO ALUNO (NOME, SOBRENOME, FONE, ENDERECO, CPF, CEP) VALUES(?, ?, ?, ?, ?, ?)";

        PreparedStatement ps = null;
        
            try {
                ps = ConexaoBD.getConexao().prepareStatement(sql);
                ps.setString(1, aluno.getNome());
                ps.setString(2, aluno.getSobrenome());
                ps.setString(3, aluno.getfone());
                ps.setString(4, aluno.getendereço());
                ps.setString(5, aluno.getCPF());
                ps.setLong(6, aluno.getcep());

                ps.execute();
                ps.close();
                
            } catch (SQLException e) {
                
                e.printStackTrace();
            }
    }
    
    public List<Aluno> listar() {
        List<Aluno> listarAlunos = new ArrayList<Aluno>();
        try {
            Connection connection = ConexaoBD.getConexao(); // Obtém a conexão corretamente

            String sql = "SELECT * FROM ALUNO";

            PreparedStatement statement = connection.prepareStatement(sql);

            ResultSet rs = statement.executeQuery();

            while (rs.next()) {
                Aluno aluno = new Aluno(0, sql, sql, sql, sql, sql, 0); // Certifique-se de atualizar os argumentos com os tipos corretos
                aluno.setRa(rs.getInt("RA"));
                aluno.setNome(rs.getString("Nome"));
                aluno.setSobrenome(rs.getString("Sobrenome"));
                aluno.setCPF(rs.getString("CPF"));
                aluno.setFone(rs.getString("Fone"));
                aluno.setEndereço(rs.getString("Endereco"));
                aluno.setCep(rs.getInt("CEP"));

                listarAlunos.add(aluno);
            }
            connection.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return listarAlunos;
    }

    public void atualizar(Aluno aluno){
        try {
            Connection conn = ConexaoBD.getConexao(); 
    
            String sql = "UPDATE ALUNO SET NOME = ?, SOBRENOME = ?, FONE = ?, ENDERECO = ?, CPF = ?, CEP = ? WHERE RA = ?";
    
            PreparedStatement ps = conn.prepareStatement(sql);
    
            ps.setString(1, aluno.getNome());
            ps.setString(2, aluno.getSobrenome());
            ps.setString(3, aluno.getfone());
            ps.setString(4, aluno.getendereço());
            ps.setString(5, aluno.getCPF());
            ps.setInt(6, aluno.getcep());
            ps.setInt(7, aluno.getRa());
    
            ps.execute();
            ps.close();
            
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void remover(int RA) {
        try {
            Connection conn = ConexaoBD.getInstance().getConnection();

            String sql = "DELETE FROM ALUNO WHERE RA = ?";

            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setInt(1, RA);

            ps.execute();
            ps.close();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}