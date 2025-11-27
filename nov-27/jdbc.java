import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class jdbc {
    public static void main(String[] args) {
        
        // 1. Database Credentials
        String url = "jdbc:mysql://localhost:3306/testdb"; 
        String username = "root"; // Default MySQL username
        String password = "root123"; // REPLACE with your actual password

        try {
            // 2. Load the Driver (Optional in newer Java versions, but good practice)
            Class.forName("com.mysql.cj.jdbc.Driver");

            // 3. Establish the Connection
            System.out.println("Connecting to database...");
            Connection connection = DriverManager.getConnection(url, username, password);
            System.out.println("Connection Successful!");

            // 4. Create a Statement Object to send queries
            Statement statement = connection.createStatement();

            // 5. Execute a Query
            String sql = "SELECT * FROM users";
            ResultSet resultSet = statement.executeQuery(sql);

            // 6. Process the Results
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String email = resultSet.getString("email");

                System.out.println("User ID: " + id + ", Name: " + name + ", Email: " + email);
            }

            // 7. Close the connection
            connection.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}