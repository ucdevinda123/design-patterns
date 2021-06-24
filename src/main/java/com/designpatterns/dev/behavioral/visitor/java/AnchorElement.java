package com.designpatterns.dev.behavioral.visitor.java;

import com.designpatterns.dev.behavioral.visitor.java.operation.Operations;

public class AnchorElement implements HtmlUIElement {
    @Override
    public String execute(Operations operations) {
       return operations.apply(this);
    }
}
