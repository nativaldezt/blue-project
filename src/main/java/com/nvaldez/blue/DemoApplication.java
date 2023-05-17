package com.nvaldez.blue;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

import java.util.*;
import java.util.stream.Collectors;

@SpringBootApplication
public class DemoApplication {
    private final Logger logger = LoggerFactory.getLogger(DemoApplication.class);
    
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

   /* @EventListener(ApplicationReadyEvent.class)
    public void runAfterStartup() {
        logger.info("Running Blue Demo app" );
       
    }*/



    
    
}
