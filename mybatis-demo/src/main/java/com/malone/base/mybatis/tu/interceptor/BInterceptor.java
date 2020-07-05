package com.malone.base.mybatis.tu.interceptor;

import org.apache.ibatis.executor.statement.StatementHandler;
import org.apache.ibatis.plugin.*;

import java.sql.Connection;
import java.util.Properties;

/**
 * @Author: malone
 * @Date 2020/7/5 15:22
 */
@Intercepts({@Signature(type = StatementHandler.class, method = "prepare", args = {Connection.class, Integer.class})})
public class BInterceptor implements Interceptor {

    @Override
    public Object plugin(Object target) {
        if (target instanceof StatementHandler) {
            return Plugin.wrap(target, this);
        }
        return target;
    }

    @Override
    public void setProperties(Properties properties) {

    }

    @Override
    public Object intercept(Invocation invocation) throws Throwable {
        System.out.println("BInterceptor");
        return invocation.proceed();
    }
}
