package com.designpatterns.dev.behavioral.visitor.java.operation;

import com.designpatterns.dev.behavioral.visitor.java.HtmlUIElement;

public class Highlight implements Operations {
    @Override
    public String apply(HtmlUIElement htmlUIElement) {
        return "Text Highlight Feature for " + htmlUIElement.getClass().getName();
    }
}
