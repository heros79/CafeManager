package am.sfl.cafemanager.service.otherservice;

import am.sfl.cafemanager.model.Order;
import am.sfl.cafemanager.model.TableC;
import am.sfl.cafemanager.model.User;

/**
 * Created by user on 8/7/2017.
 */
public interface OrderService {

    void createOrder (Order order);

    Order findOrderByOrderNumber (int orderNumber);

    Order openOrder (Order order, TableC table, User user);

    Order closeOrder (Order order, TableC table, User user);
}
