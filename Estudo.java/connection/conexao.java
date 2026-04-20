package connection;

import java.sql.Connection;

public class conexao {
    url = "jdbc:mysql://localhost:3306/crud_java";
    username = "root";
    senha = "root";

    public Connection getConexao(){
        Connection conexao = null;

        try {
            conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/crud_java", "root", "root");
        } catch (SQLException e) {
            System.out.println("Erro ao conectar ao banco de dados: " + e.getMessage());
        }

        return conexao;

    }
}
