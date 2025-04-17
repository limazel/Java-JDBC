import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
    static String userName = "root";
    static String password = "root";
    static String url = "jdbc:mysql://localhost:8886/";
    
    public static void main(String[] args) throws SQLException {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(url, userName, password);
            System.out.println("Connection established successfully.");
        } catch (SQLException exception) {
            System.out.println(exception.getMessage());
        } finally {
            connection.close();
        }
    }
}