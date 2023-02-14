package Decorator;

public class Vanilla implements Icecream{
    public String description(){
        return "vanilla Icecream";
    }

    public Double cost(){
        return 5.00;
    } 
}