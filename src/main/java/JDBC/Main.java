package JDBC;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");


        ProductDAOImpl productDAO = (ProductDAOImpl)ctx.getBean("productsdao");
        System.out.println(productDAO.getProductByCustomerName("Christina Berglund"));
        System.out.println();


        ProductDAOImpl popFive = (ProductDAOImpl)ctx.getBean("productsdao");
        System.out.println(popFive.getFivePopularProducts());
        System.out.println();
    }
        }
