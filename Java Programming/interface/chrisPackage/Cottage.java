package chrisPackage;

//In the interface all method are abstract
//All method are public in default

public class Cottage extends Building implements Flyable
{
    public Cottage()
    {
        System.out.println("parcelle in place..");
    }

    public void build(String material)
    {
        System.out.println("construction du batiment"+ material);
    }

    public void fly(String energy)
    {
        System.out.println("i'm going in the air by "+energy);
    }
    public void test()
    {
        System.out.println("My proper test implementation!");
    }
}