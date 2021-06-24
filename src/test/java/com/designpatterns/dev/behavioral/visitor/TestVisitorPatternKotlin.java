package com.designpatterns.dev.behavioral.visitor;


import com.designpatterns.dev.behavioral.visitor.kotlin.AnchorElement;
import com.designpatterns.dev.behavioral.visitor.kotlin.HTMLElement;
import com.designpatterns.dev.behavioral.visitor.kotlin.HeaderElement;
import com.designpatterns.dev.behavioral.visitor.kotlin.operation.Highlight;
import com.designpatterns.dev.behavioral.visitor.kotlin.operation.Operation;
import org.junit.Assert;
import org.junit.Test;

public class TestVisitorPatternKotlin {

    @Test
    public void testVisitorPattern(){
        HTMLElement headerElement = new HeaderElement();
        HTMLElement anchorElement = new AnchorElement();

        Operation highlightOperation = new Highlight();
        Assert.assertEquals("Text Highlight Feature for com.designpatterns.dev.behavioral.visitor.kotlin.HeaderElement", highlightOperation.apply(headerElement));
        Assert.assertEquals("Text Highlight Feature for com.designpatterns.dev.behavioral.visitor.kotlin.AnchorElement", highlightOperation.apply(anchorElement));
    }
}
