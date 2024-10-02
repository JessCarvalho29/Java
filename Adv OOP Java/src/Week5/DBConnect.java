package Week5;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnect {

    private static final String URL = "jdbc:mysql://localhost:3306/JavaWeek5";

    private static final String USER = "root";

    private static final String PASS = "";

    public Connection connect() {

        try {

            return DriverManager.getConnection(URL, USER, PASS);

        } catch (SQLException e) {

            System.out.println(e.getMessage());
            throw new RuntimeException("Error connecting to the database", e);

        }

    }

}
