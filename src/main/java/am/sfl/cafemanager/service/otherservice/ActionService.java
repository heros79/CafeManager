package am.sfl.cafemanager.service.otherservice;

import am.sfl.cafemanager.dao.OrderDao;
import am.sfl.cafemanager.dao.ProductDao;
import am.sfl.cafemanager.dao.TableDao;
import am.sfl.cafemanager.model.Order;
import am.sfl.cafemanager.model.Product;
import am.sfl.cafemanager.model.TableC;
import am.sfl.cafemanager.model.User;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by user on 8/7/2017.
 */
public class ActionService implements OrderService, ProductService, TableService {

    @Autowired
    private OrderDao orderDao;

    @Autowired
    private ProductDao productDao;

    @Autowired
    private TableDao tableDao;

    @Override
    public void createOrder(Order order) {
        orderDao.save(order);
    }

    @Override
    public Order findOrderByOrderNumber(int orderNumber) {
        return orderDao.findByOrderNumber(orderNumber);
    }

    @Override
    public Product findByProductName(String productName) {
        return productDao.findByProductName(productName);
    }

    @Override
    public void createProduct(Product product) {
        productDao.save(product);
    }

    @Override
    public void cresteTable(TableC table) {
        tableDao.save(table);
    }

    @Override
    public TableC findByTableNumber(int tableNumber) {
        return tableDao.findByTableNumber(tableNumber);
    }

    @Override
    public TableC findByTableStatus(boolean assigned) {
        return tableDao.findByTableStatus(assigned);
    }
}
