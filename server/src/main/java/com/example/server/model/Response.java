package com.example.server.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import lombok.experimental.SuperBuilder;
import org.springframework.http.HttpStatus;

import java.time.LocalTime;
import java.util.Map;

import static com.fasterxml.jackson.annotation.JsonInclude.*;

@Data
@SuperBuilder
@JsonInclude(Include.NON_NULL)
public class Response {
    protected LocalTime timeStamp;
    protected int statusCode;
    protected HttpStatus status;
    protected String reason;
    protected String message;
    protected String developerMessage;
    protected Map<?, ?> data;

}
