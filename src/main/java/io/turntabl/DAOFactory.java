package io.turntabl;

public interface DAOFactory {
    public CustomerDAO getCustomerDAO();
    public ProductsDAO getProductDAO();
    public SalesDAO getSalesDAO();
}
