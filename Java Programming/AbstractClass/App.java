import chrisAfrotech.*;

//class is abstract if the have at least one abstract method

public class App
{
    public static void main(String[] args) 
    {
        // LivingSpace ls = new LivingSpace();  //it will not work we don't intentiate abstract class
        Tiger ti = new Tiger();
        System.out.println(ti.whoAmI());
    }
}