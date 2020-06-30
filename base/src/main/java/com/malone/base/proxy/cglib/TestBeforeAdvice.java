package com.malone.base.proxy.cglib;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * @Author: malone
 * @Date 2020/6/27 11:01
 */
public class TestBeforeAdvice implements MethodBeforeAdvice {
    /**
     * @param method method being invoked 被代理类方法
     * @param args arguments to the method 被代理类方法的参数
     * @param target 被代理类实例
     */
    @Override
    public void before(Method method
            , Object[] args, Object target) throws Throwable {
//        String clientName = (String)args[0];
//        System.out.println("Hi Mr."+clientName+" ."+method.getName());
        System.out.println(target.getClass());
        System.out.println("TestBeforeAdvice invoke");
    }
}
