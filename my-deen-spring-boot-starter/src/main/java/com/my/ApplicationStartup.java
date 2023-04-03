package com.my;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * spring-boot startup
 *
 * @author X
 */
@RestController
@SpringBootApplication
public class ApplicationStartup {
    public static void main(String[] args) {
        SpringApplication.run(ApplicationStartup.class, args);
    }

    @RequestMapping("test")
    public String test(@RequestBody Map map) {
        return "test";
    }
}
