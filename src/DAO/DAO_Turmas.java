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

    public void cadastrarTurmas(Turmas turmas) {
        String sql = "INSERT INTO TURMAS (SEMESTRE, ANO, CURSO, PROFESSOR, SALA, HORA) VALUES (?, ?, ?, ?, ?, ?)";
    
        PreparedStatement ps = null;
        ResultSet generatedKeys = null;
    
        try {
            ps = ConexaoBD.getConexao().prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
            ps.setLong(1, turmas.getSemestre());
            ps.setLong(2, turmas.getAno());
            ps.setLong(3, turmas.getCurso());
            ps.setLong(4, turmas.getProfessor());
            ps.setLong(5, turmas.getSala());
            ps.setString(6, turmas.getHora());
    
            ps.execute();
    
            // Obter as chaves geradas
            generatedKeys = ps.getGeneratedKeys();
            if (generatedKeys.next()) {
                int turmaId = generatedKeys.getInt(1);
    
                // Percorrer a lista de IDs dos alunos associados à turma
                for (Integer alunoId : turmas.getAlunos()) {
                    String sqlInsertTurmaAluno = "INSERT INTO MATRICULA (TURMA, ALUNOS) VALUES (?, ?)";
                    PreparedStatement psTurmaAluno = ConexaoBD.getConexao().prepareStatement(sqlInsertTurmaAluno);
                    psTurmaAluno.setInt(1, turmaId);
                    psTurmaAluno.setInt(2, alunoId);

                    psTurmaAluno.execute();
                    psTurmaAluno.close();
                }
            }
    
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // Fechar os recursos (PreparedStatement e ResultSet)
            try {
                if (generatedKeys != null) {
                    generatedKeys.close();
                }
                if (ps != null) {
                    ps.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public List<Turmas> listar() {
        List<Turmas> listaTurmas = new ArrayList<Turmas>();
        try {
            Connection connection = ConexaoBD.getConexao(); // Obtém a conexão corretamente

            String sql = "SELECT t.*, m.ALUNOS " +
                         "FROM TURMAS t " +
                         "LEFT JOIN MATRICULA m ON t.ID = m.TURMA";

            PreparedStatement statement = connection.prepareStatement(sql);

            ResultSet rs = statement.executeQuery();

            while (rs.next()) {
                Turmas turmas = new Turmas(0, 0, 0, 0, 0, 0, sql, null, 0); 
                turmas.setId(rs.getInt("ID"));
                turmas.setSemestre(rs.getInt("Semestre"));
                turmas.setAno(rs.getInt("Ano"));
                turmas.setCurso(rs.getInt("Curso"));
                turmas.setProfessor(rs.getInt("Professor"));
                turmas.setSala(rs.getInt("Sala"));
                turmas.setListaAlunos(rs.getInt("ALUNOS"));
                turmas.setHora(rs.getString("Hora"));

                listaTurmas.add(turmas);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return listaTurmas;
    }

    public void atualizar(Turmas turmas){
        try {
            Connection conn = ConexaoBD.getConexao(); 
    
            String sql = "UPDATE TURMAS SET SEMESTRE = ?, ANO = ?, CURSO = ?, PROFESSOR = ?, SALA = ?, HORA = ? WHERE ID = ?";
    
            PreparedStatement ps = conn.prepareStatement(sql);
    
            ps.setInt(1, turmas.getSemestre());
            ps.setInt(2, turmas.getAno());
            ps.setInt(3, turmas.getCurso());
            ps.setInt(4, turmas.getProfessor());
            ps.setInt(5, turmas.getSala());
            ps.setInt(6, turmas.getId());
            ps.setString(8, turmas.getHora());

    
            ps.execute();
            ps.close();
            
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void remover(int ID) {
        try {
            Connection conn = ConexaoBD.getConexao();

            String sql = "DELETE FROM TURMAS WHERE ID = ?";

            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setInt(1, ID);

            ps.execute();
            ps.close();
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public boolean verificarSala(int sala, String hora) {
        try {
            Connection conn = ConexaoBD.getConexao();

            String sql = "SELECT * FROM TURMAS WHERE SALA = ? AND HORA = ?";

            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, sala);
            ps.setString(2, hora);

            ResultSet rs = ps.executeQuery();

            return !rs.next(); // Retorna true se não houver resultado, ou seja, a sala está disponível

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean verificarProf(int professor, String hora) {
        try {
            Connection conn = ConexaoBD.getConexao();

            String sql = "SELECT * FROM TURMAS WHERE SALA = ? AND HORA = ?";

            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, professor);
            ps.setString(2, hora);

            ResultSet rs = ps.executeQuery();

            return !rs.next(); // Retorna true se não houver resultado, ou seja, a sala está disponível

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

}