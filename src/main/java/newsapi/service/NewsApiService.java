package newsapi.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import newsapi.objects.NewsApiResponse;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class NewsApiService {

    private final RestTemplate restTemplate;
    private final String apiKey = "62f96aafcdca445fbfd72d61d8d09914";

    public NewsApiService(RestTemplate restTemplate, ObjectMapper objectMapper) {
        this.restTemplate = restTemplate;
    }

    public NewsApiResponse findArticlesByCountryAndCategory(String country, String category) {
        final String url = "https://newsapi.org/v2/top-headlines";
        NewsApiResponse newsApiResponse = restTemplate.getForObject(url+"?category="+category+"&country="+country+
                "&apiKey="+apiKey, NewsApiResponse .class);
        return newsApiResponse;
    }

}
