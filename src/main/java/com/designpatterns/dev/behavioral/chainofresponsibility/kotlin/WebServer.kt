package com.designpatterns.dev.behavioral.chainofresponsibility.kotlin

class WebServer {

    fun handle(request: Request, handler: Handler?){
        handler?.handle(request);
    }
}