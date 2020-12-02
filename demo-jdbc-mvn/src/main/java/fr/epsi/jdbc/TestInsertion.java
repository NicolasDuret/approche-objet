package fr.epsi.jdbc;

import java.sql.*;
import java.util.ResourceBundle;

public class TestInsertion {

    public static void main(String[] args) {


        String dbUrl = "jdbc:mariadb://localhost:3306/compta";
        String login = "root"; //ici ton login évidemment
        String pwd = "25896Nicolas";

        try (Connection connection = DriverManager.getConnection(dbUrl, login, pwd)) {
            String insertQuery = "INSERT INTO FOURNISSEUR VALUES ('4','La Maison de la Peinture')";
            String selectQuery = "SELECT * FROM FOURNISSEUR";
            try (Statement st = connection.createStatement()) {
                int rs= st.executeUpdate(insertQuery);
                ResultSet select = st.executeQuery(selectQuery);
                while (select.next()) {
                    System.out.println(select.getString("NOM"));
                }
                st.close();
                connection.close();

            } catch (SQLException e ) {
                System.out.println(e.getMessage());
            }
        } catch (SQLException e ) {
            System.out.println(e.getMessage());
        }
    }
}
