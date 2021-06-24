package com.designpatterns.dev.behavioral.visitor.kotlin.operation

import com.designpatterns.dev.behavioral.visitor.kotlin.HTMLElement

class TextHinting : Operation {
    override fun apply(htmlElement: HTMLElement): String {
        return "Text Hinting Feature for " + htmlElement.javaClass.name
    }
}