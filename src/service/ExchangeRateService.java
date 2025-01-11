package service;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.URI;
import java.util.Map;

public class ExchangeRateService {
    private final HttpClient httpClient;
    private final Gson gson;
    private final String API_URL = "https://v6.exchangerate-api.com/v6/API_KEY/latest/";

    public ExchangeRateService() {
        this.httpClient = HttpClient.newHttpClient();
        this.gson = new Gson();
    }

    public Map<String, Double> getExchangeRates(String baseCurrency) throws Exception {
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(API_URL + baseCurrency))
                .GET()
                .build();

        HttpResponse<String> response = httpClient.send(request,
                HttpResponse.BodyHandlers.ofString());


        JsonObject jsonObject = gson.fromJson(response.body(), JsonObject.class);

        return gson.fromJson(jsonObject.getAsJsonObject("conversion_rates"), Map.class);
    }
}
