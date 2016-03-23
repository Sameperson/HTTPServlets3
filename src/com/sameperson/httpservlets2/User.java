package com.sameperson.httpservlets2;


public class User {

    private String name;
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public User() {}


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        if(age<18) return "Young";
        else return "Adult";
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isYoung() {
        return age<18;
    }
}
