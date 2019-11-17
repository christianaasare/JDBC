package io.turntabl;

import java.util.List;

public interface ProductsDAO {
    List<ProductsTO> getProductByCustomerName(String customerName) throws ClassNotFoundException;
    List<ProductsTO> getFivePopularProducts()throws ClassNotFoundException;
//    public void getProductReport();
}
