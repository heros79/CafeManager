package am.sfl.cafemanager.dao;

import am.sfl.cafemanager.model.Order;
import am.sfl.cafemanager.model.TableC;
import am.sfl.cafemanager.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by user on 8/7/2017.
 */
public interface OrderDao extends JpaRepository <Order, Long> {

    Order findByOrderNumber (int OrderNumber);

    Order openOrder (Order order, TableC table, User user);

    Order closeOrder (Order order, TableC table, User user);
}
