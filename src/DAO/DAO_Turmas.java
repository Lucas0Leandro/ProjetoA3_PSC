package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Conexao.ConexaoBD;
import EduPack.Turmas;

public class DAO_Turmas {

    public void cadastrarTurmas(Turmas turmas){

        String sql = "INSERT INTO TURMAS (SEMESTRE, ANO, TIPO, HORA, ALUNOS, PROFESSOR, SALA) VALUES(?, ?, ?, ?, ?, ?, ?)";

        PreparedStatement ps = null;
        
            try {
                ps = ConexaoBD.getConexao().prepareStatement(sql);
                ps.setLong(1, turmas.getSemestre());
                ps.setLong(2, turmas.getAno());
                ps.setString(3, turmas.getCurso());
                ps.setString(4, turmas.getHora());
                ps.setString(5, turmas.getAlunos());
                ps.setString(6, turmas.getProfessor());
                ps.setString(7, turmas.getSala());


                ps.execute();
                ps.close();
                
            } catch (SQLException e) {
                e.printStackTrace();
        }

    }

    public List<Turmas> listar() {
        List<Turmas> listaTurmas = new ArrayList<Turmas>();
        try {
            Connection connection = ConexaoBD.getConexao(); // Obtém a conexão corretamente

            String sql = "SELECT * FROM TURMAS";

            PreparedStatement statement = connection.prepareStatement(sql);

            ResultSet rs = statement.executeQuery();

            while (rs.next()) {
                Turmas turmas = new Turmas(0, 0, 0, sql, sql, sql, sql, sql); // Certifique-se de atualizar os argumentos com os tipos corretos
                turmas.setId(rs.getInt("ID"));
                turmas.setSemestre(rs.getInt("Semestre"));
                turmas.setAno(rs.getInt("Ano"));
                turmas.setHora(rs.getString("Hora"));
                turmas.setCurso(rs.getString("Curso"));
                turmas.setProfessor(rs.getString("Professor"));
                turmas.setSala(rs.getString("Sala"));
                turmas.setAlunos(rs.getString("Alunos"));

                listaTurmas.add(turmas);
            }
            connection.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return listaTurmas;
    }

    public void atualizar(Turmas turmas){
        try {
            Connection conn = ConexaoBD.getConexao(); 
    
            String sql = "UPDATE ALUNO SET SEMESTRE = ?, ANO = ?, HORA = ?, CURSO = ?, ALUNOS = ?, PROFESSOR = ?, SALA = ?, WHERE ID = ?";
    
            PreparedStatement ps = conn.prepareStatement(sql);
    
            ps.setInt(1, turmas.getSemestre());
            ps.setInt(2, turmas.getAno());
            ps.setString(3, turmas.getHora());
            ps.setString(4, turmas.getCurso());
            ps.setString(5, turmas.getAlunos());
            ps.setString(6, turmas.getProfessor());
            ps.setString(7, turmas.getSala());
            ps.setInt(8, turmas.getId());

    
            ps.execute();
            ps.close();
            
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void remover(int ID) {
        try {
            Connection connection = ConexaoBD.getInstance().getConnection();

            String sql = "DELETE FROM TURMAS WHERE ID = ?";

            PreparedStatement statement = connection.prepareStatement(sql);

            statement.setInt(1, ID);

            statement.execute();
            statement.close();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}