package newsapi.objects;

import java.util.List;

public class  NewsApiResponse {

    String status;
    int total;
    List<Article> articles;

    public NewsApiResponse(String status, int total, List<Article> articles) {
        this.status = status;
        this.total = total;
        this.articles = articles;
    }

    public NewsApiResponse() {
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public List<Article> getArticles() {
        return articles;
    }

    public void setArticles(List<Article> articles) {
        this.articles = articles;
    }



}