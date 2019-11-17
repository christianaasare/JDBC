package io.turntabl;

public class ProductsTO {

    String productName;
    int unitPrice;

    public ProductsTO(String productName, int unitPrice) {
        this.productName = productName;
        this.unitPrice = unitPrice;
    }

    public String getProductName() {
        return productName;
    }


    public int getUnitPrice() {
        return unitPrice;
    }


}



