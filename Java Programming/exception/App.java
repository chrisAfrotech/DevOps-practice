import java.util.InputMismatchException;
import java.util.Scanner;

public class App
{
/* hierachy of exceptions
    * Throwable
    * Exception
    * RuntimeException
    * NoSuchElementException
    * InputRunnerException 
*/

/* most used function of the "e" exception
    *  e.printStackTrack() : show the stack of error that you can use to fix exception
    *  e.getMessage() : retrun the message at the exception
*/

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);  
        
        try 
        {
            System.out.println("Birth year!");
            int year;
            int yearOfBirth = sc.nextInt();
            
            year = 2022 - yearOfBirth;
            
            System.out.println("You were born in: " + year);    
        } 
        catch (InputMismatchException e) 
        {
            System.out.println("The birth year is invalid! try again!!");    
            System.out.println("Error: " + e.getMessage());
        }
        finally //this block will be execute wha tever there is an exception or not before close the program
        {
            System.out.println("ok done!");
        }
    }
}
