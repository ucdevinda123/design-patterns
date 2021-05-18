package com.designpatterns.dev.behavioral.state;

import com.designpatterns.dev.behavioral.momento.kotlin.Editor;
import com.designpatterns.dev.behavioral.momento.kotlin.EditorHistory;
import com.designpatterns.dev.behavioral.state.kotlin.BrushTool;
import com.designpatterns.dev.behavioral.state.kotlin.Canvas;
import com.designpatterns.dev.behavioral.state.kotlin.SelectionTool;
import com.designpatterns.dev.behavioral.state.kotlin.Tool;
import org.junit.Assert;
import org.junit.Test;

public class TestStatePattern {

    @Test
    public void testStateKotlin() {
        Tool tool = new BrushTool();
        Tool toolSelection = new SelectionTool();
        Canvas canvas = new Canvas(tool);
        Assert.assertEquals("Erasing content", canvas.mouseDown());
        Assert.assertEquals("Showing eraser icon", canvas.mouseUp());

        Canvas canvas2 = new Canvas(toolSelection);
        Assert.assertEquals("Drawing square shape", canvas2.mouseDown());
        Assert.assertEquals("Dashed square", canvas2.mouseUp());
    }


    @Test
    public void testStateJava() {
        com.designpatterns.dev.behavioral.state.java.Tool tool = new com.designpatterns.dev.behavioral.state.java.BrushTool();
        com.designpatterns.dev.behavioral.state.java.Canvas canvas = new com.designpatterns.dev.behavioral.state.java.Canvas();
        canvas.setCurrentTool(tool);
        Assert.assertEquals("Erasing content", canvas.mouseDown());
        Assert.assertEquals("Showing eraser icon", canvas.mouseUp());

        com.designpatterns.dev.behavioral.state.java.Tool selectionTool = new com.designpatterns.dev.behavioral.state.java.SelectionTool();
        com.designpatterns.dev.behavioral.state.java.Canvas canvas2 = new com.designpatterns.dev.behavioral.state.java.Canvas();
        canvas2.setCurrentTool(selectionTool);
        Assert.assertEquals("Drawing square shape", canvas2.mouseDown());
        Assert.assertEquals("Dashed square", canvas2.mouseUp());
    }


}
