package com.designpatterns.dev.behavioral.chainofresponsibility.kotlin

class AuthHandler constructor(nextHandler: Handler?) :  Handler(nextHandler) {

    override fun doHandle(request: Request): Boolean {
        println("Invoking : AuthHandler ")
        return false
    }
}