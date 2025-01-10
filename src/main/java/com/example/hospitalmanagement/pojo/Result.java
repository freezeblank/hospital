package com.example.hospitalmanagement.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Result<T> {
    private Integer code; // 0-success 1-failed
    private String message;
    private T data;

    public static <E> Result<E> success(E data) {
        return new Result<>(0, "success", data);
    }

    public static <E> Result<E> success() {
        return new Result<>(0, "success", null);
    }

    public static Result<Void> failed(String message) {
        return new Result<>(1, message, null);
    }

    public static <E> Result<E> failed(String message, E data) {
        return new Result<>(1, message, data);
    }
}
