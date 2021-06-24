package com.designpatterns.dev.behavioral.chainofresponsibility.java;

public class LoggingHandler extends Handler {
    public LoggingHandler(Handler nextHandler) {
        super(nextHandler);
    }

    @Override
    public boolean doHandle(Request request) {
        System.out.println("LoggingHandler");
        return false;
    }
}
