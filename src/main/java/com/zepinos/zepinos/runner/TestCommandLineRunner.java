package com.zepinos.zepinos.runner;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * TestCommandLineRunner
 */
@Component
@Order(1)
public class TestCommandLineRunner implements CommandLineRunner{

    @Override
    public void run(String... args) throws Exception {
        System.out.println("*** CommandLineRunner Args : " + Arrays.toString(args));
    }
    
}