package am.sfl.cafemanager.controller;

import am.sfl.cafemanager.model.User;
import am.sfl.cafemanager.service.userservice.SecurityService;
import am.sfl.cafemanager.service.userservice.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

/**
 * Controller for (@link User) Class.
 *
 * Created by David Karchikyan on 8/7/2017.
 */

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private SecurityService securityService;

    @RequestMapping(value = "/registerwaiter", method = RequestMethod.GET)
    public String registration(Model model) {

        model.addAttribute("userForm", new User());

        return "redirect:/manager";
    }

    @RequestMapping(value = "/registerwaiter", method = RequestMethod.POST)
    public String registration(@ModelAttribute("userForm") User userForm) {

        userService.saveUser(userForm);

        return "redirect:/manager";
    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login(Model model, String error, String logout) {

        if (error != null) {
            model.addAttribute("error", "username or password is incorrect");
        }

        if (logout != null) {
            model.addAttribute("massage", "Logged out is successfully");
        }

        return "login";
    }

    @RequestMapping(value = {"/"}, method = RequestMethod.GET)
    public String choise(User user, HttpServletRequest request) {
        SecurityContextHolder.getContext().getAuthentication().getDetails();

        if (request.isUserInRole(User.Role.ROLE_USER.name())) {
            return "redirect:/waiter";
        }

        if (request.isUserInRole(User.Role.ROLE_ADMIN.name())) {
            return "redirect:/manager";
        }

        return "redirect:/login";
    }

    @RequestMapping(value = {"/"}, method = RequestMethod.GET)
    public String waiter(User user, Model model) {
        return "waiter";
    }

    @RequestMapping(value = "/manager", method = RequestMethod.GET)
    public String manager (Model model) {
        return "manager";
    }
}
