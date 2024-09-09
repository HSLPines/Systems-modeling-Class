
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class VendaDAO {

    private Connection connection;
    private PreparedStatement preparedStatement;
    private ResultSet resultSet;
    private String sql;

    public void inserir(Venda venda){
        connection = new Conexao().conectar();
        sql = "INSERT INTO venda (vendedor, total) VALUES (?, ?)";

        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, venda.getVendedor());
            preparedStatement.setDouble(2, venda.getTotal());
            preparedStatement.execute();
            preparedStatement.close();
            connection.close();

        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
    
}
