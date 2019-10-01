package com.luxoft.gof.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by msokolov on 9/10/2015.
 */
public class SecurityProxy implements InvocationHandler {
    private final Object obj;

    public SecurityProxy(Object obj) {
        this.obj = obj;
    }

    public static TwitterService newInstance(Object obj) {
        return (TwitterService) Proxy.newProxyInstance(
                obj.getClass().getClassLoader(),
                obj.getClass().getInterfaces(),
                new SecurityProxy(obj)
        );
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result;
        try {
            if (method.getName().contains("post")) {
                throw new IllegalAccessException(
                        method.getName() + " method is currently not allowed"
                );
            }
            result = method.invoke(obj, args);
        } catch (InvocationTargetException e) {
            throw e.getTargetException();
        } catch (Exception e) {
            throw new RuntimeException(
                    "unexpected invocation exception: " + e.getMessage()
            );
        }
        return result;

    }
}
