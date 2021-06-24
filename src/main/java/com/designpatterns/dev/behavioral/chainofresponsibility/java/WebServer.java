package com.designpatterns.dev.behavioral.chainofresponsibility.java;

public class WebServer {

    public void handle(Request request,Handler handler){
        handler.handle(request);
    }
}
