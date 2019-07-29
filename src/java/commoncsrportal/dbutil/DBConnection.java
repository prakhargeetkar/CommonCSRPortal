package commoncsrportal.dbutil;
import java.sql.Connection;
import java.sql.DriverManager;
public class DBConnection {
        private static Connection conn;
        static
        {
            try
            {
                Class.forName("oracle.jdbc.OracleDriver");   
                System.out.println("Driver Successfully Loaded");
                conn=DriverManager.getConnection("jdbc:oracle:thin:@//LAPTOP-UMDL3MOA:1521/XE","csrportal","csr"); 
                System.out.println("Connection Opened");
                
            }
            catch(Exception ex)
            {
                System.out.println("Exception In Opening Connection In DBConnection"+ex);
            } 
        }
            public static Connection getConnection()
            {
                return conn;
            }
            public static void closeConnection()
            {
                try{
                    conn.close();
                }
                catch(Exception ex)
                {
                  System.out.println("Exception In Closing Connection In DBConnection"+ex);  
                }
            }
        }

