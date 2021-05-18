package com.designpatterns.dev.behavioral.momento.kotlin

import java.util.*

class EditorHistory {
    private var list: ArrayList<EditorState> = arrayListOf()

    fun pushState(editorState: EditorState){
        list.add(editorState)
    }

    fun popState() : EditorState {
        var editorState = list.get(getIndex())
        list.remove(editorState)
        return list.get(getIndex())
    }

    private fun getIndex() : Int {
        var size = list.size
        return size -1;
    }
}