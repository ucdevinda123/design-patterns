package com.designpatterns.dev.behavioral.state.kotlin

class BrushTool : Tool {
    override fun mouseUp(): String {
        return "Showing eraser icon"
    }

    override fun mouseDown(): String {
        return "Erasing content"
    }
}