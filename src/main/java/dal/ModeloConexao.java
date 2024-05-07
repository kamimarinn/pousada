
package dal;

import java.sql.*;

public class ModeloConexao {
    public static Connection conector() {
        java.sql.Connection conexao = null;
        //a linha abaixo chama o driver
        String driver = "com.mysql.cj.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3307/pousada";
        String user = "root";
        String password = "";
        //estabelecendo a conexão com o banco
        try {
            Class.forName(driver);
            conexao = DriverManager.getConnection(url, user, password);
            return conexao;
        } catch (Exception e) {
            return null;
        }
    }

}
