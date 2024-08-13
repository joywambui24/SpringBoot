package com.example.friday.model;


public record Response <T>(
        Boolean success,
        String message,
        T data
){}

