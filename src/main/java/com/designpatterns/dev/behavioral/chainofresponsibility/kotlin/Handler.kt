package com.designpatterns.dev.behavioral.chainofresponsibility.kotlin

abstract class Handler(private var nextHandler: Handler?) {


    fun handle(request: Request){
        if(doHandle(request))return
        if(nextHandler != null){
            nextHandler!!.doHandle(request)
        }

    }

    abstract fun  doHandle(request: Request) : Boolean
}