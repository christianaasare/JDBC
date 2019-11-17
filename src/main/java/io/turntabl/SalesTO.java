package io.turntabl;

import java.util.Date;

public class SalesTO {
    private int price;
    private Date orderDate;
    private String productName;
    private String customerName;


    public SalesTO(int price, Date orderDate, String productName, String customerName) {
        this.price = price;
        this.orderDate = orderDate;
        this.productName = productName;
        this.customerName = customerName;
    }
}
