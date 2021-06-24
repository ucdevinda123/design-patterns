package com.designpatterns.dev.behavioral.chainofresponsibility.kotlin

class CompressionHandler constructor(handler: Handler?) : Handler(handler) {
    override fun doHandle(request: Request): Boolean {
        println("Invoking : CompressionHandler ")
        return false
    }

}