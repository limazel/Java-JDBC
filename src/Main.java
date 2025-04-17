import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
  
    
    public static void main(String[] args) throws SQLException {
        Connection connection = null;
        DbHelper helper = new DbHelper();
        Statement statement = null;
        ResultSet resultSet = null;
        try {
            connection = helper.getConnection();
            statement = connection.createStatement();
            resultSet = statement.executeQuery("SELECT * FROM students");
            while(resultSet.next()) {
                System.out.println("Student ID: " + resultSet.getInt("id"));
                System.out.println("Student Name: " + resultSet.getString("name"));
                System.out.println("Student Age: " + resultSet.getInt("age"));
                System.out.println("------------------------------");
            }
        } catch (SQLException exception) {
            helper.showErrorMessage(exception);
        } catch (Exception exception) {
            System.out.println("An unexpected error occurred: " + exception.getMessage());
        } finally {
            connection.close(); 
        }
    }
}