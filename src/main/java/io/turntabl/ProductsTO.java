package io.turntabl;

public class ProductsTO {

   private String product_name;
   private int unit_price;

    public ProductsTO(String product_name, int unitPrice) {
        this.product_name = product_name;
        this.unit_price = unitPrice;
    }

    public String getProductName() {
        return product_name;
    }


    public int getUnitPrice() {
        return unit_price;
    }

    @Override
    public String toString() {
        return "{" +
                "productName='" + product_name + '\'' +
                ", unitPrice=" + unit_price +
                '}';
    }
}



