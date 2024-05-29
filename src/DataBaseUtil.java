import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DataBaseUtil {
   public static void createTable() {
       String dbUrl = System.getenv("DB_URL");
       String dbUser = System.getenv("DB_USER");
       String dbPassword = System.getenv("DB_PASSWORD");

       String sql = "create table if not exists contact (" +
            "id serial primary key," +
            "name varchar(25) not null" +
            "surname varchar(25) not null" +
            "phone number varchar(12) unique" +
            ")";

        try {
            Connection connection = DriverManager.getConnection(dbUrl, dbUser, dbPassword);
            Statement statement = connection.createStatement();
            statement.executeUpdate(sql);
            connection.close();;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
   }

}
