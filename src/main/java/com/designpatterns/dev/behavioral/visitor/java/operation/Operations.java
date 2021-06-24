package com.designpatterns.dev.behavioral.visitor.java.operation;

import com.designpatterns.dev.behavioral.visitor.java.HtmlUIElement;

public interface Operations {
    String apply(HtmlUIElement htmlUIElement);
}
