package newsapi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class HomeController {

    @GetMapping (path = "/")
    public String home() {
        return ("index.html");
    }

    }
