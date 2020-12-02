import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestConnexionJdbc {
    public static void main(String[] args) {
        String dbUrl = "jdbc:mariadb://localhost:3306/compta";
        String login = "root"; //ici ton login évidemment
        String pwd = "25896Nicolas";

        try {
            Connection connection = DriverManager.getConnection(dbUrl, login, pwd);
            System.out.println(connection);
        } catch (SQLException e ) {
            System.out.println(e.getMessage());
        }

    }
}