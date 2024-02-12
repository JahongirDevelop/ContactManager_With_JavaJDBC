import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DataBaseUtil {
   public static void createTable() {
       String sql = "create table if not exists contact (" +
            "id serial primary key," +
            "name varchar(25) not null" +
            "surname varchar(25) not null" +
            "phone number varchar(12) unique" +
            ")";


        try {
            Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/contact_manager", "postgres", "1");
            Statement statement = connection.createStatement();
            statement.executeUpdate(sql);
            connection.close();;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
   }

}
