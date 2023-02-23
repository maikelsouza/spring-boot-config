package com.digitalinnovationone.springboot.controller;

import com.digitalinnovationone.springboot.bussiness.HelloBussiness;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Value("${app.message}")
    private String appMessage;

    @Value("${ENV_DB_URL:ANY}")
    private String dbEnvironmentVariable;

    @Autowired
    private HelloBussiness helloBussiness;

    @ApiOperation(value = "Show Default Message")
    @GetMapping("/")
    public String helloMessage(){
        return appMessage;
    }

    @ApiOperation(value = "Show Db Environment Variable")
    @GetMapping("/envVariable")
    public String getDbEnvironmentVariable() {
        return "db Environment Variable: " + dbEnvironmentVariable;
    }


    @ApiOperation(value = "Show Bussines Exeption")
    @PutMapping("/bussinesExeption")
    @ResponseStatus(HttpStatus.CREATED)
    public String bussinesExeption(){
        return helloBussiness.toString();
    }
}
