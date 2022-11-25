public class Cat 
{
    public Cat(String name, int age) //constructeur
    {
        this.mName = name; //
        this.mAge = age;
        
        System.out.println(this.mName + " & "+ this.mAge); //this refer to different object

    }
    //those are attributes
    private String mName;
    private int mAge;
}
//An attribute is a variable that belong to a class
//Method are things a class can do (functions)





