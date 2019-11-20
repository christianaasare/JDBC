package JDBC;

import org.springframework.jdbc.core.JdbcTemplate;

import java.sql.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SalesDAOImpl implements SalesDAO {
    JdbcTemplate jdbcTemplate;

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    @Override
    public List<SalesTO> salesReport(Date date) throws ClassNotFoundException {
        return null;
    }
//    List<SalesTO> sales = new ArrayList<>();
//    private String url = "jdbc:postgresql:northwind";
//
//    @Override
//    public List<SalesTO> salesReport(Date date) throws ClassNotFoundException {
//        Class.forName("org.postgresql.Driver");
//        try (Connection db = DriverManager.getConnection(url, "christiana-asare", "turntabl")) {
//            PreparedStatement ps = db.prepareStatement("select products.product_name,products.unit_price, customers.contact_name from products inner join order_details on products.product_id = order_details.product_id inner join orders on order_details.order_id = orders.order_id inner join customers on orders.customer_id = customers.customer_id where orders.order_date between ? and ?"
//            );
//
//            ps.clearParameters();
//
//
//            ResultSet rs = ps.executeQuery();
//            while (rs.next()) {
//                sales.add(new SalesTO(rs.getInt("unit_price"),rs.getDate("order_date"),rs.getString("product_name"),rs.getString("contact_name")));
//            }
//        } catch (SQLException e) {
//            System.err.println("Connection error " + e);
//        }
//        return sales;
    }
}