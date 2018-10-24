package controllers;

import dao.UserDao;
import model.Login;
import model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
@RequestMapping("/")
public class LoginController {

    @GetMapping
    private String toLoginPage(Model model) {
        model.addAttribute("login", new Login());
        return "login";
    }


    @PostMapping
    private String loginHandle(@ModelAttribute("login") Login login) {
        User user = UserDao.checkLogin(login);
        if (user != null) {
            return "show";
        }
        return "login";
    }
}
