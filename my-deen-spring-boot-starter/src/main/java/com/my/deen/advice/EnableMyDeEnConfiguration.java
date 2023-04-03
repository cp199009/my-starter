package com.my.deen.advice;

import com.my.deen.autoconfig.EncryptAutoConfiguration;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * @author x
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Import({EncryptAutoConfiguration.class})
public @interface EnableMyDeEnConfiguration {
}
