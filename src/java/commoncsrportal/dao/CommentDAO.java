
package commoncsrportal.dao;

import commoncsrportal.dbutil.DBConnection;
import commoncsrportal.dto.CommentDTO;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CommentDAO {
     public static PreparedStatement ps1,ps2;
     static
     {
        try{ 
             ps1=DBConnection.getConnection().prepareStatement("insert into comments values(?,?,?)");  
         }
         catch(Exception ex)
         {
             System.out.println("Error in DB comm:"+ex);
         }
     }
     public static boolean registerComment(CommentDTO cm)throws SQLException
     {
         boolean done=false;
         ps1.setString(2,cm.getEmail());
         ps1.setString(1,cm.getUsername());
         ps1.setString(3,cm.getComment());
         int ans=ps1.executeUpdate();
         if(ans!=0)
             done=true;
         return done;
     }
}
