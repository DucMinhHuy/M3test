package m3test.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionCMS {
    public static Connection getConnection() {
        String jdbcURL = "jdbc:mysql://localhost:3306/testM3";
        String jdbcUsername = "root";
        String jdbcPassword = "Ducminhhuy";
        Connection connection = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);
            System.out.println("Connection successfully");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Connection don't successfully");
        }
        return connection;
    }

}
