package chrisPackage;

public class Ship extends Vehicule implements Flyable
{
    public Ship()
    {
        this.mMovementSpeed = 16;
    }

    public void moveXY(int x, int y) 
    {
        System.out.println("The navire is move on"+x+", "+y);    
    }

    public void fly(String energy)
    {
        System.out.println("I move in the air with "+ energy);
    }
}