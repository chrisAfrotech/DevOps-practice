import chrisPackage.*;

//interface provide contrat(menu) that will be use to compare type
//in default methods of an interface are abstract

public class App
{
    public static void main(String[] args) 
    {
        Cottage c = new Cottage();
        Ship s = new Ship();

        c.fly("hydrogene");
        s.fly("malla gengs");

        //implementation of the defalut method whatever those classes are not properly implement it!
        c.test();
        s.test();
    }
}