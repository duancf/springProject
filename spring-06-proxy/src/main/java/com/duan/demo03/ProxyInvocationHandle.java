package com.duan.demo03;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyInvocationHandle implements InvocationHandler {

    //被代理的接口
    private Object taget;

    public void setTaget(Object taget) {
        this.taget = taget;
    }

    //生成代理类
    public Object getProxy(){
        return Proxy.newProxyInstance(this.getClass().getClassLoader(),
                taget.getClass().getInterfaces(), this);
    }

    //处理代理实例， 并返回结果
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable{
        Object result = method.invoke(taget, args);
        return result;
    }
}
