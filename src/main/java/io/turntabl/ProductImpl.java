package io.turntabl;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class ProductImpl {
    JdbcTemplate jdbcTemplate;

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public  void getProductName(){
        List<ProductsTO> prod = this.jdbcTemplate.query("select * from products", BeanPropertyRowMapper.newInstance(ProductsTO.class);
    }
}
