package com.kgisl.Spotify;
import java.sql.Connection;
import java.sql.CallableStatement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Arrays;

public class Stores {
    public static void select() throws Exception {
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Sangeetha?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC", "root", "");
        String strCall = "{CALL getfffullin()}";

        CallableStatement stmt = conn.prepareCall(strCall);
        int id = 2104;
        stmt.setInt(1, id);

        boolean hasResults = stmt.execute(); // Execute the stored procedure
        // int total = (int) rs;
        if (hasResults) {
            ResultSet rs = stmt.getResultSet();
            if (rs.next()) {
        int total = rs.getInt("@total");
        System.out.println("Total: " + total);
    }
        }
      // Check if there are any rows in the result set
      

    
        // System.out.println(total);

        stmt.close();
        conn.close();
    }

    public static void main(String[] args) throws Exception {
        select();
    }
}
