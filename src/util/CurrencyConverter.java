package util;

import service.ExchangeRateService;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CurrencyConverter {
    private final ExchangeRateService exchangeRateService;
    private final List<String> SUPPORTED_CURRENCIES = Arrays.asList(
            "USD", "ARS", "BOB", "BRL", "CLP", "COP"
    );

    public CurrencyConverter() {
        this.exchangeRateService = new ExchangeRateService();
    }

    public double convert(double amount, String fromCurrency, String toCurrency) throws Exception {
        Map<String, Double> rates = exchangeRateService.getExchangeRates(fromCurrency);
        Double rate = rates.get(toCurrency);
        if (rate == null) {
            throw new IllegalArgumentException("Currency not found: " + toCurrency);
        }
        return amount * rate;
    }

    public double getExchangeRate(String fromCurrency, String toCurrency) throws Exception {
        Map<String, Double> rates = exchangeRateService.getExchangeRates(fromCurrency);
        Double rate = rates.get(toCurrency);
        if (rate == null) {
            throw new IllegalArgumentException("Currency not found: " + toCurrency);
        }
        return rate;
    }

    public Map<String, Double> getSupportedExchangeRates(String baseCurrency) throws Exception {
        Map<String, Double> allRates = exchangeRateService.getExchangeRates(baseCurrency);

        // Filtrar solo las monedas que nos interesan
        return allRates.entrySet().stream()
                .filter(entry -> SUPPORTED_CURRENCIES.contains(entry.getKey()))
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue
                ));
    }
}