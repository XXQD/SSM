package com.etock.controller;

import lombok.Data;

@Data
public class Result {
    private Object data;
    private Integer code;
    private String message;

    public Result() {
    }

    public Result(Object data, Integer code) {
        this.data = data;
        this.code = code;
    }

    public Result(Object data, Integer code, String message) {
        this.data = data;
        this.code = code;
        this.message = message;
    }
}
