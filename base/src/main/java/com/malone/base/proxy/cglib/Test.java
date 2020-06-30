package com.malone.base.proxy.cglib;

import com.malone.base.proxy.jdk.ITest;

/**
 * @Author: malone
 * @Date 2020/6/27 11:01
 */
public class Test implements ITest {
    @Override
    public void test() {
        System.out.println("Represented method invoke");
    }
}
