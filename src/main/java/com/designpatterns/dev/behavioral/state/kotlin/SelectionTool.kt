package com.designpatterns.dev.behavioral.state.kotlin

class SelectionTool : Tool {
    override fun mouseUp(): String {
        return "Dashed square"
    }

    override fun mouseDown(): String {
        return "Drawing square shape"
    }
}