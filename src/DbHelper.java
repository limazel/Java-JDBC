import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbHelper {
  private  static String userName = "root";
  private  static String password = "root";
  private  static String url = "jdbc:mysql://localhost:8886/";

  public Connection getConnection() throws SQLException {
    return DriverManager.getConnection(url, userName, password);
  }

  public void showErrorMessage(SQLException exception) {
    System.out.println("Error : " + exception.getMessage());
    System.out.println("Error Code : " + exception.getErrorCode());
  }
}
