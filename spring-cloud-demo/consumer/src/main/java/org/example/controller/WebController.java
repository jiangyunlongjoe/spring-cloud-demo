package org.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class WebController {
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/query")
    public Object query() {
        return restTemplate.getForObject("http://provider/test", String.class);
    }
}
