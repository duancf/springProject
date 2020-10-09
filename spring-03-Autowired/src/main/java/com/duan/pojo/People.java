package com.duan.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class People {
    /*
    @Resource注解  @Autowired注解
    1、都可用来自动装配，都可放在属性字段上
    2、@Autowired通过byType实现
    3、@Resource 默认通过byName实现，若找不到名字，则通过byType实现，两种都找不到报错
     */
    @Autowired  //注解实现自动装配，也可以加在Set方法前 ；使用注解可以省略Set方法，通过反射实现；
    private Cat cat;
    @Autowired //(required = false) //required默认值为true，指定为false时，表示变量可为空
    @Qualifier(value = "dog")      //Qualifier 指定具体变量
    private Dog dog;
    private String name;

    public Cat getCat() {
        return cat;
    }

//    public void setCat(Cat cat) {
//        this.cat = cat;
//    }

    public Dog getDog() {
        return dog;
    }

//    public void setDog(Dog dog) {
//        this.dog = dog;
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "People{" +
                "cat=" + cat +
                ", dog=" + dog +
                ", name='" + name + '\'' +
                '}';
    }
}
