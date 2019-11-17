package io.turntabl;

import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        //JDBC connection object
//              try{
//                  DBConnection.DBConnection();
//              } catch (ClassNotFoundException e) {
//                  e.printStackTrace();
//              }


//        search a customer name and shows all the customers with similar names.
//                Scanner scanner = new Scanner(System.in);
//                try {
//                    System.out.println("Enter the name of the customer: ");
//                    String customerName = scanner.nextLine();
//                    DBConnection.searchCustomersByName(customerName);
//                } catch (ClassNotFoundException e) {
//                    System.out.println("Customer not found: " + e);
//                }

        //        get  products by customer name
//        ProductDAOImpl products = new ProductDAOImpl();
//        try {
//            for(ProductsTO productSold : products.getProductByCustomerName("Karin") ){
//                System.out.printf("%5s %20s",productSold.getProductName(), productSold.getUnitPrice());
//                System.out.println();
//            }
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        }


        //        get five popular products
        ProductDAOImpl allProducts = new ProductDAOImpl();
        try {
            for(ProductsTO productSold : allProducts.getFivePopularProducts() ){
                System.out.printf("%5s %20s",productSold.getProductName(), productSold.getUnitPrice());
                System.out.println();
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
//        requests a category name and shows all the categories with similar names.
                Scanner sn = new Scanner(System.in);
                try {
                    System.out.println("Enter the name of the category type: ");
                    String categoryName = sn.nextLine();
                    DBConnection.searchCategoryByName(categoryName);
                } catch (ClassNotFoundException e) {
                    System.out.println("Category not found: " + e);
                }
                //        requests a product name and shows all the categories with similar names.
                Scanner scanner1 = new Scanner(System.in);
                try {
                    System.out.println("Enter the product name: ");
                    String productName = scanner1.nextLine();
                    DBConnection.searchProductByName(productName);
                } catch (ClassNotFoundException e) {
                    System.out.println("Product not found: " + e);
                }

                //   requests an employee name and shows all the employees with similar names.
                Scanner scan = new Scanner(System.in);
                try {
                    System.out.println("Enter the employee name : ");
                    String employeeName = scan.nextLine();
                    DBConnection.searchEmployeeByName(employeeName);
                } catch (ClassNotFoundException e) {
                    System.out.println("Employee not found: " + e);
                }

            }
        }
