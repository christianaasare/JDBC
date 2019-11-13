package io.turntabl;

import javax.xml.transform.Result;
import java.sql.*;

public class DBConnection {
    public static void DBConnection() throws ClassNotFoundException {
        Class.forName("org.postgresql.Driver");

        String url = "jdbc:postgresql:northwind";
        System.out.println("---------------------------------------------------------------------------------------------");
        System.out.printf("%5s %20s %15s %20s ", "Customer_ID", "Company_Name","Contact_Title", "City");
        System.out.println();
        System.out.println("---------------------------------------------------------------------------------------------");


        try (Connection db = DriverManager.getConnection(url,"christiana-asare","turntabl")){
            Statement s= db.createStatement();
            ResultSet resultSet = s.executeQuery("select * from customers;");
                System.out.printf("%5s %20s %15s %20s",resultSet.getString("customer_id"),resultSet.getString("company_name"),resultSet.getString("contact_title"), resultSet.getString("city"));
            while (resultSet.next())


            System.out.println("---------------------------------------------------------------------------------------------");
            System.out.println();
            System.out.println();
        } catch (SQLException e) {
            System.err.println("Connection err" + e) ;
//            e.printStackTrace();
        }
    }
}
