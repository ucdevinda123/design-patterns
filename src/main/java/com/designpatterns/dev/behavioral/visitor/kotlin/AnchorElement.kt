package com.designpatterns.dev.behavioral.visitor.kotlin

import com.designpatterns.dev.behavioral.visitor.kotlin.operation.Operation

class AnchorElement : HTMLElement {
    override fun execute(operation: Operation): String {
        return operation.apply(this)
    }
}