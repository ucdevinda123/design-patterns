package com.designpatterns.dev.behavioral.momento.java;

public class Editor {
    private  String content;

    public String getContent() {
        return this.content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public EditorState createState(){
        return new EditorState(this.content);
    }

    public void restoreState(EditorState editorState) {
        this.content = editorState.getContent();
    }
}