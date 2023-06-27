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

        String sql = "INSERT INTO TURMAS (ID, SEMESTRE, ANO, TIPO, HORA) VALUES(?, ?, ?, ?, ?)";

        PreparedStatement ps = null;
        
            try {
                ps = ConexaoBD.getConexao().prepareStatement(sql);
                ps.setLong(1, turmas.getID());
                ps.setLong(2, turmas.getSemestre());
                ps.setLong(3, turmas.getAno());
                ps.setString(4, turmas.getTipo());
                ps.setString(5, turmas.getHora());


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
                Turmas turmas = new Turmas(0, 0, 0, sql, sql); // Certifique-se de atualizar os argumentos com os tipos corretos
                turmas.setID(rs.getInt("ID"));
                turmas.setSemestre(rs.getInt("Semestre"));
                turmas.setAno(rs.getInt("Ano"));
                turmas.setHora(rs.getString("Hora"));
                turmas.setTipo(rs.getString("Tipo"));

                listaTurmas.add(turmas);
            }
            connection.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return listaTurmas;
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