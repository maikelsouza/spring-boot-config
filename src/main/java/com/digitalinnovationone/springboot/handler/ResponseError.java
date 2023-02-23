package com.digitalinnovationone.springboot.handler;


import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class ResponseError {
    private LocalDateTime timestamp = LocalDateTime.now();
    private String status = "error";
    private int statusCode = 400;
    private String error;
}
