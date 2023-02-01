package com.digitalinnovationone.springboot.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Value("${app.message}")
    private String appMessage;

    @Value("${ENV_DB_URL:ANY}")
    private String dbEnvironmentVariable;

    @GetMapping("/")
    public String helloMessage(){
        return appMessage;
    }

    public String getAppMessage() {
        return appMessage;
    }
    @GetMapping("/envVariable")
    public String getDbEnvironmentVariable() {
        return "db Environment Variable: " + dbEnvironmentVariable;
    }
}
