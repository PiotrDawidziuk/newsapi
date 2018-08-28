package newsapi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class NewsController {

    // new Country? NewsCategory?

    // new Request?

    @RequestMapping("/news")
    public String news(@RequestParam String category, @RequestParam String country) {
        return "news";

    }
}
