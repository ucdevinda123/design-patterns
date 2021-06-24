package com.designpatterns.dev.behavioral.chainofresponsibility.java;

import java.util.Stack;

public abstract class Handler {
    private Handler nextHandler;
    public Handler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public void handle(Request request){
        if(doHandle(request)){ return;}
        else{
            if(nextHandler != null){
                nextHandler.handle(request);
            }
        }
    }

    public abstract boolean doHandle(Request request);
}
