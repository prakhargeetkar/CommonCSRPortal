
package commoncsrportal.dao;
import commoncsrportal.dbutil.DBConnection;
import commoncsrportal.dto.EventDTO;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class EventsDAO {
      private static Statement st;
      private static PreparedStatement ps2;
      static
      {
          try
          {
            st=DBConnection.getConnection().createStatement();
            ps2=DBConnection.getConnection().prepareStatement("insert into events values(seq_event.nextval,?,?,?,?,?,?,?)"); 
          }
          catch(Exception ex)
          {
              System.out.println("Error in DB comm:"+ex);
          }
      }
    public static List<EventDTO> getUpcomingEvents() throws SQLException
    {
        ArrayList<EventDTO> eventList=new ArrayList<EventDTO>();
        ResultSet rs=st.executeQuery("select eventid,eventname,eventdate,eventtime,description,image,location,users.email,username,usertype from events,users where events.email=users.email order by eventdate");
        EventDTO obj=null;
        System.out.println("command executed successfully");
        while(rs.next())
        {
            System.out.println(rs.getString(2));
            obj=new EventDTO();
            obj.setEventid(rs.getInt(1));
            obj.setEventname(rs.getString(2));
            obj.setDate(rs.getDate(3));
            obj.setTime(rs.getString(4));
            obj.setDesc(rs.getString(5));
            obj.setImage(rs.getString(6));
            obj.setLocation(rs.getString(7));
            obj.setEmail(rs.getString(8));
            obj.setUsername(rs.getString(9));
            obj.setUsertype(rs.getString(10));
            eventList.add(obj);
        }
        System.out.println("List is of "+eventList.size()+" events");
        return eventList;
    }
    public static boolean registerEvent(EventDTO obj) throws SQLException
    {
      ps2.setString(1,obj.getEventname());
      ps2.setDate(2,obj.getDate());
      ps2.setString(3,obj.getTime());
      ps2.setString(4,obj.getDesc());
      ps2.setString(5,obj.getImage());
      ps2.setString(6,obj.getLocation());
      ps2.setString(7,obj.getEmail());
      int ans=ps2.executeUpdate();
      return ans>0;
    }
}
