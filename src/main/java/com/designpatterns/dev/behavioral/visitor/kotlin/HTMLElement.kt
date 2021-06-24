package com.designpatterns.dev.behavioral.visitor.kotlin

import com.designpatterns.dev.behavioral.visitor.kotlin.operation.Operation

interface HTMLElement {
   fun execute(operation: Operation) : String
}
