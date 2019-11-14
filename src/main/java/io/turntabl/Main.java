package io.turntabl;

import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        //JDBC connection object
//              try{
//                  DBConnection.DBConnection();
//              } catch (ClassNotFoundException e) {
//                  e.printStackTrace();
//              }


//        requests a customer name and shows all the customers with similar names.
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Enter the name of the customer: ");
            String customerName = scanner.nextLine();
            DBConnection.searchCustomersByCustomerName(customerName);
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found: " + e);
        }
//        requests a category name and shows all the categories with similar names.
        Scanner sn = new Scanner(System.in);
        try {
            System.out.println("Enter the name of the category type: ");
            String categoryName = sn.nextLine();
            DBConnection.searchCategoryByName(categoryName);
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found: " + e);
        }

        //   requests an employee name and shows all the employees with similar names.
        Scanner scan = new Scanner(System.in);
        try {
            System.out.println("Enter the name of the category type: ");
            String categoryName = scan.nextLine();
            DBConnection.searchCategoryByName(categoryName);
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found: " + e);
        }
    }
}
