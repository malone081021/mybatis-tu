package com.malone.base.proxy.jdk;

import java.lang.reflect.Proxy;

/**
 * @Author: malone
 * @Date 2020/6/26 23:11
 */
public class DynamicProxyTest {

    public static void main(String[] args) {
        String property = "sun.misc.ProxyGenerator.saveGeneratedFiles";
        System.getProperties().setProperty(property, "true");
        // 以上两句话用于保存，JDK动态产生的代理类Proxy0
        ITest represented = new Represented();  // 被代理实例
        ITest proxy = (ITest) Proxy.newProxyInstance(represented.getClass().getClassLoader(),
                represented.getClass().getInterfaces(), new DynamicInvocationHandler(represented));
        proxy.test(); // 通过代理调用方法
    }
}
