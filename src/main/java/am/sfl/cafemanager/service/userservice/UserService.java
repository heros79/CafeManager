package am.sfl.cafemanager.service.userservice;

import am.sfl.cafemanager.model.User;

import java.util.List;

/**
 * Created by user on 8/7/2017.
 */
public interface UserService {

    void saveUser (User user);

    void deleteUser (User user);

    User findByLogin (String login);

    List<User> findAll();

}
