package newsapi.controller;

import newsapi.objects.NewsApiResponse;
import newsapi.service.NewsApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NewsController {

   @Autowired
   NewsApiService newsApiService;

   @GetMapping("/news/{country}/{category}")
    public NewsApiResponse news(@PathVariable ("country") String country, @PathVariable ("category") String category) {
        return newsApiService.findArticlesByCountryAndCategory(country,category);
    }

}
