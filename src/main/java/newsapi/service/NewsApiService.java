package newsapi.service;

import newsapi.objects.Article;
import newsapi.objects.Country;
import newsapi.objects.NewsCategory;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

public class NewsApiService {

    private final RestTemplate restTemplate;
    private final String apiKey;

    public NewsApiService(RestTemplate restTemplate, String apiKey) {
        this.restTemplate = restTemplate;
        this.apiKey = apiKey;
    }
    

    public List<Article> findArticlesByCountryAndCategory(Country country, NewsCategory category) {
        final String url = "https://newsapi.org/v1/articles";
        List<Article> articles = restTemplate.getForObject(url+"?category="+category+"&country="+country,
                List.class);
        return articles;
    }

}
