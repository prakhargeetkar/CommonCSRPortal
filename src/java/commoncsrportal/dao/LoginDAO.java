package commoncsrportal.dao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import commoncsrportal.dbutil.DBConnection;
import commoncsrportal.dto.UserDTO;

public class LoginDAO {
      private static PreparedStatement ps;
      static
      {
          try
          {
             ps=DBConnection.getConnection().prepareStatement("Select * from users where email=? and password=?");   
          }
          catch(Exception ex)
          {
              System.out.println("Error in DB comm:"+ex);
          }
      }
      public static boolean validateUser(UserDTO user) throws SQLException
      {
       ps.setString(1,user.getEmail());
       ps.setString(2,user.getPassword());
       ResultSet rs=ps.executeQuery();
       return rs.next();
      }
}
