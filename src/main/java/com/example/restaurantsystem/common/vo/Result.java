package com.example.restaurantsystem.common.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Result<T> {
    private Integer code;
    private String msg;
    private T data;

    public static <T> Result<T> successResult(T data){
        return new Result<>(1, "success", data);
    }

    public static <T> Result<T> failResult(T data){
        return new Result<>(1, "fail", data);
    }
}
