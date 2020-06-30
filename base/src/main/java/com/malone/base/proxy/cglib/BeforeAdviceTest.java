package com.malone.base.proxy.cglib;

import com.malone.base.proxy.jdk.ITest;
import org.springframework.aop.framework.ProxyFactory;

/**
 * @Author: malone
 * @Date 2020/6/27 11:02
 * https://gitbook.cn/books/5e5dabe6ac527973e2d3e0d0/index.html
 * https://www.baeldung.com/cglib 详细介绍CGLIB
 */
public class BeforeAdviceTest {
    public static void main(String[] args) {
        // 1 创建 ProxyFactory 实例
        ProxyFactory proxyFactory = new ProxyFactory();
        //2 目标类
        ITest waiterTarget = new Test();
        proxyFactory.setTarget(waiterTarget);
        // 2.1 Advice 定义横切逻辑
        proxyFactory.addAdvice(new TestBeforeAdvice());
        proxyFactory.setOptimize(true);
        // 4 获取代理对象
        ITest waiterProxy = (ITest) proxyFactory.getProxy();
        waiterProxy.test();
    }
}
