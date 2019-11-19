package JDBC;


import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class ProductDAOImpl {
    JdbcTemplate jdbcTemplate;

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<ProductsTO>  getProductByCustomerName(String name){
        List<ProductsTO> prod = this.jdbcTemplate.query( "select products.product_name,products.unit_price from products inner join order_details on products.product_id = order_details.product_id inner join orders on order_details.order_id = orders.order_id inner join customers on orders.customer_id = customers.customer_id where customers.contact_name like ?",
                new Object[]{name},
                BeanPropertyRowMapper.newInstance(ProductsTO.class)
        );
            return prod;
    }
    public List<ProductsTO>  getFivePopularProducts(){
        List<ProductsTO> popFive = this.jdbcTemplate.query("select count(order_details.product_id) as count, products.product_name from products inner join order_details on products.product_id = order_details.product_id group by products.product_name order by count desc limit 5", BeanPropertyRowMapper.newInstance(ProductsTO.class));
        return popFive;
    }
}