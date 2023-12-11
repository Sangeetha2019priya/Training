package com.kgisl.Spotify;


import java.sql.Connection;
import java.util.Date;
import java.util.Scanner;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;




public class PrepSample {
   static Scanner sc = new Scanner(System.in);
    private static Connection conn;
    static PreparedStatement stmt;

    public static void select()throws Exception
    {
         conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Sangeetha?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC", "root", "");
        String strSelect;
        strSelect = "select *from events";
           stmt = conn.prepareStatement(strSelect);
        // String you = sc.nextLine();
         sc.close();
       
        System.out.println("The SQL statement is: " + strSelect + "\n");
        
        ResultSet rset = stmt.executeQuery();

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



        public static void multiinsert()throws Exception
        {try{
               Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Sangeetha?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC", "root", "");
          String strInsertt;
            strInsertt = "INSERT INTO events values(?, ?, ?, ?, ?)";
                 
        //    stmt = conn.prepareStatement(strInsertt);

           PreparedStatement st = conn.prepareStatement(strInsertt);
        st.setInt(1,8633);
        st.setString(2, "smiley");
        st.setString(3, "2023-10-21");
        st.setString(4, "erode");
        st.setString(5, "two teams");
        st.addBatch();

        st.setInt(1, 8634);
        st.setString(2, "kgsmiley");
        st.setString(3, "2023-10-21");
        st.setString(4, "Namakkal");
        st.setString(5, "two teams");
        st.addBatch();

         System.out.println("The SQL statement is: " + strInsertt + "\n");  // Echo for debugging
         //int countInserted = st.executeUpdate();
         //System.out.println(countInserted + " records inserted.\n");
          //int rowCount = 0;

          
        int[] result = st.executeBatch();
        // System.out.println(result);
        select();

          stmt.close();
         conn.close();
        }
        catch (Exception e) {
            
            System.out.println(e.getMessage());
        }
        }
    

    public static void insertrows()throws SQLException
    {

         conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Sangeetha?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC", "root", "");
           String sqlInsert = "insert into events values(?,?,?,?,?)";
          stmt = conn.prepareStatement(sqlInsert);
          stmt.setInt(1, 6251);
          stmt.setString(2,"smiley");
          stmt.setString(3, "2023-10-22");
          stmt.setString(4, "erode");
          stmt.setString(5, "two teams");
       
  System.out.println("The SQL statement is: " + sqlInsert + "\n");  // Echo for debugging
  int countInserted = stmt.executeUpdate();

  System.out.println(countInserted + " records inserted.\n");
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


    public static void delete()throws Exception
    {
        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Sangeetha?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC", "root", "");
        
        String sqlDelete = "delete from events where event_name='smiley'"; 
        stmt = conn.prepareStatement(sqlDelete);

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
        
        String sqlUpdate = "update events SET location = 'Newyork' WHERE event_id = 9000";
                
        stmt = conn.prepareStatement(sqlUpdate);
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

    
    
    public static void main(String[] args) throws Exception{
        
        //  conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Sangeetha?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC", "root", "");
      // stmt = conn.prepareStatement(strSelect);
              
      //insertrows();
           select();
           //insert();
           //delete();
          // update();
        //multiinsert();
        //joins();
        joinstamil();

      } 

}
