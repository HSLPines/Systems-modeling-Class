
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
    
    private Connection connection;
    private String USER = "root";
    private String PASSWORD = "root";

    private final String URL = "jdbc:mysql://localhost:3306"
                        + "/modelagem?user=" + USER
                        + "&password=" + PASSWORD;

    public Connection conectar() {

        try {
            connection = DriverManager.getConnection(URL);
        } catch (SQLException e) {
            System.out.println("erro ao conectar no banco de dados\n" + e);
        }
        return connection;
    }

}
