package com.designpatterns.dev.behavioral.momento;

import com.designpatterns.dev.behavioral.momento.kotlin.Editor;
import com.designpatterns.dev.behavioral.momento.kotlin.EditorHistory;
import org.junit.Assert;
import org.junit.Test;

public class TestMomentoPattern {

    @Test
    public void testMomentoKotlin() {
        EditorHistory history = new EditorHistory();
        Editor editor  = new Editor("A");
        history.pushState(editor.createState());

        editor.setContentValue("B");
        history.pushState(editor.createState());

        editor.setContentValue("C");
        history.pushState(editor.createState());

        editor.restoreState(history.popState());
        Assert.assertEquals("B", editor.getContent());
        editor.restoreState(history.popState());

        Assert.assertEquals("A", editor.getContent());
    }


    @Test
    public void testMomentoJava() {
        com.designpatterns.dev.behavioral.momento.java.EditorHistory history = new com.designpatterns.dev.behavioral.momento.java.EditorHistory();
        com.designpatterns.dev.behavioral.momento.java.Editor editor  = new com.designpatterns.dev.behavioral.momento.java.Editor();
        editor.setContent("A");
        history.pushState(editor.createState());

        editor.setContent("B");
        history.pushState(editor.createState());

        editor.setContent("C");
        history.pushState(editor.createState());

        editor.restoreState(history.popState());
        Assert.assertEquals("B", editor.getContent());
        editor.restoreState(history.popState());

        Assert.assertEquals("A", editor.getContent());
    }


}
