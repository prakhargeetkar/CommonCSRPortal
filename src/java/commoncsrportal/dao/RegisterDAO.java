
package commoncsrportal.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import commoncsrportal.dbutil.DBConnection;
import commoncsrportal.dto.UserDTO;

public class RegisterDAO {
    public static PreparedStatement ps1,ps2;
     static
     {
         try{
             ps1=DBConnection.getConnection().prepareStatement("select email from users where email=?");
             ps2=DBConnection.getConnection().prepareStatement("insert into users values(?,?,?,?)");
             
             
         }
         catch(Exception ex)
         {
             System.out.println("Error in DB comm:"+ex);
         }
     }
     public static boolean searchUser(String email)throws SQLException
     {
         ps1.setString(1,email);
         ResultSet rs=ps1.executeQuery();
         return rs.next();
     }
     public static boolean registerUser(UserDTO user)throws SQLException
     {
         boolean done=false;
         ps2.setString(1,user.getEmail());
         ps2.setString(2,user.getUsername());
         ps2.setString(3,user.getPassword());
         ps2.setString(4,user.getUsertype());
         int ans=ps2.executeUpdate();
         if(ans!=0)
             done=true;
         return done;
     }
}
