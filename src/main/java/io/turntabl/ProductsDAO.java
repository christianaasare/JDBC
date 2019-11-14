package io.turntabl;

import java.util.List;

public interface ProductsDAO {
    List<ProductsTO> getProductByCustomerName(String customerName) throws ClassNotFoundException;
    List<ProductsTO> topFiveProducts();
//    public void getProductReport();
}
