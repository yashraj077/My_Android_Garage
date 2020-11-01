package com.asudsc.gsondemo;

public class UserCase2 {

    private String name;
    private int age;
    private String email;
    private boolean isDeveloper;
    private UserAddress userAddress;

    public String toString(){
        return name+" "+age+" "+email+" "+isDeveloper+" "+userAddress.toString();
    }
}

class UserAddress{
    private String city;
    private String country;
    private String houseNumber;
    private String street;

    public String toString(){
        return "Address: "+city+" "+country+" "+houseNumber+" "+street;
    }
}