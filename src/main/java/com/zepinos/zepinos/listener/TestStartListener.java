package com.zepinos.zepinos.listener;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.annotation.Configuration;

/**
 * TestStartListener
 */
@Configuration
public class TestStartListener implements InitializingBean, DisposableBean{

    @Override
    public void destroy() throws Exception {
        System.out.println("*** Bean dispose... ***");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("*** Bean create... ***");

    }
}