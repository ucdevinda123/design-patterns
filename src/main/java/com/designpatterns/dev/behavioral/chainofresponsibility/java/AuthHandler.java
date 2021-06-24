package com.designpatterns.dev.behavioral.chainofresponsibility.java;

public class AuthHandler extends Handler {
    public AuthHandler(Handler nextHandler) {
        super(nextHandler);
    }

    @Override
    public boolean doHandle(Request request) {
        System.out.println("AuthHandler");
        return false;
    }
}
