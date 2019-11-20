package JDBC;

import java.util.List;

public interface ProductsDAO {
    List<ProductsTO> getProductByCustomerName(String customerName);
    List<ProductsTO> getFivePopularProducts();
//    public void getProductReport();
}
