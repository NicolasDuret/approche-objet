package fr.epsi.jdbc;

import java.sql.*;
import java.util.ResourceBundle;

public class TestUpdate {

    public static void main(String[] args) {

        String dbUrl = "jdbc:mariadb://localhost:3306/compta";
        String login = "root"; //ici ton login évidemment
        String pwd = "25896Nicolas";

        try (Connection connection = DriverManager.getConnection(dbUrl, login, pwd)) {
            String updateQuery = "UPDATE FOURNISSEUR SET nom = REPLACE(nom, 'La Maison de la Peinture', 'La Maison des Peintures') WHERE id=4";
            try (Statement st = connection.createStatement()) {
                int rs=st.executeUpdate(updateQuery);
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
