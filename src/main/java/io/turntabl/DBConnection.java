package io.turntabl;

import javax.xml.transform.Result;
import java.sql.*;

public class DBConnection {
    public static void DBConnection() throws ClassNotFoundException {
        Class.forName("org.postgresql.Driver");
        String url = "jdbc:postgresql:northwind";
        try(Connection db = DriverManager.getConnection(url,"christiana-asare","turntabl")) {
            Statement s = db.createStatement();
            ResultSet rs = s.executeQuery("select * from customers;");
            System.out.println("---------------------------------------------------------------------------");
            System.out.printf("%5s %12s %12s %8s", "Customer_ID", "Contact_Name",  "City", "Telephone");
            System.out.println();
            System.out.println("---------------------------------------------------------------------------");
            while(rs.next()){
                System.out.format("%5s %17s %15s %10s", rs.getString("customer_id"), rs.getString("contact_name"), rs.getString("city"), rs.getString("phone"));
                System.out.println();
            }
        } catch (SQLException e) {
            System.err.println("Connection error "+e);
        }
    }


    public static void searchCustomersByCustomerName(String customerName) throws ClassNotFoundException {
        String url = "jdbc:postgresql:northwind";
        Class.forName("org.postgresql.Driver");
        try(Connection db = DriverManager.getConnection(url,"christiana-asare","turntabl")) {
            Statement statement = db.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from customers where contact_name like '%"+customerName+"%';");
            System.out.println("---------------------------------------------------------------------------");
            System.out.printf("%5s %12s %12s %8s", "Customer_ID", "Contact_Name",  "City", "Telephone");
            System.out.println();
            System.out.println("---------------------------------------------------------------------------");
            while(resultSet.next()){
                System.out.format("%5s %17s %15s %10s", resultSet.getString("customer_id"), resultSet.getString("contact_name"), resultSet.getString("city"), resultSet.getString("phone"));
                System.out.println();
            }
        } catch (SQLException e) {
            System.err.println("Connection error "+e);
        }
}}
