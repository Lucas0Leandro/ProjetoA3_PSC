package Conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class conexao {

    private static conexao instance = null;
    private static String url = "jdbc:mysql://localhost:3306/escola";
    private static String user = "root";
    private static String password = "1234";
    private static Connection conn;

    private conexao {

    }
    
    public Connection getConexao(){

        try {
            if(conn == null){
                conn = DriverManager.getConnection(url, user, password);
                return conn;
            }else{
                return conn;
            }
            
        }   catch (SQLException e) {
            // TODO: handle exception
                e.printStackTrace();
                return null;
            }
    }
}
