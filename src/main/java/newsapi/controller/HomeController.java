package newsapi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class HomeController {

    @GetMapping (path = "/home")
    public String home() {
        return ("index.html");
    }

    @GetMapping (path = "/test")
    @ResponseBody
    public String test() {
        return "TEST";
    }

    @GetMapping (path = "/news")
    public String news() {
        return ("news.html");
    }
}
