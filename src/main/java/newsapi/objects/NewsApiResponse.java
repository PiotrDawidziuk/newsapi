package newsapi.objects;

import java.util.List;

public class  NewsApiResponse {


    List<Article> articles;

    public NewsApiResponse(String status, int total, List<Article> articles) {

        this.articles = articles;
    }

    public NewsApiResponse() {
    }

    public List<Article> getArticles() {
        return articles;
    }

    public void setArticles(List<Article> articles) {
        this.articles = articles;
    }

}