package newsapi.objects;

import java.util.List;

public class ExternalNewsResponse {
    List<Article> articles;

    public ExternalNewsResponse(List<Article> articles) {
        this.articles = articles;
    }

    public ExternalNewsResponse() {
    }


    public List<Article> getArticles() {
        return articles;
    }

    public void setArticles(List<Article> articles) {
        this.articles = articles;
    }
}
