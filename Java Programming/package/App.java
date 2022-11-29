import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.System.Logger.Level;
import java.util.Scanner;

import mypackage.*;
// Package is just like a repository that have a special name!

public class App
{

    /*Ask user content (read in keyboard)
     * BufferdReader  = synchrone;
     *                  thread safe
     *                  lecture of string
     * 
     *          -read(): read character
     *          -readline(): read character
     *          -skip(N): ignore N character
     * 
     * Scanner = Asynchrone
     *          not thread safe
     *          lecture of data + parsing
     *      
     *      -nextLine()
     *      -nextChar()
     *      -nextByte()
     *      -nextDouble()
     *      -nextInt()
     *      -nextBoolean()  
     */

   public static void main(String[] args) throws Exception
   {
        Player p = new Player();
        Item it = new Item();
        
    /*************BufferedReader*********** */
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        System.out.println("What is your name?");
        String name  = br.readLine();

        System.out.println(name + " you are already on the way to master Java language HOLD ON!!");
     /*************BufferedReader*********** */

      /*************Scanner*************/
      Scanner sc = new Scanner(System.in);  
      System.out.println("Acces to with Level?");

      int gameLevel = sc.nextInt();
      System.out.println("You are in level: " + gameLevel);

       /*************Scanner************/
    }
}