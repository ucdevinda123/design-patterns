package com.designpatterns.dev.behavioral.visitor.java;

import com.designpatterns.dev.behavioral.visitor.java.operation.Operations;

public interface HtmlUIElement {
    String execute(Operations operations);
}
