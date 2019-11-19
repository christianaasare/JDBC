package io.turntabl;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class JDBC {
    public static void main(String args[]){
        ApplicationContext ctx = new FileSystemXmlApplicationContext("beans.xml");

//        JdbcTemplate template = (JdbcTemplate)ctx.getBean("productsdao");
        ProductsDAO productsDAO =(ProductsDAO)ctx.getBean("productsdao");
//        int numRows =template.queryForObject("select count(0) from products", Integer.class);
//        System.out.println("there are" + numRows + "products");
        System.out.println();
    }
}
