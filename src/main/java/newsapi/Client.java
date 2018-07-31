package newsapi;

import newsapi.request.Request;

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
