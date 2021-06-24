package com.designpatterns.dev.behavioral.chainofresponsibility;

import com.designpatterns.dev.behavioral.chainofresponsibility.java.*;
import org.junit.Test;

public class TestChainOfResponsibility {

    @Test
    public void testChainOfResponsibilityJava() {
        WebServer webServer = new WebServer();
        Request request = new Request();

        CompressionHandler compressionHandler = new CompressionHandler(null);
        LoggingHandler loggingHandler = new LoggingHandler(compressionHandler);
        AuthHandler authHandler = new AuthHandler(loggingHandler);

        webServer.handle(request,authHandler);

        LoggingHandler loggingHandle1 = new LoggingHandler(null);
        AuthHandler authHandle1 = new AuthHandler(loggingHandle1);
        webServer.handle(request,authHandle1);
    }



}
