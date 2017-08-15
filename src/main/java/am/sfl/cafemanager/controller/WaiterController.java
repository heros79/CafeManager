package am.sfl.cafemanager.controller;

import am.sfl.cafemanager.dao.TableDao;
import am.sfl.cafemanager.model.TableC;
import am.sfl.cafemanager.model.User;
import am.sfl.cafemanager.service.otherservice.ActionService;
import am.sfl.cafemanager.service.userservice.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by David on 8/14/2017.
 */

@Controller
public class WaiterController{

    @Autowired
    private UserService userService;



    @RequestMapping(value = {"waiter"}, method = RequestMethod.GET)
    public String waiter (Model model) {
        model.addAttribute("selectForm", userService.findAll());
        initModelList(model);
        return "waiter";
    }

    @RequestMapping(value = "/waiter", method = RequestMethod.POST)
    public String waiter(@RequestParam("login") String login, Model model){
        model.addAttribute("selectForm", userService.findAll());
        initModelList(model);
        return "waiter";
    }

    private void initModelList(Model model) {
        List<User> userList = userService.findAll();
        List<String> personalList = new ArrayList<String>();
        for (User user : userList) {
            personalList.add(user.getLogin());
        }
        model.addAttribute("userList", personalList);
    }

}
