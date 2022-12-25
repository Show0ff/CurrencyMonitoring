package org.example;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.json.JsonMapper;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;

public class DataParser {

    public HttpResponse<String> getData() throws IOException, InterruptedException {
        HttpClient httpClient = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://www.cbr-xml-daily.ru/daily_json.js"))
                .GET()
                .build();

        return httpClient.send(request, HttpResponse.BodyHandlers.ofString());
    }

    private List<Info> advancedParse(HttpResponse<String> response) throws JsonProcessingException {
        JsonMapper jsonMapper = new JsonMapper();
        Info[] infos = jsonMapper.readValue(response.body(), Info[].class);
        return List.of(infos);
    }

    public void printListInfo() throws IOException, InterruptedException {
        List<Info> infos = advancedParse(getData());
        for (Info info : infos) {
            System.out.println(info);
        }
    }

}
