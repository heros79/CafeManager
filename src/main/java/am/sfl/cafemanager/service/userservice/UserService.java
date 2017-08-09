package am.sfl.cafemanager.service.userservice;

import am.sfl.cafemanager.model.User;

/**
 * Created by user on 8/7/2017.
 */
public interface UserService {

    void saveUser (User user);

    User findByLogin (String login);

}
