package com.zepinos.zepinos.listener;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextClosedEvent;
import org.springframework.stereotype.Component;

/**
 * TestShutDownListener
 */
@Component
public class TestShutDownListener implements ApplicationListener<ContextClosedEvent>{

    @Override
    public void onApplicationEvent(ContextClosedEvent event) {
        System.out.println("*** Cloased ***");
    }
}