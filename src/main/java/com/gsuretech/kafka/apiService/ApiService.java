package com.gsuretech.kafka.apiService;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import org.springframework.http.HttpHeaders;

@Service
public class ApiService {
    private final RestTemplate restTemplate;

    public ApiService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public Object[] callExternalApi(String base64Image) {
        // Set the request headers
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        // Create the request body
        String requestBody = "{\"type\":\"OBJECT_DETECTION\",\"image\":\"" + base64Image + "\"}";

        // Create the HttpEntity
        HttpEntity<String> requestEntity = new HttpEntity<>(requestBody, headers);

        // Make the API call
        String apiUrl = "http://192.168.5.79/image/";
        return restTemplate.exchange(apiUrl, HttpMethod.POST, requestEntity, Object[].class).getBody();
    }
}
