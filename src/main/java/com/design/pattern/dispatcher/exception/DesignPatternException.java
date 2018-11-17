package com.design.pattern.dispatcher.exception;

public class DesignPatternException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    protected int code;
    
    protected Object[] args;

    public DesignPatternException() {
        super();
    }

    public DesignPatternException(String message) {
        super(message);
    }

    public DesignPatternException(String message, Throwable cause) {
        super(message, cause);
    }

    public DesignPatternException(int code, String message) {
        super(message);
        this.code = code;
    }

    public DesignPatternException(int code, String message, Throwable cause) {
        super(message, cause);
        this.code = code;
    }

    public DesignPatternException(String message, Object[] args) {
        super(message);
        this.args = args;
    }

    public DesignPatternException(String message, Throwable cause, Object[] args) {
        super(message, cause);
        this.args = args;
    }

    public DesignPatternException(int code, String message, Object[] args) {
        super(message);
        this.code = code;
        this.args = args;
    }

    public DesignPatternException(int code, String message, Throwable cause, Object[] args) {
        super(message, cause);
        this.code = code;
        this.args = args;
    }

    public int getCode() {
        return code;
    }

    public Object[] getArgs() {
        return args;
    }
}
