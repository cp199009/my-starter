package com.my.deen.advice;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author x
 */
@ConfigurationProperties(prefix = "my-starter.my-deen.encrypt-key")
public class EncryptProperties {
    private final static String DEFAULT_KEY = "www.itboyhub.com";
    private String key = DEFAULT_KEY;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }
}
