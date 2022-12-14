package chrisPackage;

//In the interface all method are abstract
//All method are public in default

interface Flyable
{
    public void fly(String energy);
    // public void boost (int x);

    //this method will be implement by default in all class which implement it!
    default public void test()
    {
        System.out.println("test");
    } 
}