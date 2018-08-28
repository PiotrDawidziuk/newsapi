package newsapi.service;

import newsapi.objects.Article;
import newsapi.objects.Country;
import newsapi.objects.NewsCategory;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class NewsApiService {

    private final RestTemplate restTemplate;
    private final String apiKey = "62f96aafcdca445fbfd72d61d8d09914";

    public NewsApiService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }


    public List<Article> findArticlesByCountryAndCategory(Country country, NewsCategory category) {
        final String url = "https://newsapi.org/v1/top-headlines";
        List<Article> articles = restTemplate.getForObject(url+"?category="+category+"&country="+country+
                        "&apiKey="+apiKey, List.class);
        return articles;
    }

}
