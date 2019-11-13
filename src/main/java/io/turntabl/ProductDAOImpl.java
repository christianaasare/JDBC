package io.turntabl;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProductDAOImpl implements ProductsDAO {
    private String url = "jdbc:postgresql:northwind";
    private List<ProductsTO> productSold=new ArrayList<>();
    @Override
    public List<ProductsTO> getProductByCustomerName(String customerName) throws ClassNotFoundException {
        Class.forName("org.postgresql.Driver");
        try (Connection db = DriverManager.getConnection(url,"christiana-asare","turntabl")){
            PreparedStatement preparedStatement=db.prepareStatement("Select products.product_name,products.unit_price from products inner join order_details on order_details.product_id = products.product_id inner join orders on order_details.order_id = orders.order_id inner join customers on orders.customer_id = customers.customer_id where customers.contact_name = ?") ;
           preparedStatement.clearParameters();
           preparedStatement.setString(1,customerName);
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next())
                productSold.add(new ProductsTO(resultSet.getString("product_name"),resultSet.getString("unit_price")));
        } catch (SQLException e) {
            System.err.println("Connection err" + e) ;
//            e.printStackTrace();

        }
        return productSold;

    }
}
