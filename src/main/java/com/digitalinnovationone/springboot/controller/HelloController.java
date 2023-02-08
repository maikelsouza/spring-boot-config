package com.digitalinnovationone.springboot.controller;

import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Value("${app.message}")
    private String appMessage;

    @Value("${ENV_DB_URL:ANY}")
    private String dbEnvironmentVariable;

    @ApiOperation(value = "Show Default Message")
    @GetMapping("/")
    public String helloMessage(){
        return appMessage;
    }

    public String getAppMessage() {
        return appMessage;
    }
    @ApiOperation(value = "Show Db Environment Variable")
    @GetMapping("/envVariable")
    public String getDbEnvironmentVariable() {
        return "db Environment Variable: " + dbEnvironmentVariable;
    }
}
