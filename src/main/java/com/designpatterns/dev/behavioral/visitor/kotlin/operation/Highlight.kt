package com.designpatterns.dev.behavioral.visitor.kotlin.operation

import com.designpatterns.dev.behavioral.visitor.kotlin.HTMLElement

class Highlight : Operation {
    override fun apply(htmlElement: HTMLElement): String {
        return "Text Highlight Feature for " + htmlElement.javaClass.name
    }
}