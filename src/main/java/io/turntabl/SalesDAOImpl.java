package io.turntabl;

import java.sql.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SalesDAOImpl implements SalesDAO {
    List<SalesTO> sales = new ArrayList<>();
    private String url = "jdbc:postgresql:northwind";

    @Override
    public List<SalesTO> salesReport(Date date) throws ClassNotFoundException {
        Class.forName("org.postgresql.Driver");
        try (Connection db = DriverManager.getConnection(url, "christiana-asare", "turntabl")) {
            PreparedStatement ps = db.prepareStatement("select order_date , customers.contact_name," );

            ps.clearParameters();


            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                sales.add(new SalesTO(rs.getInt("unit_price"),rs.getDate("dates"),rs.getString("product_name"),rs.getString("contact_name")));
            }
        } catch (SQLException e) {
            System.err.println("Connection error " + e);
        }
        return sales;
    }
}