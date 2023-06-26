package DAO;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import Conexao.conexao;
import EduPack.Turmas;

public class DAO_Turmas {

    public void cadastrarTurmas(Turmas turmas){

        String sql = "INSERT INTO TURMA (ID, SEMESTRE, ANO, TIPO, HORA) VALUES(?, ?, ?, ?, ?)";

        PreparedStatement ps = null;
        
            try {
                ps = conexao.getConexao().prepareStatement(sql);
                ps.setLong(1, turmas.getID());
                ps.setLong(2, turmas.getSemestre());
                ps.setLong(3, turmas.getAno());
                ps.setString(4, turmas.getTipo());
                ps.setString(5, turmas.getHora());


                ps.execute();
                ps.close();
                
            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
        }

    }

}