//Class can be seen as a model of construction for an entity, concept or an idea.
//we don't specify the directory of the file call here because they are in the same repository
public class App 
{
    public static void main(String[] args)
    {
        Cat miaou = new Cat("vision", 3); //instantiation of the cat object that'll be store in the variable miaou
        // Cat miaou2 = new Cat(); 
        
        progMethod(); //first call of the method in the main   
        String message = getMessage("Master java with Christophe");  //This is the method that give somthing back
        System.out.println(message);
    
        //Overloading methods
        System.out.println(sum(2,9));
        System.out.println(sum(2.5558,0.99));

    }
   
    //Write Static function means that the function is only available in this class
    //Method doesn't give something back!
    public static void progMethod()
    {
        System.out.println("Bonjour..");
    }

    //Method that give something back!
    public static String getMessage(String msg)
    {
        System.out.println(msg);
        return msg;
    }

    /*******Overload(Surchage) of method**********/
    //Overload of method means that the same method can be use with different parameters
    public static int sum (int a, int b)
    {
        return a + b;
    }

    public static double sum (double a, double b)
    {
        return a + b;
    }
    /***********************************/

}