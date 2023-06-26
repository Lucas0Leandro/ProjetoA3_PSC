package DAO;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import Conexao.conexao;
import EduPack.Salas;;

public class DAO_Salas {

    public void cadastrarSala(Salas salas){

        String sql = "INSERT INTO SALAS (ID, LOCAL, CAPACIDADE) VALUES(?, ?, ?)";

        PreparedStatement ps = null;
        
            try {
                ps = conexao.getConexao().prepareStatement(sql);
                ps.setLong(1, salas.getID());
                ps.setString(2, salas.getLocal());
                ps.setLong(3, salas.getCapacidade());

                ps.execute();
                ps.close();
                
            } catch (SQLException e) {

                e.printStackTrace();
        }

    }
    
}