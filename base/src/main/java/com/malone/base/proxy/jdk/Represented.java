package com.malone.base.proxy.jdk;

/**
 * 被代理
 *
 * @Author: malone
 * @Date 2020/6/26 23:08
 */
public class Represented implements ITest {
    @Override
    public void test() {
        System.out.println("Represented method invocation");
    }
}
