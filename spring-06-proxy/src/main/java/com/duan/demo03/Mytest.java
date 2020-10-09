package com.duan.demo03;

public class Mytest {
    public static void main(String[] args) {
        //真实角色
        Host host = new Host();
        //代理角色，不存在的
        ProxyInvocationHandle pih = new ProxyInvocationHandle();
        pih.setTaget(host);

        Rent rent = (Rent) pih.getProxy();
        rent.rent();
    }
}
