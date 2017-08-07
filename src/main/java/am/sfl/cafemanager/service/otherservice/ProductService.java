package am.sfl.cafemanager.service.otherservice;

import am.sfl.cafemanager.model.Product;

/**
 * Created by user on 8/7/2017.
 */
public interface ProductService {

    Product findByProductName (String productName);

    void createProduct (Product product);
}
