package Decorator;

public class Peanuts extends IcecreamExtension{
    public Peanuts(Icecream Icecream) {
        this.Icecream = Icecream;
    }
    
    public String description(){
        return "Peanuts";
    }

    public Double cost(){
        return this.Icecream.cost() + 1.00;
    } 
}