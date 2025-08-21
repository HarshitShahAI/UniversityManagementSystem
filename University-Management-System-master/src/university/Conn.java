package university;



import java.sql.Connection;
import java.sql.DriverManager;


public class Conn {

    public static Connection cn = null;

    public static Connection Connect() {
        try {
            String url = "jdbc:mysql://localhost:3306/UMS";
            String user = "root";
            String password = "Hashah125@";

            // Establish the connection
            cn = DriverManager.getConnection(url, user, password);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return cn; // Return the connection object
    }
}

