package com.designpatterns.dev.behavioral.momento.kotlin

class Editor (var contentValue: String)  {

    fun getContent() : String{
        return contentValue
    }

    fun  createState() : EditorState {
        return  EditorState(contentValue)
    }

    fun restoreState(editorState: EditorState){
        contentValue = editorState.content;
    }
}