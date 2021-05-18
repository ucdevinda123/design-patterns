package com.designpatterns.dev.behavioral.state.java;

public class SelectionTool implements  Tool {
    @Override
    public String mouseUp() {
        return "Dashed square";
    }

    @Override
    public String mouseDown() {
        return "Drawing square shape";
    }
}
