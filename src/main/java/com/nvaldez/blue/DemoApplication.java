package com.nvaldez.blue;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import io.swagger.v3.oas.annotations.servers.Server;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

@OpenAPIDefinition(
        info = @Info(title = "Blue Project",
                version = "1.0",
                contact = @Contact(
                        name = "Natalia Valdez",
                        email = "navtti@gmail.com"
                ),
                license = @License(
                        name = "MIT License",
                        url = "https://opensource.org/licenses/MIT"
                )),
        servers = {
                @Server(url = "http://localhost:8083")
        })
@SpringBootApplication
public class DemoApplication {
    private final Logger logger = LoggerFactory.getLogger(DemoApplication.class);
    
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @EventListener(ApplicationReadyEvent.class)
    public void runAfterStartup() {
        logger.info("Running Blue Demo app" );
       
    }


}
