package practices;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcConnection {

    private static final String URL = "jdbc:mysql://localhost:3306/testdb";
    private static final String USER = "root";
    private static final String PASSWORD = "root";

    public static void main(String[] args) {

        try (Connection connection =
                     DriverManager.getConnection(URL, USER, PASSWORD)) {

            System.out.println("✅ Database connected successfully");

        } catch (SQLException e) {
        	System.out.println("❌ Database connection failed");
            e.printStackTrace();
        }
    }
}

