package newsapi.controller;

import newsapi.objects.MyNewsResponse;
import newsapi.objects.NewsApiResponse;
import newsapi.service.NewsApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NewsController {

   @Autowired
   NewsApiService newsApiService;

   @GetMapping("/news/{country}/{category}")
    public MyNewsResponse news(@PathVariable ("country") String country, @PathVariable ("category") String category) {

       NewsApiResponse newsApiResponse = newsApiService.findArticlesByCountryAndCategory(country,category);

        MyNewsResponse myNewsResponse = new MyNewsResponse(country,category, newsApiResponse.getArticles());

       return myNewsResponse;
    }

}
