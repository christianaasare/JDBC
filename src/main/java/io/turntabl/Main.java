package io.turntabl;

public class Main {
    public static void main(String args[]){
//              try{
//                  DBConnection.DBConnection();
//              } catch (ClassNotFoundException e) {
//                  e.printStackTrace();
//              }
        ProductsDAO products= new ProductDAOImpl();
        try{
            for (ProductsTO productSold:products.getProductByCustomerName("Thomas Hardy")){
                System.out.printf(productSold.getProductName(),productSold.getUnitPrice());
                System.out.println();
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
