package newsapi.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import newsapi.objects.Article;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

@Service
public class NewsApiService {

    //private final RestTemplate restTemplate;
    private final String apiKey = "62f96aafcdca445fbfd72d61d8d09914";

    private final ObjectMapper objectMapper;




    public NewsApiService(RestTemplate restTemplate, ObjectMapper objectMapper) {
      //  this.restTemplate = restTemplate;
        this.objectMapper = objectMapper;
    }


//    public List<Article> findArticlesByCountryAndCategory(String country, String category) {
//        final String url = "https://newsapi.org/v2/top-headlines";
//        List<Article> articles = restTemplate.getForObject(url+"?category="+category+"&country="+country+
//                        "&apiKey="+apiKey, List.class);
//        return articles;
//    }

    public HashMap<String, Article> findArticlesByCountryAndCategory(String country, String category) {
        final String url = "https://newsapi.org/v2/top-headlines";
        HashMap<String, Article> articles = null;
        try {
            articles = objectMapper.readValue(url+"?category="+category+"&country="+country+
                    "&apiKey="+apiKey, HashMap.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return articles;
    }



}
