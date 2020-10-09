package com.duan.demo02;

public class Person extends Animal {

    public Person(String name) {
        super(name);
    }

    @Override
    public void Eat()
    {
        System.out.println("人吃饭！");
    }
}
