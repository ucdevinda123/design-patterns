package com.designpatterns.dev.behavioral.chainofresponsibility.java;

public class CompressionHandler  extends Handler{
    public CompressionHandler(Handler nextHandler) {
        super(nextHandler);
    }

    @Override
    public boolean doHandle(Request request) {
        System.out.println("CompressionHandler");
        return false;
    }
}
