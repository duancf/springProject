package com.duan.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//等价于<bean id="user" class="com.duan.pojo.User"/>
//@Component
@Component
public class User {

    //相当于<property name="name" value= "dcf"/>
    @Value("dcf")
    public String name ;
}
