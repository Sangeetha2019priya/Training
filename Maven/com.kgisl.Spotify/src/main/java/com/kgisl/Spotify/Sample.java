package com.kgisl.Spotify;

import java.sql.Connection;
import java.util.Date;
import java.util.Scanner;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;




public class Sample {
   static Scanner sc = new Scanner(System.in);
    private static Connection conn;
    static Statement stmt;

    public static void select()throws Exception
    {
         conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Sangeetha?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC", "root", "");
       
           stmt = conn.createStatement();
         String you = sc.nextLine();
         sc.close();
        String strSelect;
        strSelect = "select *from events";
        System.out.println("The SQL statement is: " + strSelect + "\n");
        
        ResultSet rset = stmt.executeQuery(strSelect);

        System.out.println("The records selected are:");
        int rowCount = 0;
        while(rset.next()) {   
            Integer event_id = rset.getInt("event_id"); 
            String event_name = rset.getString("event_name");
            Date event_date = rset.getDate("event_date");
            String location = rset.getString("location");
            String description = rset.getString("description");
            
            System.out.println(event_id + ", " + event_name + ", " + event_date+ "," + location+","+description);
            ++rowCount;
         }
         System.out.println("Total number of records = " + rowCount);
         stmt.close();
         conn.close();
    }


    public static void insert()throws Exception
    {

        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Sangeetha?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC", "root", "");
       
           stmt = conn.createStatement();
        String sqlInsert = "insert into events values (9099,'Athelete','2023-10-12','Coimbatore','A clash between two toughest teams')";
         System.out.println("The SQL statement is: " + sqlInsert + "\n");  // Echo for debugging
         int countInserted = stmt.executeUpdate(sqlInsert);
         System.out.println(countInserted + " records inserted.\n");
          int rowCount = 0;

            String strSelect;
            strSelect = "select * from events";
          ResultSet rset = stmt.executeQuery(strSelect);
          while(rset.next()) {   // Move the cursor to the next row
            System.out.println(rset.getInt("event_id") + ", "
                    +rset.getString("event_name") + ", "
                    + rset.getDate("event_date") + ", "
                    +rset.getString("location") + ", "
                    + rset.getString("description"));
                     ++rowCount;
         }
          System.out.println("Total number of records = " + rowCount);
          stmt.close();
          conn.close();
      } 
   
    public static void multirows()throws Exception
    {
        String sqlInsert = "insert into books values "
        + "(9201,'Adventure','2023-10-12','Coimbatore','A clash between two toughest teams')"
        + "(9202, 'GoneFishing 3','2023-10-12','Coimbatore','A clash between two toughest teams')";
  System.out.println("The SQL statement is: " + sqlInsert + "\n");  // Echo for debugging
  int countInserted = stmt.executeUpdate(sqlInsert);
  System.out.println(countInserted + " records inserted.\n");
    }

    public static void main(String[] args) throws Exception{
        
          conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Sangeetha?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC", "root", "");
       
           stmt = conn.createStatement();
           select();
           insert();


      } 
    }
    

