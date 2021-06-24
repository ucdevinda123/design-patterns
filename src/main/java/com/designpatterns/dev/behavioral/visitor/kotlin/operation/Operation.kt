package com.designpatterns.dev.behavioral.visitor.kotlin.operation

import com.designpatterns.dev.behavioral.visitor.kotlin.HTMLElement

interface Operation {
    fun apply(hemlElement : HTMLElement) : String
}