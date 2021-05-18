package com.designpatterns.dev.behavioral.state.java;

public class Canvas {
    private Tool currentTool;

    public String mouseUp(){
        return currentTool.mouseUp();
    }

    public String mouseDown(){
        return currentTool.mouseDown();
    }


    public Tool getCurrentTool() {
        return currentTool;
    }

    public void setCurrentTool(Tool currentTool) {
        this.currentTool = currentTool;
    }
}
