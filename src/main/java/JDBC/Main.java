package JDBC;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        ApplicationContext ctx = new FileSystemXmlApplicationContext("beans.xml");


        ProductDAOImpl productDAO = (ProductDAOImpl)ctx.getBean("productsdao");
        System.out.println(productDAO.getProductByCustomerName("Karin"));
        System.out.println();


        ProductDAOImpl popFive = (ProductDAOImpl)ctx.getBean("productsdao");
        System.out.println(popFive.getFivePopularProducts());
        System.out.println();
    }
        }
