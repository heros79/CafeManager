package am.sfl.cafemanager.service.userservice;

import am.sfl.cafemanager.dao.UserDao;
import am.sfl.cafemanager.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by user on 8/7/2017.
 */

@Service ("User")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @Override
    public void saveUser(User user) {
        user.setPasswordHash(bCryptPasswordEncoder.encode(user.getPasswordHash()));
        user.setRole(User.Role.ROLE_USER);
        userDao.save(user);
    }

    @Override
    public void deleteUser(User user) {
        userDao.delete(user.getID());
    }

    @Override
    public User findByLogin(String login) {
        return userDao.findByLogin(login);
    }

    @Override
    public List<User> findAll() {
        return userDao.findAll();
    }
}