package com.designpatterns.dev.behavioral.chainofresponsibility;

import com.designpatterns.dev.behavioral.chainofresponsibility.kotlin.*;
import org.junit.Test;

public class TestChainOfReponsibilityKotlin {

    @Test
    public void testChainOfResponsibilityKotlin() {
        WebServer webServer = new WebServer();
        Request request = new Request("Request");

        CompressionHandler compressionHandler = new CompressionHandler(null);
        LoggingHandler loggingHandler = new LoggingHandler(compressionHandler);
        AuthHandler authHandler = new AuthHandler(loggingHandler);

        webServer.handle(request,authHandler);

        LoggingHandler loggingHandle1 = new LoggingHandler(null);
        AuthHandler authHandle1 = new AuthHandler(loggingHandle1);
      //  webServer.handle(request,authHandle1);
    }
}
