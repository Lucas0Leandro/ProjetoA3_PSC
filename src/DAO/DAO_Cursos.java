package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Conexao.ConexaoBD;
import EduPack.Cursos;


public class DAO_Cursos {

    public void cadastrarCursos(Cursos cursos){

        String sql = "INSERT INTO CURSOS (ID, NOME, CARGAHORARIA, DESCRIÇÃOSOBRE) VALUES(?, ?, ?, ?)";

        PreparedStatement ps = null;
        
            try {
                ps = ConexaoBD.getConexao().prepareStatement(sql);
                ps.setLong(1, cursos.getId());
                ps.setString(2, cursos.getNome());
                ps.setLong(3, cursos.getCargaHoraria());
                ps.setString(4, cursos.getDescriçãoSobre());

                ps.execute();
                ps.close();
                
            } catch (SQLException e) {
                
                e.printStackTrace();
        }

    }
    public List<Cursos> listar() {
        List<Cursos> listaCursos = new ArrayList<Cursos>();
        try {
            Connection connection = ConexaoBD.getConexao(); // Obtém a conexão corretamente

            String sql = "SELECT * FROM CURSOS";

            PreparedStatement statement = connection.prepareStatement(sql);

            ResultSet rs = statement.executeQuery();

            while (rs.next()) {
                Cursos cursos = new Cursos(0, sql, 0, sql); // Certifique-se de atualizar os argumentos com os tipos corretos
                cursos.setId(rs.getInt("ID"));
                cursos.setNome(rs.getString("Nome"));
                cursos.setCargaHoraria(rs.getInt("CargaHoraria"));
                cursos.setDescriçãoSobre(rs.getString("descricao"));


                listaCursos.add(cursos);
            }
            connection.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return listaCursos;
    }
    
}