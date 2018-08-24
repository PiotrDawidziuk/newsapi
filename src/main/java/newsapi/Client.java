package newsapi;

import newsapi.request.Request;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class Client {

    private final String apiKey;

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
