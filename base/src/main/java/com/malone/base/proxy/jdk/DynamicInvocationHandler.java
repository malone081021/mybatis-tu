package com.malone.base.proxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @Author: malone
 * @Date 2020/6/26 23:09
 */
public class DynamicInvocationHandler implements InvocationHandler {
    // 被代理对象
    private Object object;

    public DynamicInvocationHandler(Object object) {
        this.object = object;
    }

    // 方法调用拦截
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("invoke proxy method");
        method.invoke(object, args); // 调用被代理方法，通过反射方法
        return null;
    }
}
