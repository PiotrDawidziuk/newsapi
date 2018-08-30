package newsapi.objects;

import java.util.List;

public class MyNewsResponse {

    String country;
    String category;
    List<Article> articles;

    public MyNewsResponse(String country, String category, List<Article> articles) {
        this.country = country;
        this.category = category;
        this.articles = articles;
    }

    public MyNewsResponse() {
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public List<Article> getArticles() {
        return articles;
    }

    public void setArticles(List<Article> articles) {
        this.articles = articles;
    }
}
