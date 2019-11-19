package JDBC;

import java.util.List;

public interface CategoryDAO extends DAOFactory {
//    get a list of products in a given category
    List<ProductsTO> getProductInCategory();
//get a list of sales for a given category
    List<SalesTO> getSalesInCategory();
}
