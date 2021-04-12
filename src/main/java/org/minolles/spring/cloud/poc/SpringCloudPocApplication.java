package org.minolles.spring.cloud.poc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringCloudPocApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudPocApplication.class, args);
    }

    @RequestMapping(value = "/greetings", method = RequestMethod.GET)
    public String sayHello() {
        return "Hello world!";
    }
}
