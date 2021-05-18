package com.designpatterns.dev.behavioral.momento.kotlin

class EditorState(content: String) {
    var content = content
        get() = field
    fun createState(content : String) : EditorState{
        return EditorState(content)
    }
}