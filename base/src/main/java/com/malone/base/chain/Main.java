package com.malone.base.chain;

/**
 * Chain of Responsibility Pattern demo
 *
 * @Author: malone
 * @Date 2020/6/28 21:06
 */

class AInterceptor implements Interceptor {
    @Override
    public void intercept(Object object, InterceptorChain chain) {
        System.out.println("AInterceptor");
        chain.plugin(object);
    }
}

class BInterceptor implements Interceptor {
    @Override
    public void intercept(Object object, InterceptorChain chain) {
        System.out.println("BInterceptor");
        chain.plugin(object);
    }
}

class CInterceptor implements Interceptor {
    @Override
    public void intercept(Object object, InterceptorChain chain) {
        System.out.println("CInterceptor");
        chain.plugin(object);
    }
}

public class Main {
    public static void main(String[] args) {
        InterceptorChain interceptorChain = new InterceptorChain();
        AInterceptor aInterceptor = new AInterceptor();
        BInterceptor bInterceptor = new BInterceptor();
        CInterceptor cInterceptor = new CInterceptor();
        interceptorChain.addInterceptor(aInterceptor);
        interceptorChain.addInterceptor(bInterceptor);
        interceptorChain.addInterceptor(cInterceptor);
        interceptorChain.plugin(new Object());
    }
}
