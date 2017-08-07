package am.sfl.cafemanager.dao;

import am.sfl.cafemanager.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by user on 8/7/2017.
 */
public interface ProductDao extends JpaRepository <Product, Long> {

    Product findByProductName(String ProductName);
}
