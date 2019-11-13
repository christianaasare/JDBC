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
            String name = scanner.nextLine();
            DBConnection.searchCustomersByCustomerName(name);
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found: " + e);
        }

    }
}
