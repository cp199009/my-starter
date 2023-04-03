package com.my.deen.autoconfig;


import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author x
 */
@Configuration
@ComponentScan("com.my")
@ConditionalOnProperty(name = "my-starter.my-deen.enable", havingValue = "true")
public class EncryptAutoConfiguration {

}
