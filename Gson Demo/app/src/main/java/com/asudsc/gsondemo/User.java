package com.asudsc.gsondemo;

public class User {

    private String name;
    private int age;
    private String email;
    private boolean isDeveloper;

    public String toSting(){
        return name +" "+ age +" "+ email+" "+isDeveloper;
    }
}
