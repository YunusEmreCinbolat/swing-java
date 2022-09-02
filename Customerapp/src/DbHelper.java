
    import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbHelper {
   private final String kullaniciadi="root";
   private final String sifre="yunus2001";
   private final String vturl="jdbc:mysql://localhost/world";
   public Connection baglantiyap() throws SQLException {
       return DriverManager.getConnection(vturl,kullaniciadi,sifre);
   }
   public void hatagoster(SQLException e){
      System.out.println("Error message: "+e.getMessage());
      System.out.println("Error Code: "+e.getErrorCode());
   }
}

    

