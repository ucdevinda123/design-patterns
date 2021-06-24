package com.designpatterns.dev.behavioral.visitor.java.operation;

import com.designpatterns.dev.behavioral.visitor.java.HtmlUIElement;

public class TextHinting implements Operations {
    @Override
    public String apply(HtmlUIElement htmlUIElement) {
        return "Text Hinting Feature for " + htmlUIElement.getClass().getName();
    }
}
