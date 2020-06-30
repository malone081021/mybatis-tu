package com.malone.base.chain;

/**
 * @Author: malone
 * @Date 2020/6/28 21:09
 */
public interface Interceptor {

    void intercept(Object object, InterceptorChain chain);
}
