package com.my.deen.advice;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.core.MethodParameter;
import org.springframework.http.HttpInputMessage;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.RequestBodyAdvice;

import java.io.IOException;
import java.lang.reflect.Type;

/**
 * @author x
 * RequestBodyAdvice只支持带有@RequestBody注解的controller方法参数的方法
 */
@Slf4j
@ControllerAdvice
@EnableConfigurationProperties(EncryptProperties.class)
public class MyRequestBodyAdvice implements RequestBodyAdvice {

    /**
     * 判断是否拦截（可以更精细化地进行判断是否拦截）
     *
     * @param methodParameter x
     * @param type            x
     * @param aClass          x
     * @return x
     */
    @Override
    public boolean supports(MethodParameter methodParameter, Type type, Class<? extends HttpMessageConverter<?>> aClass) {
        log.info("请求参数拦截...supports");
        return true;
    }

    /**
     * 进行请求前的拦截处理
     *
     * @param httpInputMessage x
     * @param methodParameter  x
     * @param type             x
     * @param aClass           x
     * @return x
     * @throws IOException x
     */
    @Override
    public HttpInputMessage beforeBodyRead(HttpInputMessage httpInputMessage, MethodParameter methodParameter, Type type, Class<? extends HttpMessageConverter<?>> aClass) throws IOException {
        log.info("请求参数拦截...beforeBodyRead");
        return httpInputMessage;
    }

    /**
     * 进行请求后的拦截处理
     *
     * @param o                x
     * @param httpInputMessage x
     * @param methodParameter  x
     * @param type             x
     * @param aClass           x
     * @return x
     */
    @Override
    public Object afterBodyRead(Object o, HttpInputMessage httpInputMessage, MethodParameter methodParameter, Type type, Class<? extends HttpMessageConverter<?>> aClass) {
        return o;
    }

    /**
     * 对空请求体的处理
     *
     * @param o                x
     * @param httpInputMessage x
     * @param methodParameter  x
     * @param type             x
     * @param aClass           x
     * @return x
     */
    @Override
    public Object handleEmptyBody(Object o, HttpInputMessage httpInputMessage, MethodParameter methodParameter, Type type, Class<? extends HttpMessageConverter<?>> aClass) {
        return o;
    }
}
