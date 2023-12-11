package com.kgisl.Spotify;


import java.sql.Connection;
import java.util.Date;
import java.util.Scanner;

import java.sql.CallableStatement;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;




public class Callable {
   static Scanner sc = new Scanner(System.in);
    private static Connection conn;
    static CallableStatement stmt;

    public static void select()throws Exception
    {
         conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Sangeetha?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC", "root", "");
        String strSelect;
        
        strSelect = "{CALL getfullin(?,?)}";
         stmt = conn.prepareCall(strSelect);
        int id = 2104;
        stmt.setInt(1, id);
        stmt.registerOutParameter(2,Types.INTEGER);
         stmt.executeQuery();
        int total = stmt.getInt(2);
          
           System.out.println("Total: " + total);
        // String you = sc.nextLine();
     
       
        System.out.println("The SQL statement is: " + strSelect + "\n");
        
       

        System.out.println("The records selected are:");
        int rowCount = 0;
       // System.out.println(registration_id + "," + event_name+ ","+athlete_name+ "," +registration_date);
        // while(rset.next()) {   
        //     String registration_id = rset.getString("registration_id");
        //     String event_name = rset.getString("event_name");
        //     String athlete_name = rset.getString("athlete_name");
        //     String registration_date = rset.getString("registration_date");
        //     System.out.println(registration_id + "," + event_name+ ","+athlete_name+ "," +registration_date);
            
        //     System.out.println(registration_id + "," + event_name+ ","+athlete_name+ "," +registration_date);
        //     ++rowCount;
        //  }
        //  System.out.println("Total number of records = " + rowCount);
         stmt.close();
         conn.close();
    }





    public static void delete()throws Exception
    {
        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Sangeetha?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC", "root", "");
        
        String sqlDelete = "{CALL getdel(6294)}"; 
        CallableStatement stmt = conn.prepareCall(sqlDelete);

         System.out.println("The SQL statement is: " + sqlDelete + "\n");  // Echo for debugging
         int countDeleted = stmt.executeUpdate();
         System.out.println(countDeleted + " records deleted.\n");

         int rowCount = 0;
    
     String strSelect = "select * from events";
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

    public static void update()throws Exception
    {
        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Sangeetha?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC", "root", "");
        
        String sqlUpdate = "{CALL getupdate(9005)}";
                
        CallableStatement stmt = conn.prepareCall(sqlUpdate);
        System.out.println("The SQL statement is: " + sqlUpdate + "\n"); 
        int countDeleted = stmt.executeUpdate();
         System.out.println(countDeleted + " records Updated.\n");
        stmt.close();
          conn.close();
    }


    public static void joins() throws Exception
    {
         conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Sangeetha?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC", "root", "");
         Statement stm = conn.createStatement();  
         String str2 ="select u.username,a.athlete_id from users u Inner join athletes a on u.user_id = a.user_id ";
         ResultSet retset = stm.executeQuery(str2);

         while (retset.next()) {
            String username = retset.getString("username");
            String athlete_id = retset.getString("athlete_id");
            System.out.println(username + "," + athlete_id);
        }
        stm.close();
        conn.close();
    }


    public static void joinstamil()throws Exception
    {
        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Sangeetha?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC", "root", "");
        Statement stm = conn.createStatement();  
         String str2 ="select er.registration_id,es.event_name,us.username AS athlete_name,er.registration_date FROM event_registrations er join events es ON er.event_id=es.event_id join athletes ath ON er.athlete_id=ath.athlete_id join users us ON ath.user_id=us.user_id";
         ResultSet retset = stm.executeQuery(str2);

         while (retset.next()) {
            String registration_id = retset.getString("registration_id");
            String event_name = retset.getString("event_name");
            String athlete_name = retset.getString("athlete_name");
            String registration_date = retset.getString("registration_date");
            System.out.println(registration_id + "," + event_name+ ","+athlete_name+ "," +registration_date);
        }
        stm.close();
        conn.close();
    }


    public static void multitable() throws Exception
    {
      conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Sangeetha?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC", "root", "");
             CallableStatement stm = conn.prepareCall("{CALL getall()}");  
             ResultSet result1 = stm.executeQuery();
             System.out.println("Contents of the first result1-set");
     
             while (result1.next()) {
                 String user_id = result1.getString("user_id");
                 String username = result1.getString("username");     
                 String password = result1.getString("password");    
                 String emai = result1.getString("emai");
                 String first_name = result1.getString("first_name");    
                 String last_name = result1.getString("last_name");     
                 String usertype = result1.getString("user_type");     
                 System.out.println(user_id + "," + username + "," + password + "," + emai + ","    
                         + first_name + "," + last_name + "," + usertype);

             }
                         stm.getMoreResults();
                         System.out.println("Contents of the second result1-set");          
                         ResultSet result2 = stm.getResultSet();

                         while (result2.next()) {
                          String enrollment_id = result2.getString("enrollment_id");             
                          String athlete_id = result2.getString("athlete_id");              
                          String program_id = result2.getString("program_id");             
                          String enrollment_date = result2.getString("enrollment_date");             
                          String payment_status = result2.getString("payment_status"); 
                          String attendance_status = result2.getString("attendance_status"); 
      
                          System.out.println(enrollment_id + "  " + athlete_id + "  " + program_id + "  " + enrollment_date + "  " + payment_status + " "+attendance_status);
                      }
                  
                  stm.close();
                  conn.close();
                  
              }
             
     




    
    
    
    public static void main(String[] args) throws Exception{
        
        //  conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Sangeetha?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC", "root", "");
      // stmt = conn.prepareStatement(strSelect);
              
      //insertrows();
           select();
           //insert();
           //delete();
        //update();
        //multiinsert();
        //joins();
       // joinstamil();
       multitable();

      } 

}
