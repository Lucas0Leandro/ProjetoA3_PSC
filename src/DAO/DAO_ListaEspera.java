package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Conexao.ConexaoBD;
import EduPack.ListaEspera;

public class DAO_ListaEspera {

    public void cadastrarListaEspera(ListaEspera listaEspera){

        String sql = "INSERT INTO LISTAESPERA (ID, ALUNOS, MATRICULA, TURMAS) VALUES(?, ?, ?, ?,)";

        PreparedStatement ps = null;
        
            try {
                ps = ConexaoBD.getConexao().prepareStatement(sql);
                ps.setLong(1, listaEspera.getID());
                ps.setString(2, listaEspera.getAlunos());
                ps.setString(3, listaEspera.getMatricula());
                ps.setString(4, listaEspera.getTurmas());

                ps.execute();
                ps.close();
                
            } catch (SQLException e) {
                
                e.printStackTrace();
            }
    }
    
    public List<ListaEspera> listar() {
        List<ListaEspera> listaEsperas = new ArrayList<ListaEspera>();
        try {
            Connection connection = ConexaoBD.getConexao(); // Obtém a conexão corretamente

            String sql = "SELECT * FROM LISTAESPERA";

            PreparedStatement statement = connection.prepareStatement(sql);

            ResultSet rs = statement.executeQuery();

            while (rs.next()) {
                ListaEspera listaEspera = new ListaEspera(0, sql, sql, sql); // Certifique-se de atualizar os argumentos com os tipos corretos
                listaEspera.setID(rs.getInt("ID"));
                listaEspera.setAlunos(rs.getString("Alunos"));
                listaEspera.setMatricula(rs.getString("Matricula"));
                listaEspera.setTurmas(rs.getString("Turmas"));

                listaEsperas.add(listaEspera);
            }
            connection.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return listaEsperas;
    }

    public void remover(int ID) {
        try {
            Connection connection = ConexaoBD.getInstance().getConnection();

            String sql = "DELETE FROM LISTAESPERA WHERE ID = ?";

            PreparedStatement statement = connection.prepareStatement(sql);

            statement.setInt(1, ID);

            statement.execute();
            statement.close();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}