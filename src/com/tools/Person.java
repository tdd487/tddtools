package com.tools;

public class Person {
    private int age = 10;
    public Person(){
        System.out.println("初始化年龄："+age);
    }
    public int GetAge(int age){
        this.age = age;
        return this.age;
    }
    public int getBum (int df){
        return age+df;
    }
}
