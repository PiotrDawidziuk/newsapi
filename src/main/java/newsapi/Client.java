package newsapi;

import newsapi.request.Request;
import org.springframework.stereotype.Component;

@Component
public class Client {

    private final String apiKey;

    // ERROR? Could not autowire
    public Client(String apiKey) {
        this.apiKey = apiKey;
    }

    public String getArticles(final String source) {
        Request request = new Request(apiKey);
        return request.getArticles(source);
    }

    public String getSources() {
        Request request = new Request(apiKey);
        return request.getSources();
    }

    public String getApiKey() {
        return apiKey;
    }

}
