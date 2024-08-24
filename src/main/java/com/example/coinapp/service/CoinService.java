package com.example.coinapp.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class CoinService {
    private static final String API_URL = "https://pro-api.coinmarketcap.com/v1/cryptocurrency/quotes/latest";
    private static final String API_KEY = "api-key-here";

    public String getCoinData(String symbols) {
        String url = API_URL + "?symbol=" + symbols;

        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(url, String.class);
    }

	public static String getApiKey() {
		return API_KEY;
	}
}
