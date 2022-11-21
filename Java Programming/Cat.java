public class Cat 
{
    public Cat(String name, int age) //constructeur
    {
        this.name = name;
        this.age = age;
        
        System.out.println(this.name + " & "+ this.age); //this refer to different object

    }

    private String name;
    private int age;
}
//An attribute is a variable that belong to a class
//Method are things a class can do (functions)





