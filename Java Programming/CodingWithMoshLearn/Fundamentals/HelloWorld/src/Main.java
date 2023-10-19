import java.awt.*;
import java.lang.reflect.Array;
import java.sql.SQLOutput;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;


// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        //primitives types used to store simple value such as (numbers cahracters and booleans)
//       byte age = 30;
//       long viewsCount = 123_456_789_958l;
//       float price = 10.99f;
//       char letter = 'A';
//       boolean isEligible = false;

       //References types to store complex object such as(data, mail message)
        // when crating reference type you need to allocate memory
//        Date now = new Date();
//        System.out.println(now);
//
//        byte x = 1;
//        byte y = x;
//        x=2;
//        System.out.println(y);
//        Point point1 = new Point(1, 1);
//        Point point2 = point1;
//        point1.x= 2;
//        System.out.println(point2);
        //parameters are the holds we define in a method while arguments are value we pass to that method.

//        String message = " File located in c:\tlinux\\...      Hello \"christophe\" " + "!!           ";
////        System.out.println(message.startsWith("!!"));
//        System.out.println(message.replace("!", "*"));
//        System.out.println(message);
//        System.out.println(message.toLowerCase());
//        System.out.println(message.toUpperCase());
//        System.out.println(message.trim());

        /*************Array****************/
//        int [] numbers = {2,3,5,1,8};
//        Arrays.sort(numbers);
//        System.out.println(Arrays.toString(numbers));
//        System.out.println(numbers.length);

        /***************Constants**************/
        //Always use capital letter to store constants
//            final float PI = 3.14F;
////            PI=89;
//        System.out.println(PI);

        /*************Arithmetics expression*/
//        int x=1;
//        int y = x++;
//        //this post fixed expression will not apply on y
//        //This prefixed expression will apply on x
//        System.out.println(x);
//        System.out.println(y);
        ////////
//        int x=1;
//        int y = ++x;
//        //this prefixed expression will not apply on y
//        //This prefixed expression will apply on x
//        System.out.println(x);
//        System.out.println(y);
    // order expressions
//        (), */, +- have the most priority
        //you can use parenthesis to give priority to elements in the expression
//        int x = (10+3)*2;
//        System.out.println(x);

        //**********casting var
            //implicit casting
            //byte > short > int > long
//            double x=1.5;
//            double y = x+2;
//        System.out.println(y);

        //Explicit casting
        //byte > short > int > long > float > double
//        double x = 1.1;
//        int y = (int)x + 2;
//        System.out.println(y);

    //***casting string caracter
//        String x = "5.6";
//        Double y = Double.parseDouble(x) + 2;
//        System.out.println(y);
//
        //********Performing java mathematics operations
//            int result = Math.round(1.F); //whch round to non double
//            int result = (int)Math.ceil(1.1F);   //whcih return the smallest integer greater or equal to this value
//            int result = (int)Math.floor(1.F);   //which return the largest number which is smaller or equal to this value
//            int result = Math.max(5,69);    //return the maximum
//            int result = (int)(Math.random() * 100); //return a random value form 0 to 100
//            System.out.println(result);
//
//        //*********Formating number
//        //we can use shift + F6 to refactoring and rename quicly that method
//        String result = percent.NumberFormat.getCurrencyInstance().format(0.1);;
//        System.out.println(result);String result = percent.NumberFormat.getCurrencyInstance().format(0.1);;
//        System.out.println(result);

        //Read text in console
//        System.out.print("Enter age:");
//        String fullName = scanner.nextLine().trim();
//        System.out.println("You're age is: " + fullName);


        //Project:
        // Build a mortgage calculator
        //1. What is the amount of loan you want to get (eg: 100000) "P"
        //2. Annual interest rate (eg: 3.92%) "r"
        //3. Period of mortgage (eg: 30 years) "n"
        //4. Calculate the MORTGAGE: "M"

//        M = p((r(1+r)^n) / ((1+r)^n)-1)
        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;

        Scanner scanner = new Scanner(System.in);

        System.out.println("************Mortgage calculator***************\n");

        System.out.print("1. What is the principal amount you want to loan? ");
        int principal = scanner.nextInt();

        System.out.print("2. What is the annual interest rate? ");
        float annualInterest = scanner.nextFloat();
        float monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR;

        System.out.println("3. Which Period of mortgage do you need? (in YEARS)");
        byte years = scanner.nextByte();
        int numberOfPayments = years * MONTHS_IN_YEAR;

        Double mortgage = principal
                            *(monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments))
                            /(Math.pow(1+monthlyInterest, numberOfPayments) - 1);

        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);

        System.out.println("Mortgage: " + mortgageFormatted );

//        r=r*12
//        M = p((r(1+r)^n) / ((1+r)^n)-1);
//
//        System.out.println(M);


        //nb: Avoid magic number in your code just use constant to reference it or variables
        // Always use descriptive name in the code to manipulate our code, avoid the using of name as m1. ml or non sense name



    }
}