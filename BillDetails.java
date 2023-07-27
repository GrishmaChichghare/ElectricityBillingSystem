package ElectricitySystem;

import javax.swing.*;

import net.proteanit.sql.DbUtils;

import java.awt.*;
import java.sql.ResultSet;

public class BillDetails extends JFrame 
{
    String meter;
    BillDetails(String meter)
    {
         this.meter=meter;
         setSize(700,650);
         setLocation(400,150);
         setLayout(null);
         getContentPane().setBackground(Color.WHITE);

         JTable table=new JTable();
         try
         {
              DataBase d=new DataBase();
              String query_bill="select * from bill where meter_no='"+meter+"'";
              ResultSet resultSet=d.statement.executeQuery(query_bill);
              table.setModel(DbUtils.resultSetToTableModel(resultSet));
         }
         catch(Exception E)
         {
             E.printStackTrace();
         }
         JScrollPane sp=new JScrollPane(table);
         sp.setBounds(0,0,700,650);
         add(sp);
         setVisible(true);
    }
    public static void main(String[] args) 
    {
          new BillDetails("");
    }
}
