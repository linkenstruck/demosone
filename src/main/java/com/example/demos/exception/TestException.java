package com.example.demos.exception;

/**
 * @author dingsong
 */
public class TestException extends RuntimeException {
    String code;

    public TestException(String code) {
        super();
        this.code = code;
    }
    public TestException(String code,String message) {
        super(message);
        this.code = code;
    }
    public TestException(String code,String message,Throwable e) {
        super(message,e);
        this.code = code;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
