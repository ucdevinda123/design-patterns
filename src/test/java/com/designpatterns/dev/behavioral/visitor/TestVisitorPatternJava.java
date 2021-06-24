package com.designpatterns.dev.behavioral.visitor;

import com.designpatterns.dev.behavioral.visitor.java.AnchorElement;
import com.designpatterns.dev.behavioral.visitor.java.HeaderElement;
import com.designpatterns.dev.behavioral.visitor.java.HtmlUIElement;
import com.designpatterns.dev.behavioral.visitor.java.operation.Highlight;
import com.designpatterns.dev.behavioral.visitor.java.operation.Operations;
import org.junit.Assert;
import org.junit.Test;

public class TestVisitorPatternJava {

    @Test
    public void testVisitorPattern(){
        HtmlUIElement headerElement = new HeaderElement();
        HtmlUIElement anchorElement = new AnchorElement();

        Operations highlightOperation = new Highlight();
        Assert.assertEquals("Text Highlight Feature for com.designpatterns.dev.behavioral.visitor.java.HeaderElement", highlightOperation.apply(headerElement));
        Assert.assertEquals("Text Highlight Feature for com.designpatterns.dev.behavioral.visitor.java.AnchorElement", highlightOperation.apply(anchorElement));
    }
}
