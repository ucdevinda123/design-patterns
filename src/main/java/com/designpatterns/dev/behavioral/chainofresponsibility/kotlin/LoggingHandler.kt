package com.designpatterns.dev.behavioral.chainofresponsibility.kotlin

class LoggingHandler constructor(nextHandler: Handler?) : Handler(nextHandler){
    override fun doHandle(request: Request): Boolean {
        println("Invoking : LoggingHandler ")
        return false
    }

}