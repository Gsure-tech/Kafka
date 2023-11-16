package com.gsuretech.kafka.controller;

import com.gsuretech.kafka.apiService.ApiService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {
    private final ApiService apiService;

    public ApiController(ApiService apiService) {
        this.apiService = apiService;
    }

    @PostMapping("/detectObjects")
    public Object[] detectObjects(@RequestBody String base64Image) {
        return apiService.callExternalApi(base64Image);
    }
}
