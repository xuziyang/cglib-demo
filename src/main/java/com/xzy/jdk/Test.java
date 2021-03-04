package com.xzy.jdk;

public class Test {
    public static void main(String[] args) {
        //代理类生成时将自动将生成的代理类写入硬盘
        System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");
        
        Calculator proxy = CalculatorProxy.getProxy(new MyCalculator());
        int result = proxy.add(1, 1);
        System.out.println("result = " + result);
    }
}