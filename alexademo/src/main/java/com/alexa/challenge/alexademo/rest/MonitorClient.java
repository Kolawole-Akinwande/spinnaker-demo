package com.alexa.challenge.alexademo.rest;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;


import java.net.URI;
import java.time.LocalDateTime;

@Component
public class MonitorClient {

    private RestTemplate restTemplate;

    public MonitorClient() {
        restTemplate = new RestTemplate();
    }

    public String getDefault() {
        URI uri = UriComponentsBuilder
                .fromUriString("")
                .path("/api/Values/Default")
                .build()
                .toUri();

        return doGet(uri);
    }

    public String getResponseCodeAggregator(LocalDateTime fromTime, LocalDateTime toTime) {
        URI uri = UriComponentsBuilder
                .fromUriString("")
                .path("/api/Values/ResponseCodeAggregator")
                .queryParam("startDate", fromTime)
                .queryParam("endDate", toTime)
                .build()
                .toUri();

        return doGet(uri);
    }

    private String doGet(URI uri) {
        try {
            return restTemplate.getForObject(uri, String.class);
        } catch (Exception e) {
            return "I cannot answer your question at the moment";
        }
    }
}
