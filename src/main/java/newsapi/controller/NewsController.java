package newsapi.controller;

import newsapi.objects.Article;
import newsapi.service.NewsApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class NewsController {

   @Autowired
   NewsApiService newsApiService;

    @GetMapping("/news/{country}/{category}")
    public List<Article> news(@PathVariable String country, @PathVariable String category) {
        return newsApiService.findArticlesByCountryAndCategory(country,category);
    }
}
