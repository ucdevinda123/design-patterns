package com.designpatterns.dev.behavioral.state.java;

public class BrushTool implements Tool {

    @Override
    public String mouseUp() {
        return "Showing eraser icon";
    }

    @Override
    public String mouseDown() {
       return "Erasing content";
    }
}
