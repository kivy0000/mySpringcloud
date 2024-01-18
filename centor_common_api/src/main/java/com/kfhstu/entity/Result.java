package com.kfhstu.entity;

/**
 * result,用于返回结果
 * @param <T> 返回数据，一般使用list
 */
@SuppressWarnings("all")
public class Result<T> {
    private String code;
    private String msg;
    private T data;//返回数据

    //无返回数据 成功信息
    public static Result success() {
        Result result = new Result<>();
        result.setCode("200");
        result.setMsg("success");
        return result;
    }
    //有返回数据 成功信息
    public static <T> Result<T> success(T data) {
        Result<T> result = new Result<>(data);
        result.setCode("200");
        result.setMsg("success");
        return result;
    }
    //有返回数据 成功信息，且修改msg
    public static <T> Result<T> success(String msg, T data) {
        Result<T> result = new Result<>(data);
        result.setCode("200");
        result.setMsg(msg);
        return result;
    }
    //无返回数据 失败信息,默认msg为fail
    public static Result error(String code) {
        Result result = new Result();
        result.setCode(code);
        result.setMsg("fail!!!");
        return result;
    }
    //无返回数据 失败信息，且修改msg
    public static Result error(String code, String msg) {
        Result result = new Result();
        result.setCode(code);
        result.setMsg(msg);
        return result;
    }
    //有返回数据 失败信息，且修改msg
    public static <T> Result<T> error(String code, String msg, T data) {
        Result<T> result = new Result<>(data);
        result.setCode(code);
        result.setMsg(msg);
        return result;
    }

    public Result() {
    }

    public Result(String code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public Result(T data) {
        this.data = data;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Result{" +
                "code='" + code + '\'' +
                ", msg='" + msg + '\'' +
                ", data=" + data +
                '}';
    }
}
