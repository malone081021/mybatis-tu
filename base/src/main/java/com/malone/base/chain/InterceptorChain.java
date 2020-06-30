package com.malone.base.chain;

import java.util.ArrayList;
import java.util.List;

/**
 * Chain of Responsibility Pattern
 *
 * @Author: malone
 * @Date 2020/6/28 21:11
 */
public class InterceptorChain {
    List<Interceptor> interceptors = new ArrayList<>();
    java.util.Iterator<Interceptor> iterator;

    void plugin(Object object) {
        if (iterator == null) {
            iterator = interceptors.iterator();
        }
        if (iterator.hasNext()) {
            Interceptor next = iterator.next();
            next.intercept(object, this);
        }
    }

    void addInterceptor(Interceptor interceptor) {
        interceptors.add(interceptor);
    }
}
