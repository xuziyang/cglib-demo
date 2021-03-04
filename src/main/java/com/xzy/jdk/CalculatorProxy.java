package com.xzy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class CalculatorProxy {
    public static Calculator getProxy(Calculator calculator) {
        ClassLoader loader = calculator.getClass().getClassLoader();
        Class<?>[] interfaces = calculator.getClass().getInterfaces();
        
        InvocationHandler h = (proxy, method, args) -> {
            Object result = null;
            if ("add".equals(method.getName())) {
                System.out.println("执行add方法");
            }
            result = method.invoke(calculator, args);
            return result;
        };
        Object proxy = Proxy.newProxyInstance(loader, interfaces, h);
        return (Calculator) proxy;
    }
}