package com.example.demos.common;

import lombok.Data;
import org.springframework.http.HttpStatus;

/**
 * @author dingsong
 */
@Data
public class ResponseBean {
    // http 状态码
    private HttpStatus status;

    // 状态码
    private String code;

    // 返回信息
    private String msg;

    // 返回的数据
    private Object data;

    public ResponseBean(StatusCode statusCode, Object data) {
        this.status = HttpStatus.OK;
        this.code = String.valueOf(statusCode.getCode());
        this.msg = statusCode.getMsg();
        this.data = data;
    }

    public ResponseBean(String code, String msg, Object data) {
        this.status = HttpStatus.OK;
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public ResponseBean(HttpStatus status, String code, String msg, Object data) {
        this.status = status;
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public ResponseBean(HttpStatus status, int code, String msg, Object data) {
        this.status = status;
        this.code = String.valueOf(code);
        this.msg = msg;
        this.data = data;
    }
}
