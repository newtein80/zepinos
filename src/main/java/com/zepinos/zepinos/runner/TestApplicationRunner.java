package com.zepinos.zepinos.runner;

import java.util.Arrays;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * TestApplicationRunner
 */
@Component
@Order(0)
public class TestApplicationRunner implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("*** ApplicationRunner Args : " + Arrays.toString(args.getSourceArgs()));
    }
    
}