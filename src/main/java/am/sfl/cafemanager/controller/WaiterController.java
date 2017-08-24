package am.sfl.cafemanager.controller;

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

/**
 * Created by David on 8/14/2017.
 */

@Controller
public class WaiterController{

    @Autowired
    private UserService userService;

    @Autowired
    private ActionService actionService;



    @RequestMapping(value = {"waiter"}, method = RequestMethod.GET)
    public String waiter (Model model) {
        User user = new User();
        model.addAttribute("selectForm", user);
        model.addAttribute("usersList", userService.findAll());



        model.addAttribute("selectTable", new TableC());
        model.addAttribute("tablesList", user.getTableCSet());

        return "waiter";
    }

    @RequestMapping(value = "/waiter", method = RequestMethod.POST)
    public String waiter(@ModelAttribute ("selectForm") User selectForm, Model model){

        model.addAttribute("usersList", userService.findAll());

        TableC tableC = new TableC();

        tableC.setUser(selectForm);

        model.addAttribute("selectTable", tableC);
        model.addAttribute("tablesList", selectForm.getTableCSet());

        for (TableC a: selectForm.getTableCSet()
             ) {
System.out.println(a.getTableId());
        }

        return "waiter";
    }
}
