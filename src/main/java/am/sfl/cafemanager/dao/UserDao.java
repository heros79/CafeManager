package am.sfl.cafemanager.dao;

import am.sfl.cafemanager.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by user on 8/7/2017.
 */
public interface UserDao extends JpaRepository <User, Long> {

    User findByLogin(String login);
}
