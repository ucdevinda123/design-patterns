package com.designpatterns.dev.behavioral.state.kotlin

class Canvas(tool: Tool) {
       var currentTool: Tool = tool
        get() {
            return field
        }


    fun mouseUp(): String {
        return currentTool.mouseUp()
    }

    fun mouseDown(): String {
        return currentTool.mouseDown()
    }


}