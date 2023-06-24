package DAO;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import Conexao.conexao;
import EduPack.Cursos;


public class DAO_Cursos {

    public void cadastrarCurso(Cursos cursos){

        String sql = "INSERT INTO CURSOS (ID, NOME, CARGAHORARIA, DESCRIÇÃOSOBRE) VALUES(?, ?, ?, ?)";

        PreparedStatement ps = null;
        
            try {
                ps = conexao.getConexao().prepareStatement(sql);
                ps.setLong(1, cursos.getIdF());
                ps.setString(2, cursos.getNome());
                ps.setString(3, cursos.getCargaHoraria());
                ps.setString(4, cursos.getDescriçãoSobre());

                ps.execute();
                ps.close();
                
            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
        }

    }
    
}