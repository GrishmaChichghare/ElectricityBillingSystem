package ElectricitySystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DataBase
{
    Connection connection;
    Statement statement;
     public DataBase()
     {
         try
         {
             connection = DriverManager.getConnection( "jdbc:mysql://localhost:3306/Bill_System", "root", "110901");
             statement=connection.createStatement();
         }
         catch(Exception e)
         {
             e.printStackTrace();
         }
     }
}
