package io.turntabl;

import javax.xml.transform.Result;
import java.sql.*;

public class DBConnection {
    public static void DBConnection() throws ClassNotFoundException {
        Class.forName("org.postgresql.Driver");

        String url = "jdbc:postgresql:northwind";

        try (Connection db = DriverManager.getConnection(url,"christiana-asare","turntabl")){
            Statement s= db.createStatement();
            ResultSet resultSet = s.executeQuery("select* from customers ;");
            while (resultSet.next())

                System.out.println(resultSet.getString("contact_name"));

        } catch (SQLException e) {
            System.err.println("Connection err" + e) ;
//            e.printStackTrace();
        }
    }
}
