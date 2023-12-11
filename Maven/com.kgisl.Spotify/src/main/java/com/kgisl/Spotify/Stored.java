package com.kgisl.Spotify;
import java.sql.Connection;
import java.sql.CallableStatement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Types;

public class Stored {
    public static void select() throws Exception {
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Sangeetha?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC", "root", "");
        String strCall = "{CALL stores(?,?)}";

        CallableStatement stmt = conn.prepareCall(strCall);
        int id = 9300;
        stmt.setInt(1, id);
        stmt.registerOutParameter(2, Types.INTEGER);
        stmt.execute(); 
        int total = stmt.getInt(2);// Execute the stored procedure

        System.out.println(total);
        stmt.close();
        conn.close();
    }

    public static void main(String[] args) throws Exception {
        select();
    }
}
