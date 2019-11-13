package io.turntabl;

public class ProductsTO {
    private String productName;
    private String unitPrice;

    public ProductsTO(String productName, String unitPrice) {
        this.productName = productName;
        this.unitPrice = unitPrice;
    }


    public String getProductName() {
        return productName;
    }

    public String getUnitPrice() {
        return unitPrice;
    }


}
