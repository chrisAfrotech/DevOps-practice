package com.Designpaternwithmosh;

public class User {
    private final String name;
    public User(String name ){
        this.name = name; //the parameter refers to the methods accessible in this function

    }
    //Methods of this function
    public void sayHello(){
        System.out.println("Hi, my name is " + this.name);
    }
}
