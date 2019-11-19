package JDBC;

import java.sql.*;

public class DBConnection {
    //statements
    public static void DBConnection() throws ClassNotFoundException {
        Class.forName("org.postgresql.Driver");
        String url = "jdbc:postgresql:northwind";
        try (Connection db = DriverManager.getConnection(url, "christiana-asare", "turntabl")) {
            Statement s = db.createStatement();
            ResultSet rs = s.executeQuery("select * from customers;");
            System.out.println("---------------------------------------------------------------------------");
            System.out.printf("%5s %12s %12s %10s", "Customer_ID", "Contact_Name", "City", "Telephone");
            System.out.println();
            System.out.println("---------------------------------------------------------------------------");
            while (rs.next()) {
                System.out.format("%5s %12s %12s %10s", rs.getString("customer_id"), rs.getString("contact_name"), rs.getString("city"), rs.getString("phone"));
                System.out.println();
                System.out.println("---------------------------------------------------------------------------");
            }
        } catch (SQLException e) {
            System.err.println("Connection error " + e);
        }
    }


    public static void searchCustomersByName(String customerName) throws ClassNotFoundException {
        String url = "jdbc:postgresql:northwind";
        Class.forName("org.postgresql.Driver");
        try (Connection db = DriverManager.getConnection(url, "christiana-asare", "turntabl")) {
            Statement statement = db.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from customers where contact_name like '%" + customerName + "%';");
            System.out.println("---------------------------------------------------------------------------");
            System.out.printf("%5s %12s %12s %8s", "Customer_ID", "Contact_Name", "City", "Telephone");
            System.out.println();
            System.out.println("---------------------------------------------------------------------------");
            while (resultSet.next()) {
                System.out.format("%5s %17s %15s %10s", resultSet.getString("customer_id"), resultSet.getString("contact_name"), resultSet.getString("city"), resultSet.getString("phone"));
                System.out.println();
                System.out.println("---------------------------------------------------------------------------");
            }
        } catch (SQLException e) {
            System.err.println("Connection error " + e);
        }
    }

    //Prepared statements
    public static void searchCategoryByName(String categoryName) throws ClassNotFoundException {
        String url = "jdbc:postgresql:northwind";
        Class.forName("org.postgresql.Driver");
        try (Connection db = DriverManager.getConnection(url, "christiana-asare", "turntabl")) {
            PreparedStatement preparedStatement = db.prepareStatement("select * from categories where category_name like ?;");
            preparedStatement.clearParameters();
            preparedStatement.setString(1, "%" + categoryName + "%");

            ResultSet resultSet = preparedStatement.executeQuery();
            System.out.println("-------------------------------------------------------------");
            System.out.printf("%12s %12s", "Category_ID", "Category_Name", "DESCRIPTION");
            System.out.println();
            System.out.println("--------------------------------------------------------------");
            while (resultSet.next()) {
                System.out.format("%12s %1s", resultSet.getInt("category_id"), resultSet.getString("category_name"));
                System.out.println();
                System.out.println("---------------------------------------------------------------------------");
            }
        } catch (SQLException e) {
            System.err.println("Connection error " + e);
        }

    }

    public static void searchProductByName (String productName) throws ClassNotFoundException {
        String url = "jdbc:postgresql:northwind";
        Class.forName("org.postgresql.Driver");
        try (Connection db = DriverManager.getConnection(url, "christiana-asare", "turntabl")) {
            PreparedStatement preparedStatement = db.prepareStatement("select * from products where product_name like ?;");
            preparedStatement.clearParameters();
            preparedStatement.setString(1, "%" + productName + "%");

            ResultSet resultSet = preparedStatement.executeQuery();
            System.out.println("---------------------------------------------------------------------------");
            System.out.printf("%10s %18s", "Product_ID", "Product_Name");
            System.out.println();
            System.out.println("---------------------------------------------------------------------------");
            while (resultSet.next()) {
                System.out.format("%10s %18s", resultSet.getInt("product_id"), resultSet.getString("product_name"));
                System.out.println();
                System.out.println("---------------------------------------------------------------------------");
            }
        } catch (SQLException e) {
            System.err.println("Connection error " + e);
        }
    }
    public static void searchEmployeeByName (String employeeName) throws ClassNotFoundException {
        String url = "jdbc:postgresql:northwind";
        Class.forName("org.postgresql.Driver");
        try (Connection db = DriverManager.getConnection(url, "christiana-asare", "turntabl")) {
            PreparedStatement preparedStatement = db.prepareStatement("select * from employees where employee_name like ?;");
            preparedStatement.clearParameters();
            preparedStatement.setString(1, "%" + employeeName + "%");

            ResultSet resultSet = preparedStatement.executeQuery();
            System.out.println("---------------------------------------------------------------------------");
            System.out.printf("%15s %20s ", "Employee_ID", "Employee_Name");
            System.out.println();
            System.out.println("---------------------------------------------------------------------------");
            while (resultSet.next()) {
                System.out.format("%15s %20s", resultSet.getInt("employee_id"), resultSet.getString("employee_name"));
                System.out.println();
                System.out.println("---------------------------------------------------------------------------");
            }
        } catch (SQLException e) {
            System.err.println("Connection error " + e);
        }
    }
}
