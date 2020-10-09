package com.duan.pojo;

public class User {
    private String name;
//    private User()
//    {System.out.println("User无参构造！");}
    private User(String name)
    {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void show()
    {
        System.out.println("name="+name);
    }
}
