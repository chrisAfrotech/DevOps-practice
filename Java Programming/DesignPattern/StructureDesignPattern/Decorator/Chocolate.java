package Decorator;

public class Chocolate extends IcecreamExtension{
    public Chocolate(Icecream Icecream) {
        this.Icecream = Icecream;
    }
    
    public String description(){
        return "Chocolate";
    }

    public Double cost(){
        return this.Icecream.cost() + 2.00;
    } 
}